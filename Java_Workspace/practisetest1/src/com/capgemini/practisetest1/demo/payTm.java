package com.capgemini.practisetest1.demo;

public class payTm {
	Irctc i;
	payTm(Irctc i){
		this.i=i;
	}
	public void book(String src, String destination) {
		i.bookTicket(src, destination);
	}
	public static void main(String[] args) {
		
		payTm paytm=new payTm(new Irctc());
		paytm.book("hyd","bangalore");
		
		
		
	}

}
