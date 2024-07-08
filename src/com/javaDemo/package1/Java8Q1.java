package com.javaDemo.package1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Java8Q1 {

	public static void main(String... args) {
		List<Integer> l1 = Arrays.asList(2, 3, 87, 1, 34, 22, 9);
		List<Integer> doubledValues = l1.stream().map(a -> a * a).toList();
		// doubledValues.stream().forEach(System.out::println);

		Stream<Integer> stream = l1.stream();
		stream.forEach(System.out::println);
		
		Set<String> w = new HashSet<>(Arrays.asList("It's a wonderful day for pie!".split(" ")));
		w.stream().map(x->x+" ").forEach(System.out::println);
		
		
	}

}
