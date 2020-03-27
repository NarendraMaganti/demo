package com.capgemini.threadconcept.extendingthreadclass;

public class Irctc {

	public synchronized void confirmTicket() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void leaveMe() {
		System.out.println(" Notify is called");
		notifyAll();


	}


}
