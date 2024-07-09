package com.javaDemo.package1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalInterfaceExample2 {
	static Consumer<Person> c1 = (p) -> System.out.println(p.toString());
	static Consumer<Person> c2 = p -> System.out.println(p.getId());

	static BiConsumer<Person, Person> bc1 = (a, b) -> {
		String name = a.getName();
		String name2 = b.getName();
		System.out.println(name + " " + name2);
	};

	static void getForAll(List<Person> person) {
		person.forEach(c1);
	}

	static void getTotalName(Person p1, Person p2) {
		bc1.accept(p1, p2);
	}

	public static void main(String[] args) {
		getForAll(PersonRepository.getAllPesons());
		getTotalName(PersonRepository.getAllPesons().get(0), PersonRepository.getAllPesons().get(1));

	}

}

class PersonRepository {

	public static List<Person> getAllPesons() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "pavan"));
		persons.add(new Person(2, "sai"));
		return persons;
	}
}

class Person {
	private int id;
	private String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}