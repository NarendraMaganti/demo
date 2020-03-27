package com.capgemini.revision.comparableinterfaces;

public class Test {
	public static void main(String[] args) {

		Student s1 = new Student(23, "saikumar");
		Student s2 = new Student(25, "kumar");
		int i = s1.compareTo(s2);
		switch (i) {
		case -1:
			System.out.println(s2.getName() + "  is older");

			break;
		case 1:
			System.out.println(s1.getName() + "  is older");
			break;

		default:
			System.out.println("Both are having equal ages");
			break;
		}

	}

}
