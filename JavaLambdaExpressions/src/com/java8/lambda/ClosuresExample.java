package com.java8.lambda;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;

		// This value is freeze by the lambda exp where is it use and jdk 8
		// automatically knows it is final value
		int b = 10;//Effectively final
		doProcess(a, i -> System.out.println(i + b));
	}

	public static void doProcess(int x, Process p) {
		p.process(x);
	}
}

interface Process {
	void process(int x);
}