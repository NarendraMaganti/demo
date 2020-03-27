package com.capgemini.stringclass.stringconcept;

public class TestB {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "hello";
		String s3 = "";
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("John"));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.endsWith("o"));
		System.out.println(s3.isEmpty());
		System.out.println(s1.contains("e"));
		char ch[] = s1.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}
