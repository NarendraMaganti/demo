package com.capgemini.threadconcept.extendingthreadclass;

public class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
