package com.capgemini.javafinalvaraiable;

public class Employee {
	private static int salary;
	private String compName;
	Employee(String compName){
		this.compName=compName;
		
	}
	private static void details() {
		System.out.println(salary);
		
	}
	private void detailsInfo() {
		System.out.println(this.compName);
	}
	

}
