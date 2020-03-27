package com.capgemini.Assignment;

public class MethodoverloadingDemo3 {
	
	void add(int i,double d) {
		System.out.println("no inputs");
	}
	void add(double d,int i) {
		
		System.out.println(i+d);
	}
	public static void main(String[] args) {
		MethodoverloadingDemo3 ao=new MethodoverloadingDemo3();
		ao.add(10,10.0);
		ao.add(10.0,20);
		
		
	}
	
	

}
