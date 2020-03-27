package com.capgemini.threadconcept.extendingthreadclass;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(" Main Started");
		Thread2 t=new Thread2();
		Thread2 t1=new Thread2();
		t.start();
		t1.start();
		System.out.println(" Main Ended");



	}

}
