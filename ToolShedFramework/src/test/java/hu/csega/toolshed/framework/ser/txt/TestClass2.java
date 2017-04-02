package hu.csega.toolshed.framework.ser.txt;

public class TestClass2 {

	public TestClass2() {
	}

	public TestClass2(int number, String text) {
		this.number = number;
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private int number;
	private String text;

}
