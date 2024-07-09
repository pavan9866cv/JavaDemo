package com.javaDemo.package1;

import java.util.function.Consumer;

public class FunctinalInterfacesExamples {

	public static void main(String... args) {
		
		Demo1.print();
		Consumer<String> c1=a->System.out.println(a.toUpperCase());
		c1.accept("pavan");
		
		Consumer<String> c2= b->System.out.println(b.toUpperCase());
		c2.accept("sai");
		c1.andThen(c2).accept("Teja");
		
	}

}

@FunctionalInterface
interface Demo1 {

	void noArgument();
	static void print()
	{
		System.out.println("printing");
	}
}