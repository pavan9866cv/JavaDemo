package com.javaDemo.package1;

abstract class AbstractClass {
	public AbstractClass() { // constructor
		System.out.println("You can create constructor in abstract class");
	}

	abstract int add(int a, int b); // abstract method
	

	int sub(int a, int b) { // non-abstract method
		return a - b;
	}

	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

public class AbstractClassExample extends AbstractClass {
	public int add(int a, int b) { // implementing abstract method
		return a + b;
	}
	
	public int sub(int a,int b)
	{
		return a-b-1;
	}
	static int multiply(int a,int b)
	{
		return a*b*10;
	}

	public static void main(String[] args) {
		AbstractClassExample a = new AbstractClassExample();
		int result1 = a.add(20, 10); // calling abstract method
		int result2 = a.sub(20, 10); // calling non-abstract method
		int result3 = a.multiply(20, 10); // calling static method
		int result4=AbstractClass.multiply(20, 10);
		System.out.println("Addition: " + result1);
		System.out.println("Substraction: " + result2);
		System.out.println("Multiplication: " + result3);
		System.out.println("mul frm abstract class "+ result4);
		
		// u can't override static method in . IF u add same method exactly in
		//to imp class, this method acts as another method but not as overridden 
		//method from super class.
	}
}
