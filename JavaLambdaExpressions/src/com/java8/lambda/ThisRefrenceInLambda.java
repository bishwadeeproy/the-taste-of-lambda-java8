package com.java8.lambda;


//This will demonstrate that Lamda is not really a syntactical sugar on anonymous inner class but does it own things
public class ThisRefrenceInLambda {
	
	public void doProcess(int o, Process p) {
		p.process(o);
	}
	
	public void execute() {
		System.out.println(this);
		doProcess(10, i -> {
			System.out.println(i);
			System.out.println(this); 
		});
	}

	
	public static void main(String[] args) {
		ThisRefrenceInLambda thisRef =  new ThisRefrenceInLambda();
		thisRef.doProcess(10, i -> {
			System.out.println(i);
			//System.out.println(this); This will not work
			//So in case of anonymous inner class this refers to instance of inner class hence we can use this inside anonymous inner class
			//but in case of the instance of lambda does not touched the this reference, this is by design
		});

		thisRef.execute();
	}

}
