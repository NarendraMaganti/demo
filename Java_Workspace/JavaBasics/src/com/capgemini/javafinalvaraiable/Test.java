package com.capgemini.javafinalvaraiable;

public class Test {
	public static final int i=10;
	public static final int j;
	static {
		j=25;
	}
	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println(j);
	}
	
}
