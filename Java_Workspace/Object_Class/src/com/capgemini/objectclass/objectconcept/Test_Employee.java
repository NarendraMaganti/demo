package com.capgemini.objectclass.objectconcept;

public class Test_Employee {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		EmployeeClone e1=new EmployeeClone("capgemini",25000);
		Object o1=e1.clone();
		Object o2=e1.clone();
		System.out.println(e1);
		System.out.println(o1);
		System.out.println(o2);
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
