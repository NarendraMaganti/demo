package com.capgemini.threadconcept.extendingthreadclass;

public class TestPaytm {
	public static void main(String[] args) {
		Irctc i=new Irctc();
		System.out.println(" Main Started");
		Paytm p1=new Paytm(i);
		Paytm p2=new Paytm(i);
		p1.start();
		p2.start(); 
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i.leaveMe();
		System.out.println(" Main Ended");
		
		
		
	}

}
