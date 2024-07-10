package com.javaDemo.package1;

import java.util.Optional;

public class OptionalExample {
	public static void main(String... args) {

		Optional<String> name = getName();
		if (name.isPresent()) {
			String upperCase = name.get().toUpperCase();
			System.out.println(upperCase);
		}
		else {
			System.out.println("value is empty");
		}

	}

	public static Optional<String> getName() {

		String name = null;
		Optional<String> value = null;
		if (name == null) {
			value = Optional.empty();
		} else {
			Optional.of(name);
		}

		return value;
	}

}
