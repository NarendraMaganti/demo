package com.capgemini.collectionframework.set;

import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		hs.add(new Student(20, "saikumar"));
		hs.add(new Student(20, "saikumar"));
		hs.add(new Student(21, "kamal"));
		System.out.println(hs);
	}

}
