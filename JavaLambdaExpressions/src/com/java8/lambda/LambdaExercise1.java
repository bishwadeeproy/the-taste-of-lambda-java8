package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise1 {
	
	public static void main(String [] args) {
		
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all person");
		printAll(people);
		
		// Step 3: Create a method that prints all people that have last name beginning with C 
		System.out.println("Printing all person with last name beginning  C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
			
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p.toString());
		}
		
	}

}

interface Condition {
	boolean test(Person p);
}
