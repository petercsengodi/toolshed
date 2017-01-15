package hu.csega.nlp.ndsa;

public class NDSAWalker implements Cloneable {

	public NDSAState currentState = null;
	public StringBuilder builder = new StringBuilder("|");

	public void addCharacter(char ch) {
		builder.append(ch);
	}

	public void addWord(String word) {
		builder.append('[').append(word).append(']').append('|');
	}

	@Override
	protected NDSAWalker clone() throws CloneNotSupportedException {
		NDSAWalker other = (NDSAWalker)super.clone();
		other.builder = new StringBuilder(this.builder.toString());
		return other;
	}
}
