package com.javaDemo.package1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctinalInterfacesExamples {

	public static void main(String... args) {
		
		Demo1.print();
		// consumer accepts one parameter only
		Consumer<String> c1=a->System.out.println(a.toUpperCase());
		c1.accept("pavan");
		
		Consumer<String> c2= b->System.out.println(b.toUpperCase());
		c2.accept("sai");
		c1.andThen(c2).accept("Teja");
		// Biconsuer accepts two parameters.
		BiConsumer<Integer,Integer> bc1=(a,b)->System.out.println(a+b);
		bc1.accept(10, 20);
		
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