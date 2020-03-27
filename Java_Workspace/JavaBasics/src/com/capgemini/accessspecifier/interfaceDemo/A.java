package com.capgemini.accessspecifier.interfaceDemo;

public class A implements Vehicle2{
	@Override
	public void start() {
		System.out.println("statedddd..............");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.start();
		
	}

}
