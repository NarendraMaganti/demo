package com.capgemini.Assignment;

public class MethodoverloadingDemo1 {
	
	void add() {
		System.out.println("no inputs");
	}
	void add(int i,int j) {
		
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		MethodoverloadingDemo1 ao=new MethodoverloadingDemo1();
		ao.add();
		ao.add(10,20);
		
		
	}
	
	

}
