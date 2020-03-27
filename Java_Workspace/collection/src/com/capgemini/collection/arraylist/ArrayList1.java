package com.capgemini.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(12);
		a.add(90);
		a.add(37);
		a.add(78);
		a.add(35);
		a.add(90);
		for (Integer a1 :a) {

			System.out.println(a1);
		}

		System.out.println("size of arraylist is:"+a.size());
		System.out.println(a.contains(39));
		a.remove(3);
		System.out.println("size of arraylist is:"+a.size());
		System.out.println(a.isEmpty());
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.addAll(a);
		System.out.println(a1);
		a1.add(45);
		//a1.removeAll(a);
		System.out.println("a1 elements " +a1 );
		a1.remove(a1.indexOf(12));

		System.out.println("a1 elements " +a1 );
		//a1.remove(90);
		System.out.println(a1);
		System.out.println("a"+a);
		a1.stream();
		
	}
}

