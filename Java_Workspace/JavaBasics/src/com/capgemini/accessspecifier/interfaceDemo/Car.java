package com.capgemini.accessspecifier.interfaceDemo;

public class Car {
	Vehicle v1=()->{
		System.out.println("starting");//lambdaaaa expression
	};
	public static void main(String[] args) {
		Car c=new Car();
		c.v1.start();
		
		
	}

}
