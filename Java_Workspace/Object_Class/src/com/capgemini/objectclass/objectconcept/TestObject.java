package com.capgemini.objectclass.objectconcept;

public class TestObject {
	public static void main(String[] args) {

	/*	Student s=new Student(10,"moksha");
		Student s1=new Student(20,"saikumar");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println("-----------getclass returns FQCN -----");
		Class c1=s1.getClass();
		System.out.println(c1);
		Integer i=new Integer(10);
		System.out.println(i.getClass());
		System.out.println("-------toString() returns hexadecimal representation of hashcode");
		System.out.println(s1.toString());
		System.out.println("---------equals() if compare non primitive data");
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");
		Student s3=new Student(25,"a");
		Student s4=new Student(25,"a");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));*/
		Student s3=new Student(25,"a");
		Student s4=new Student(25,"a");
		System.out.println("------------two objects are equal same hashcode");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
	}
}
