package com.capgemini.accessspecifier.AbstractDemo;

public abstract class Vehicle {
	int cost;
	static String name;
	abstract void start();
	Vehicle(int cost){
		System.out.println(this.cost=cost);
	}
	static void add() {
		System.out.println(name);
	}
	void add(int a) {
		System.out.println(this.cost);
	}
	

}
