package hu.csega.toolshed.example.parsing;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

	public static void main(String[] args) {
		String input = "Hello    \"World of everyone\", this is parsing a line!";
		System.out.println("INPUT: " + input);

		StringParser parser = new StringParser();
		List<Token> tokens = parser.runFiniteStateMachine(input);

		if(parser.machineState == State.FINISHED) {
			System.out.println("Finite State Machine ran successfully!");
		} else {
			System.out.println("ERROR: " + parser.getErrorMessage());
		}

		for(Token t : tokens) {
			System.out.println(t);
		}
	} // end of main

	public static abstract class Token {
		public Token(String content) {
			this.content = content;
		}

		public String getContent() {
			return content;
		}

		private String content;
	}

	public static class Word extends Token {
		public Word(String content) {
			super(content);
		}

		@Override
		public String toString() {
			return "[WORD: " + getContent() + " ]";
		}
	}

	public static class StringLiteral extends Token {
		public StringLiteral(String content) {
			super(content);
		}

		@Override
		public String toString() {
			return "[STRING: " + getContent() + " ]";
		}
	}

	public enum CharacterType {
		BEGINNING,
		WHITESPACE,
		NORMAL_CHARACTER,
		END;
	}

	public static class CharacterElement {

		public CharacterElement(CharacterType type, char character) {
			this.type = type;
			this.character = character;
		}

		public CharacterType getType() {
			return type;
		}

		public char getCharacter() {
			return character;
		}

		private CharacterType type;
		private char character;
	}

	public static class CharacterSupplier {

		public CharacterSupplier(String input) {
			this.input = input;
			this.position = -1;
		}

		public CharacterElement next() {
			if(position == -1) {
				position++;
				return new CharacterElement(CharacterType.BEGINNING, '^');
			}

			if(input == null || position >= input.length()) {
				return new CharacterElement(CharacterType.END, '$');
			}

			char c = input.charAt(position);
			position++;

			if(Character.isWhitespace(c)) {
				return new CharacterElement(CharacterType.WHITESPACE, c);
			} else {
				return new CharacterElement(CharacterType.NORMAL_CHARACTER, c);
			}
		}

		private String input;
		private int position;
	}

	public enum State {
		START,
		PROCESSING_WORD,
		PROCESSING_STRING,
		ESCAPED_CHARACTER_IN_STRING,
		BETWEEN_WORDS,
		FINISHED,
		ERROR
	}

	public List<Token> runFiniteStateMachine(String input) {
		CharacterSupplier supplier = new CharacterSupplier(input);
		StringBuilder builder = new StringBuilder();
		List<Token> tokens = new ArrayList<>();

		while(machineState != State.FINISHED && machineState != State.ERROR) {
			CharacterElement element = supplier.next();

			switch(machineState) {
			case START:
				if(element.getType() == CharacterType.BEGINNING) {
					machineState = State.PROCESSING_WORD;
				} else {
					machineState = State.ERROR;
					errorMessage = "Developer error: \\^ character should arrive first from supplier!";
				}
				break;
			case PROCESSING_WORD:
				if(element.getType() == CharacterType.END) {
					if(builder.length() > 0) {
						tokens.add(new Word(builder.toString()));
						builder.setLength(0);
					}
					machineState = State.FINISHED;
				} else if(element.getType() == CharacterType.WHITESPACE) {
					if(builder.length() > 0) {
						tokens.add(new Word(builder.toString()));
						builder.setLength(0);
					}
					machineState = State.BETWEEN_WORDS;
				} else if(element.getCharacter() == '\"') {
					if(builder.length() > 0) {
						tokens.add(new Word(builder.toString()));
						builder.setLength(0);
					}
					machineState = State.PROCESSING_STRING;
				} else {
					builder.append(element.getCharacter());
				}
				break;
			case PROCESSING_STRING:
				if(element.getType() == CharacterType.END) {
					if(builder.length() > 0) {
						tokens.add(new StringLiteral(builder.toString()));
						builder.setLength(0);
					}
					machineState = State.ERROR;
					errorMessage = "String literal is not closed!";
				} else if(element.getCharacter() == '\"') {
					if(builder.length() > 0) {
						tokens.add(new StringLiteral(builder.toString()));
						builder.setLength(0);
					}
					machineState = State.BETWEEN_WORDS;
				} else if(element.getCharacter() == '\\') {
					machineState = State.ESCAPED_CHARACTER_IN_STRING;
				} else {
					builder.append(element.getCharacter());
				}
				break;
			case ESCAPED_CHARACTER_IN_STRING:
				if(element.getType() == CharacterType.END) {
					if(builder.length() > 0) {
						tokens.add(new StringLiteral(builder.toString()));
						builder.setLength(0);
					}
					machineState = State.ERROR;
					errorMessage = "String literal is not closed, also escaped character is interrupted!";
				} else {
					builder.append(element.getCharacter());
					machineState = State.PROCESSING_STRING;
				}
				break;
			case BETWEEN_WORDS:
				if(element.getType() == CharacterType.END) {
					machineState = State.FINISHED;
				} else if(element.getType() == CharacterType.WHITESPACE) {
					// stay in this state
				} else if(element.getCharacter() == '\"') {
					machineState = State.PROCESSING_STRING;
				} else {
					builder.append(element.getCharacter());
					machineState = State.PROCESSING_WORD;
				}
				break;
			default:
				break;
			}
		} // end while !finished

		return tokens;
	} // end of parse

	public State getMachineState() {
		return machineState;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	private State machineState = State.START;
	private String errorMessage = null;

}
