package com.capgemini.accessspecifier.module2;
import com.capgemini.accessspecifier.module1.Employee;
public class Student extends Employee{
	int age;
	String name;
	Student(int age,String name) {
		super("Capgemini");
		this.age=age;
		this.name=name;
	}

	protected void detailsInfo() {
		System.out.println(this.compName);
	}
}
