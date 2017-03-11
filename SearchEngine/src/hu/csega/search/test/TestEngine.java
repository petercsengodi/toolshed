package hu.csega.search.test;

import java.util.List;

import hu.csega.search.util.ContentAndNormalized;

public class TestEngine {

	public static void main(String[] args) {

		System.out.println("--- TEST 1 ---");

		TestStorage storage1 = new TestStorage();
		String test1_1 = "Hello World";
		storage1.add(test1_1);

		String search1 = "world hello";

		List<ContentAndNormalized> result1 = storage1.search(search1);

		for(ContentAndNormalized can : result1) {
			System.out.println("Result: " + can.getContent() + " / " + can.getNormalized());
		}

		boolean success1 = false;
		if(result1.size() == 1 && result1.get(0).getContent().equals(test1_1))
			success1 = true;

		System.out.println("test 1: " + (success1 ? "OK" : "NOT OK"));
	}

}
