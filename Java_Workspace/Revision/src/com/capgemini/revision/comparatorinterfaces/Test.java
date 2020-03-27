package com.capgemini.revision.comparatorinterfaces;

public class Test {
	public static void main(String[] args) {
		
		Student s1=new Student(12, "a");
		Student s2=new Student(13, "b");
		SortAge sa=new SortAge();
		int i=sa.compare(s1, s2);
		switch (i) {
		case -1:
			System.out.println(s2.getStudentNo());
			break;
		case 1:
			System.out.println(s1.getStudentNo());
             break;
		default:
			System.out.println("oops");
			break;
		}
		
	}

}
