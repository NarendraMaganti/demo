package com.capgemini.javaBasicsOops;

public class Child extends Parent {
	
	void add() {
		System.out.println(100+1000);
	}
	void add(int i, int j) {
		System.out.println(i*j);
	}
	void add(double d1, double d2) {
		System.out.println(d1*d2);
	}
	public static void main(String[] args) {
		
		Parent p=new Parent();
		Child c=new Child();
		p.add();
		p.add(20, 20);
		p.add(10, 20);
		c.add();
		c.add(20, 20);
		c.add(10, 20);
	}
	

}
