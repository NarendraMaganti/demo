package com.capgemini.collection.arraylist;

import java.util.ArrayList;

public class ArrayList2 {
	

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(90);
		a.add(37);
		a.add(78);
		a.add(35);
		a.add(90);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.addAll(a);
		a1.add(2,56);
		System.out.println(a);
		System.out.println(a1);
		a1.remove(a);
	}

}
