package com.capgemini.stringclass.stringconcept;

public class TestA {
	public static void main(String[] args) {

		String str1 = "john";
		String str2 = "john";
		String str3 = new String("anu");
		String str4 = new String("anu");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("------String immutable------");
		String str5 = "Josh";
		str5 = str5.concat("Marsh");
		System.out.println(str5);

	}

}
