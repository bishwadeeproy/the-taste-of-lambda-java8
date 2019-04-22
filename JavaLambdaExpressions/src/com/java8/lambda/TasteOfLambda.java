package com.java8.lambda;

public class TasteOfLambda {

	public static void main(String[] args) {
		LambdaRocks myLambda = () -> System.out.println("Hello Lambda!!");
		myLambda.helloLambda();

	}
	
	interface LambdaRocks{
		void helloLambda();
	}

}
