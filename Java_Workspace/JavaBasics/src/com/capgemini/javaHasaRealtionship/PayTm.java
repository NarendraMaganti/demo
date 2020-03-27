package com.capgemini.javaHasaRealtionship;

public class PayTm {
Irctc i;
    PayTm(Irctc i){
	this.i=i;
}
    void bookTrainTicket(String src, String des) {
    	
    	i.bookTicket(src, des);
    	
    }
}
