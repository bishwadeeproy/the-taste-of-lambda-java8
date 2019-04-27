package com.java8.lambda.collections;

import java.util.Arrays;
import java.util.List;

import com.java8.lambda.Person;

public class CollectionsIterator {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		
		//These are external iterator , programmer is controlling the iteraion process
		//These are essentialy sequential 
		System.out.println("Using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
			
		}
		
		System.out.println("Using for each loop");
		for (Person person : people) {
			System.out.println(person);
		}
		
		
		//In java 8  where we not controlling the iterator how the iterator happens is upto runtime
		//Internal iterator
		//This is a consumer
		//The magic of this is we dont care about the order... run this using parallelism
		System.out.println("Using for lambda for each loop");
		people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);
	}

}
