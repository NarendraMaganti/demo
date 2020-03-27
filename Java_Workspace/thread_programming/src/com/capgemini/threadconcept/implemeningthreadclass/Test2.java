package com.capgemini.threadconcept.implemeningthreadclass;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Main started");
		//Thread t=new Thread(new Thread2());
		Thread2 t1=new Thread2();//there is no start method present in Runnable interface thats y we make of thread class and pass this reference
		Thread t2=new Thread(t1);//start method present in thread class so we pass an argument to thread class
		t2.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main ended");
		
		
	}

}
