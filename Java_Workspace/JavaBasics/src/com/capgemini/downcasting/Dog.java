package com.capgemini.downcasting;

public class Dog extends Animal{
	void eat() {
		System.out.println("dog eats");
	}
	public static void main(String[] args) {
		Animal a=new Dog();
    	Dog d=(Dog)a;
	d.eat1();
	d.eat();
	
}
}
