package com.capgemini.Assignment;

public class MethodoverloadingDemo2 {
	
	void add(int i) {
		System.out.println("no inputs");
	}
	void add(double j) {
		
		System.out.println(j);
	}
	public static void main(String[] args) {
		MethodoverloadingDemo2 ao=new MethodoverloadingDemo2();
		ao.add(10);
		ao.add(10.0);
		
		
	}
	
	

}
