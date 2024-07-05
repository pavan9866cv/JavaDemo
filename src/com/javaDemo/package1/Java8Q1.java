package com.javaDemo.package1;

import java.util.Arrays;
import java.util.List;

public class Java8Q1 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 3, 87, 1, 34, 22, 9);
		List<Integer> doubledValues= l1.stream().map(a->a*a).toList();
		doubledValues.stream().forEach(System.out::println);
	}

}
