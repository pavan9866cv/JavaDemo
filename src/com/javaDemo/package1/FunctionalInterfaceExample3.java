package com.javaDemo.package1;

public class FunctionalInterfaceExample3 {
	public static void main(String... args) {

		StringFormatter s = (a, b) -> {
			String n = a + " " + b;
			return n;
		};
		System.out.println(s.format("Lambda", "Expression"));

	}

}

@FunctionalInterface
interface StringFormatter {

	String format(String string1, String string2);

}
