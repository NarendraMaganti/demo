package com.capgemini.revision.comparableinterfaces;

public class Student implements Comparable<Student> {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.age == o.age)
			return 0;
		else if (this.age > o.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}
