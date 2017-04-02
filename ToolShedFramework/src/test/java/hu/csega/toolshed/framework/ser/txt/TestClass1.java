package hu.csega.toolshed.framework.ser.txt;

import java.util.ArrayList;
import java.util.List;

public class TestClass1 {

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<TestClass2> getList() {
		return list;
	}

	public void setList(List<TestClass2> list) {
		this.list = list;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	private String value;
	private List<TestClass2> list = new ArrayList<>();
	private List<Integer> numbers = new ArrayList<>();

}
