package com.capgemini.AssignmentOveriding;

public class Car extends Vehicle {
	void start() {
		System.out.println("car started");
	}
	void stop() {
		System.out.println("car stopped");
	}
	public static void main(String[] args) {
		
		Car c=new Car();
		c.start();
		c.stop();
		Vehicle v=new Vehicle();
		v.start();
		v.stop();
		
		
		
		
	}

}
