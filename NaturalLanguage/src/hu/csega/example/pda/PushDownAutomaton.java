package hu.csega.example.pda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PushDownAutomaton {

	public enum Type {
		OPEN_OBJECT,
		CLOSE_OBJECT,
		OPEN_ARRAY,
		CLOSE_ARRAY,
		ENUMERATION_SIGN,
		KEY_VALUE_PAIR_SIGN,
		STRING_TOKEN
	}

	public static class Token {
		protected Token(Type type, String content) {
			this.type = type;
			this.content = content;
		}

		public String getContent() {
			return content;
		}

		public Type getType() {
			return type;
		}

		@Override
		public String toString() {
			return "[TYPE: " + type + " CONTENT: " + content + "]";
		}

		private String content;
		private Type type;
	}

	public static abstract class Expression {

		protected Expression(Token token) {
			this.token = token;
		}

		public Token getToken() {
			return token;
		}

		public List<Expression> getChildren() {
			return children;
		}

		public abstract void execute();

		public abstract void print();

		@Override
		public String toString() {
			return this.getClass().getSimpleName();
		}

		protected Type type;
		protected Token token;
		protected List<Expression> children = new ArrayList<>();
	}

	public static class LangObject extends Expression {
		public LangObject() {
			super(null);
		}

		@Override
		public void execute() {
			// some object-specific logic
		}

		@Override
		public void print() {
			System.out.print("{ ");
			boolean first = true;
			for(Expression child : children) {
				if(first)
					first = false;
				else
					System.out.print(", ");

				child.print();
			}
			System.out.print(" }");
		}
	}

	public static class LangArray extends Expression {
		public LangArray() {
			super(null);
		}

		@Override
		public void execute() {
			// some object-specific logic
		}

		@Override
		public void print() {
			System.out.print("[ ");
			boolean first = true;
			for(Expression child : children) {
				if(first)
					first = false;
				else
					System.out.print(", ");

				child.print();
			}
			System.out.print(" ]");
		}
	}

	public static class LangKeyValuePair extends Expression {
		public LangKeyValuePair() {
			super(null);
		}

		@Override
		public void execute() {
			// some object-specific logic
		}

		@Override
		public void print() {
			boolean first = true;
			for(Expression child : children) {
				if(first)
					first = false;
				else
					System.out.print(": ");

				child.print();
			}
		}
	}

	public static class LangString extends Expression {
		public LangString(Token token) {
			super(token);
		}

		@Override
		public void execute() {
			// some object-specific logic
		}

		@Override
		public void print() {
			System.out.print("\"");
			System.out.print(token.getContent().replace("\\", "\\\\").replace("\"", "\\\""));
			System.out.print("\"");
		}
	}

	public enum State {
		START,
		OBJECT_STARTED,
		OBJECT_GOT_KEY,
		OBJECT_GOT_SEMICOLON,
		OBJECT_GOT_VALUE,
		OBJECT_GOT_COMMA,
		ARRAY_STARTED,
		ARRAY_GOT_ITEM,
		ARRAY_GOT_COMMA,
		SUCCESSFUL,
		ERROR
	}

	public Expression parseAndReturnAbstractSyntaxTree(List<Token> tokens) {
		try {
			Expression ret = process(tokens);
			state = State.SUCCESSFUL;
			return ret;
		} catch(RuntimeException ex) {
			state = State.ERROR;
			throw ex;
		}
	}

	public Expression process(List<Token> tokens) {
		if(tokens == null || tokens.size() == 0)
			return new LangString(new Token(Type.STRING_TOKEN, ""));

		Iterator<Token> iterator = tokens.iterator();
		while(iterator.hasNext()) {
			Token token = iterator.next();

			switch(state) {

			case START:
				if(token.getType() == Type.OPEN_OBJECT) {

					Expression exp = new LangObject();
					stack.push(exp);
					state = State.OBJECT_STARTED;

				} else if(token.getType() == Type.OPEN_ARRAY) {

					Expression exp = new LangArray();
					stack.push(exp);
					state = State.ARRAY_STARTED;

				} else if(token.getType() == Type.STRING_TOKEN) {

					Expression exp = new LangString(token);
					if(iterator.hasNext())
						throw new RuntimeException("Invalid upcoming token: " + token);
					else
						return exp;

				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case OBJECT_STARTED:
				if(token.getType() == Type.CLOSE_OBJECT) {
					Expression exp = stack.pop();

					if(stack.isEmpty()) {
						if(iterator.hasNext())
							throw new RuntimeException("Invalid upcoming token: " + token);
						else
							return exp;
					}

					stack.peek().getChildren().add(exp);
				} else if(token.getType() == Type.STRING_TOKEN) {
					Expression exp = new LangKeyValuePair();
					exp.children.add(new LangString(token));
					stack.push(exp);
					state = State.OBJECT_GOT_KEY;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case OBJECT_GOT_KEY:
				if(token.getType() == Type.KEY_VALUE_PAIR_SIGN) {
					state = State.OBJECT_GOT_SEMICOLON;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case OBJECT_GOT_SEMICOLON:
				if(token.getType() == Type.OPEN_OBJECT) {
					Expression exp = new LangObject();
					stack.push(exp);
					state = State.OBJECT_STARTED;
				} else if(token.getType() == Type.OPEN_ARRAY) {
					Expression exp = new LangArray();
					stack.push(exp);
					state = State.ARRAY_STARTED;
				} else if(token.getType() == Type.STRING_TOKEN) {
					Expression exp = new LangString(token);
					Expression keyAndValue = stack.pop();
					keyAndValue.getChildren().add(exp);
					stack.peek().getChildren().add(keyAndValue);
					state = State.OBJECT_GOT_VALUE;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case OBJECT_GOT_VALUE:
				if(token.getType() == Type.CLOSE_OBJECT) {
					Expression object = stack.pop();

					if(stack.isEmpty()) {

						if(iterator.hasNext())
							throw new RuntimeException("Invalid upcoming token: " + token);
						else
							return object;

					} else {

						Expression top = stack.peek();
						top.getChildren().add(object);
						if(top instanceof LangKeyValuePair) {
							stack.pop();
							stack.peek().getChildren().add(top);
							state = State.OBJECT_GOT_VALUE;
						} else if(top instanceof LangArray) {
							state = State.ARRAY_GOT_ITEM;
						} else {
							throw new IllegalStateException("Stack peek should be either object or array!");
						}

					}

				} else if(token.getType() == Type.ENUMERATION_SIGN) {
					state = State.OBJECT_GOT_COMMA;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case OBJECT_GOT_COMMA:
				if(token.getType() == Type.STRING_TOKEN) {
					Expression exp = new LangKeyValuePair();
					exp.children.add(new LangString(token));
					stack.push(exp);
					state = State.OBJECT_GOT_KEY;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case ARRAY_STARTED:
				if(token.getType() == Type.CLOSE_ARRAY) {
					Expression exp = stack.pop();

					if(stack.isEmpty()) {
						if(iterator.hasNext())
							throw new RuntimeException("Invalid upcoming token: " + token);
						else
							return exp;
					}

					stack.peek().getChildren().add(exp);
				} else if(token.getType() == Type.OPEN_OBJECT) {
					Expression exp = new LangObject();
					stack.push(exp);
					state = State.OBJECT_STARTED;
				} else if(token.getType() == Type.OPEN_ARRAY) {
					Expression exp = new LangArray();
					stack.push(exp);
					state = State.ARRAY_STARTED;
				} else if(token.getType() == Type.STRING_TOKEN) {
					Expression exp = new LangString(token);
					stack.peek().getChildren().add(exp);
					state = State.ARRAY_GOT_ITEM;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case ARRAY_GOT_ITEM:
				if(token.getType() == Type.CLOSE_ARRAY) {
					Expression array = stack.pop();

					if(stack.isEmpty()) {

						if(iterator.hasNext())
							throw new RuntimeException("Invalid upcoming token: " + token);
						else
							return array;

					} else {

						Expression top = stack.peek();
						top.getChildren().add(array);
						if(top instanceof LangKeyValuePair) {
							stack.pop();
							stack.peek().getChildren().add(top);
							state = State.OBJECT_GOT_VALUE;
						} else if(top instanceof LangArray) {
							state = State.ARRAY_GOT_ITEM;
						} else {
							throw new IllegalStateException("Stack peek should be either key-value-pair or array!");
						}

					}

				} else if(token.getType() == Type.ENUMERATION_SIGN) {
					state = State.ARRAY_GOT_COMMA;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case ARRAY_GOT_COMMA:
				if(token.getType() == Type.STRING_TOKEN) {
					Expression exp = new LangString(token);
					stack.peek().getChildren().add(exp);
					state = State.ARRAY_GOT_ITEM;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			default:
				throw new RuntimeException("Can't handle state: " + state);

			} // end of switch

		} // end while

		throw new RuntimeException("Unexpected end of file!");
	}

	private State state = State.START;
	private Stack<Expression> stack = new Stack<>();

	public static void main(String[] args) {
		List<Token> tokens = preProcessedContent();

		PushDownAutomaton pda = new PushDownAutomaton();
		Expression exp = pda.parseAndReturnAbstractSyntaxTree(tokens);

		exp.print();
	}

	public static List<Token> preProcessedContent() {
		// normally this would be a result of pre-processing the source content

		// Content: { "Hello" : [ "World", "!" ] }

		List<Token> ret = new ArrayList<>();

		ret.add(new Token(Type.OPEN_OBJECT, "{"));
		ret.add(new Token(Type.STRING_TOKEN, "Hello"));
		ret.add(new Token(Type.KEY_VALUE_PAIR_SIGN, ":"));
		ret.add(new Token(Type.OPEN_ARRAY, "["));
		ret.add(new Token(Type.STRING_TOKEN, "World"));
		ret.add(new Token(Type.ENUMERATION_SIGN, ","));
		ret.add(new Token(Type.STRING_TOKEN, "!"));
		ret.add(new Token(Type.CLOSE_ARRAY, "]"));
		ret.add(new Token(Type.ENUMERATION_SIGN, ","));
		ret.add(new Token(Type.STRING_TOKEN, "This"));
		ret.add(new Token(Type.KEY_VALUE_PAIR_SIGN, ":"));
		ret.add(new Token(Type.OPEN_OBJECT, "{"));
		ret.add(new Token(Type.STRING_TOKEN, "is"));
		ret.add(new Token(Type.KEY_VALUE_PAIR_SIGN, ":"));
		ret.add(new Token(Type.STRING_TOKEN, "test!"));
		ret.add(new Token(Type.CLOSE_OBJECT, "}"));
		ret.add(new Token(Type.CLOSE_OBJECT, "}"));

		return ret;
	}

}
