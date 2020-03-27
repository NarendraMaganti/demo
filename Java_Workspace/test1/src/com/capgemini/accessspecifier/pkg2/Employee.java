package com.capgemini.accessspecifier.pkg2;

import com.capgemini.accessspecifier.pkg1.Student;

public class Employee extends Student {

	public Employee(int age, String name) {
		super(age, name);
	}
	@Override
	protected void details() {
		
		System.out.println(this.name);
		
	}
}
