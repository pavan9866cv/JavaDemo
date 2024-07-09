package com.javaDemo.package1;

import java.util.Comparator;

public class ComparatorLambdaExample {
	public static void main(String... args) {
		// before java8
		Comparator<Integer> c1 = new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		System.out.println(c1.compare(4, 5));

		// after java8

		Comparator<Integer> c2 = (x, y) -> x.compareTo(y);
		System.out.println(c2.compare(4, 5));

		Comparator<Integer> c3 = (a, b) -> {
			int value = a.compareTo(b);
			return value;
		};
		System.out.println(c3.compare(3, 3));

	}

}
