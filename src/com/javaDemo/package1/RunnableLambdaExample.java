package com.javaDemo.package1;

public class RunnableLambdaExample {

	public static void main(String... args) {
		// before java8
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("inside thread");
			}

		};
		new Thread(t1).start();
		// After java 8

		Runnable t2 = () -> {
			System.out.println("Thread2");
		};
		new Thread(t2).start();
		Runnable t3 = () -> {
			System.out.println("Thread3");
		};
		new Thread(t3).start();

		// old way
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread4");
			}
		}).start();
		;
	
		// new way
		new Thread(() -> {
			System.out.println("Thread5");
			System.out.println("Thread 5.1");
		}).start();
		;
	}

}
