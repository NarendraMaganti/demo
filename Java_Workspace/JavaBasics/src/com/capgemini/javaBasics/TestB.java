package com.capgemini.javaBasics;

public class TestB {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(B.a);
	    System.out.println(B.p);
		System.out.println(b.q);
		B.m();
		B.c();
		b.d();
		A x=new A();
		System.out.println(A.a);
		System.out.println(x.b);
		
	}

}
