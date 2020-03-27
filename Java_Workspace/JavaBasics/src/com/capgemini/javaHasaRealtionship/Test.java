package com.capgemini.javaHasaRealtionship;

public class Test {
	public static void main(String[] args) {
		Irctc p=new Irctc();
		PayTm q=new PayTm(p);
		q.bookTrainTicket("bangalore", "guntur");
		
	}

}
