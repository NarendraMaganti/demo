package com.capgemini.collectionframework.set;

import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(1, "adusumalli"));
		ts.add(new Employee(2, "saikumar"));
		ts.add(new Employee(3, "phani"));
		ts.add(new Employee(3, "phani"));
		System.out.println(ts);

	}

}
