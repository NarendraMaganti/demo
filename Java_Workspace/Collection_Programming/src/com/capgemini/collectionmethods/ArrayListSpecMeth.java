package com.capgemini.collectionmethods;

import java.util.ArrayList;

public class ArrayListSpecMeth {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(1, 50);
		System.out.println(al);
		System.out.println("-----remove at index");
		al.remove(2);
		System.out.println(al);
		al.set(1, 100);
		System.out.println(al);
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		al.remove(new Integer(10));
		System.out.println(al);

	}

}
