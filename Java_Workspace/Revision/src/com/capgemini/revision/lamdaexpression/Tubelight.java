package com.capgemini.revision.lamdaexpression;

public class Tubelight {
	Light t=()->{
		System.out.println("tubelight glows");
	};
	public static void main(String[] args) {
		
		Tubelight t1=new Tubelight();
		t1.t.glow();
		
		
		
	}
	
	

}
