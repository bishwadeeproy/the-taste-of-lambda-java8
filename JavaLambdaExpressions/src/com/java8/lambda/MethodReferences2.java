package com.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferences2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("Printing all person with last name beginning  C");
		printConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println);
		//p -> method(p)
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {

				consumer.accept(person);
			}

		}

	}

}
