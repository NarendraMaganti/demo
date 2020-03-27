package com.capgemini.collectionmethods;

import java.util.Vector;

public class VectorSpecMeth {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		v.insertElementAt(20, 0);
		v.insertElementAt(25, 1);
		System.out.println(v);
		v.setElementAt(30, 1);
		System.out.println(v);
		v.setSize(2);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println("------ensure capacity---");
		v.ensureCapacity(5);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v);
		v.trimToSize();
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.get(1));
	}

}
