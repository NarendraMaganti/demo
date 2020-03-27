package com.capgemini.accessspecifier.module1;

public class Employee {
	protected int salary;
	protected String compName;

   protected Employee(String compName) {
		
		this.compName=compName;
		
	}
	static void details() {
		System.out.println("salary");
	}
	protected void detailsInfo() {
		System.out.println("this.compName");
	}

}
