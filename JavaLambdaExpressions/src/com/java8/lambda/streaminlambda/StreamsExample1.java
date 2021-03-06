package com.java8.lambda.streaminlambda;

import java.util.Arrays;
import java.util.List;

import com.java8.lambda.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		//Parts of streams
		people.stream() // source
		.filter(p -> p.getLastName().startsWith("C")) //operations
		.forEach(System.out::println); // terminal condition
		
		long count = people.stream() 
		.filter(p -> p.getLastName().startsWith("C")) 
		.count();

		System.out.println(count);
		
		long counts = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("C")) 
				.count();
	}

}