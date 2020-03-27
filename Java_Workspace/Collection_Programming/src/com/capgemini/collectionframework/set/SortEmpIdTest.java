package com.capgemini.collectionframework.set;

import java.util.*;

public class SortEmpIdTest {
	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<Employee>(new SortEmpName());
		ts.add(new Employee(1, "sai"));
		ts.add(new Employee(2, "sai"));
		ts.add(new Employee(3, " phani"));
		System.out.println(ts);
		
		
		
		
		
		
		
		
		
		
	}

}
