package com.capgemini.threadconcept.extendingthreadclass;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("main Started");
		Thread1 t=new Thread1();
		t.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main ended");
		
		
	}

}
