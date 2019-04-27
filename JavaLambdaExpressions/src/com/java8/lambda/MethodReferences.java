package com.java8.lambda;

public class MethodReferences {

	public static void main(String[] args) {
		Thread t = new Thread(() -> printMsg());
		t.start();
		
		//MethodReferences::printMsg is similar to  () ->  printMsg;
		
		Thread t1 = new Thread(MethodReferences::printMsg);
		t1.start();

	}
	public static void printMsg() {
		System.out.println("Hey Hi!");
	}
}
