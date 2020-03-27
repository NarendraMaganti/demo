package com.capgemini.collectionframework.priorityqueue;

public class Student implements Comparable<Student> {
	int age;
	String name;
	Student(int age,String name){
		this.age=age;
		this.name=name;

	}
	@Override
	public int compareTo(Student o) {
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


}
