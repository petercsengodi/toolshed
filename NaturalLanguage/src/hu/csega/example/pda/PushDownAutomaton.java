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
		AWAITING_SOMETHING,
		INSIDE_OBJECT,
		END_OF_OBJECT,
		INSIDE_ARRAY,
		END_OF_ARRAY,
		GOT_KEY,
		GOT_SEMICOLON,
		GOT_COMMA
	}


	public Expression parseAndReturnAbstractSyntaxTree(List<Token> tokens) {
		if(tokens == null || tokens.size() == 0)
			return new LangString(new Token(Type.STRING_TOKEN, ""));

		Iterator<Token> iterator = tokens.iterator();
		Token token = iterator.next();

		while(true) {
			if(!iterator.hasNext())
				throw new RuntimeException("Unexpected end of file!");
			token = iterator.next();

			switch(state) {

			case AWAITING_SOMETHING:
				break;

			case INSIDE_OBJECT:
				if(token.getType() == Type.CLOSE_OBJECT) {

					Expression exp = stack.pop();
					if(exp instanceof LangObject) {
						if(stack.isEmpty()) {
							if(iterator.hasNext())
								throw new RuntimeException("Invalid upcoming token: " + token);
							else
								return exp;
						} else {
							stack.peek().getChildren().add(exp);
							state = State.END_OF_BLOCK;
						}
					} else {
						throw new RuntimeException("Should close object!");
					}

				} else if(token.getType() == Type.STRING_TOKEN) {

					Expression exp = new LangKeyValuePair();
					exp.getChildren().add(new LangString(token));
					stack.push(exp);
					state = State.GOT_KEY;

				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case END_OF_OBJECT:
				if(token.getType() == Type.CLOSE_OBJECT) {

					Expression exp = stack.pop();
					if(exp instanceof LangObject) {
						if(stack.isEmpty()) {
							if(iterator.hasNext())
								throw new RuntimeException("Invalid upcoming token: " + token);
							else
								return exp;
						} else {
							stack.peek().getChildren().add(exp);
							state = State.END_OF_BLOCK;
						}
					} else {
						throw new RuntimeException("Should close object!");
					}

				} else if(token.getType() == Type.ENUMERATION_SIGN) {
					state = State.INSIDE_OBJECT;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case GOT_KEY:
				if(token.getType() == Type.KEY_VALUE_PAIR_SIGN) {
					state = State.GOT_SEMICOLON;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case GOT_SEMICOLON:
				if(token.getType() == Type.OPEN_OBJECT) {
					Expression exp = new LangObject();
					stack.push(exp);
					state = State.INSIDE_OBJECT;
				} else if(token.getType() == Type.OPEN_ARRAY) {
					Expression exp = new LangArray();
					stack.push(exp);
					state = State.INSIDE_ARRAY;
				} else if(token.getType() == Type.STRING_TOKEN) {
					stack.peek().getChildren().add(new LangString(token));
					state = State.END_OF_OBJECT;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case GOT_COMMA:
				if(token.getType() == Type.OPEN_OBJECT) {
					Expression exp = new LangObject();
					stack.push(exp);
					state = State.INSIDE_OBJECT;
				} else if(token.getType() == Type.OPEN_ARRAY) {
					Expression exp = new LangArray();
					stack.push(exp);
					state = State.INSIDE_ARRAY;
				} else if(token.getType() == Type.STRING_TOKEN) {
					LangString exp = new LangString(token);

					if(stack.size() == 0) {

						if(iterator.hasNext())
							throw new RuntimeException("Invalid upcoming token: " + token);
						else
							return exp;

					} else {
						Expression parent = stack.peek();
						parent.getChildren().add(exp);
						if(parent instanceof LangKeyValuePair)
							state = State.END_OF;
					}

				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case INSIDE_ARRAY:
				if(token.getType() == Type.CLOSE_ARRAY) {

					Expression exp = stack.pop();
					if(exp instanceof LangArray) {
						if(stack.isEmpty()) {
							if(iterator.hasNext())
								throw new RuntimeException("Invalid upcoming token: " + iterator.next());
							else
								return exp;
						} else {
							stack.peek().getChildren().add(exp);
							state = State.END_OF_BLOCK;
						}
					} else {
						throw new RuntimeException("Should close object!");
					}

				} else if(token.getType() == Type.STRING_TOKEN) {

					Expression exp = new LangKeyValuePair();
					exp.getChildren().add(new LangString(token));
					stack.push(exp);
					state = State.GOT_KEY;

				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			case END_OF_ARRAY:
				if(token.getType() == Type.CLOSE_ARRAY) {

					Expression exp = stack.pop();
					if(exp instanceof LangArray) {
						if(stack.isEmpty()) {
							if(iterator.hasNext())
								throw new RuntimeException("Invalid upcoming token: " + token);
							else
								return exp;
						} else {
							stack.peek().getChildren().add(exp);
							state = State.END_OF_BLOCK;
						}
					} else {
						throw new RuntimeException("Should close object!");
					}

				} else if(token.getType() == Type.ENUMERATION_SIGN) {
					state = State.INSIDE_ARRAY;
				} else {
					throw new RuntimeException("Invalid upcoming token: " + token);
				}
				break;

			default:
				throw new RuntimeException("Can't handle state: " + state);

			} // end of switch


		}

		throw new RuntimeException("This part of the code should not be accessed!");
	}

	private State state = State.AWAITING_SOMETHING;
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
		ret.add(new Token(Type.CLOSE_OBJECT, "}"));

		return ret;
	}

}
