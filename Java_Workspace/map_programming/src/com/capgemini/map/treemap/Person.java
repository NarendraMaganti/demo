package com.capgemini.map.treemap;

public class Person  {
	int age;
	String name;
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
//	@Override
	/*public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}*/
	/*public int compareTo(Person o) {
		return this.age-o.age;
	}
	
*/
}
