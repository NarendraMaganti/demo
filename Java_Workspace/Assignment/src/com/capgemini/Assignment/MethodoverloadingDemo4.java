package com.capgemini.Assignment;

public class MethodoverloadingDemo4 {
	
	int add(int i) {
		System.out.println(i);
		return i;
	}
	void add(int i,int j) {
		
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		MethodoverloadingDemo4 ao=new MethodoverloadingDemo4();
		ao.add(10);
		ao.add(10,20);
		
		
	}
	
	

}
