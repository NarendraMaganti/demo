package com.capgemini.listassignment;

import java.util.*;

public class Student9Test {
	public static void main(String[] args) {
		Vector<Student8> v = new Vector<Student8>();
		v.add(new Student8(10));
		v.add(new Student8(20));
		v.add(new Student8(30));
		v.add(new Student8(40));
		v.add(new Student8(50));
		v.add(new Student8(20));
		System.out.println(v);
		v.insertElementAt(new Student8(55), 0);
		System.out.println(v);
		v.insertElementAt(new Student8(25), 7);
		v.removeElementAt(7);
		System.out.println(v);
		System.out.println(v.size());
		v.setSize(20);
		System.out.println(v.size());
		v.setElementAt(new Student8(25), 5);
		System.out.println(v);

	}

}
