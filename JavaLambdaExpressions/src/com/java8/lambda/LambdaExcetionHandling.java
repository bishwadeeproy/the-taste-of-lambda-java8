package com.java8.lambda;

import java.util.function.BiConsumer;

public class LambdaExcetionHandling {

	public static void main(String[] args) {
		int[] someNumbers = { 2, 4, 1, 7, 9 };
		int key = 0;

		process(someNumbers, key, wrapperLamda((v, k) -> System.out.println(v / k)));

	}

	public static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			biConsumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer){
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			}catch(ArithmeticException ex) {
				System.err.println("Error ocurrs!");
			}
		};
		
	}

}
