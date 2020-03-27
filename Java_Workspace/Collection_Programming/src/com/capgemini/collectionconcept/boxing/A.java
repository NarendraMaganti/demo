package com.capgemini.collectionconcept.boxing;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(new Integer(25));
		for(Object o:al) {
		System.out.print(o+" ");
		}

	}

}
