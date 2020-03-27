package com.capgemini.collectionmethods;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMeth1 {
	public static void main(String[] args) {
		/*Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(15);
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(10);
		c2.add(20);
		c2.add(30);
		c2.add(40);
		c2.add(50);
		System.out.println(c1);
		c1.addAll(c2);
		System.out.println(c1);
		//System.out.println(c1.containsAll(c2));
		//c1.removeAll(c2);
	//	System.out.println("removal "+c2);
		c1.removeAll(c2);
		System.out.println(c1);
		
		
		Collection<Integer> c3=new ArrayList<Integer>();
		c3.add(10);
		c3.add(20);
		c3.add(30);
		Collection<Integer> c4=new ArrayList<Integer>();
		c4.add(10);
		c4.add(20);
		c4.add(30);
		c4.add(40);
		c4.add(50);
		c3.retainAll(c4);
		System.out.println(c3);
*/		
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(10);
		c1.add(20);
		c1.add(30);
	Object obj[]=c1.toArray();
	for(Object i:obj) {
		System.out.print(i+" ");
		
	}
		
		
		
		
	}

}
