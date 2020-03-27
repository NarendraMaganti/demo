package com.capgemini.threadconcept.extendingthreadclass;

public class Paytm extends Thread {
	Irctc i;
	public Paytm(Irctc i) {
		super();
		this.i = i;
	}
	@Override
	public void run() {
		i.confirmTicket();
	}
	

}
