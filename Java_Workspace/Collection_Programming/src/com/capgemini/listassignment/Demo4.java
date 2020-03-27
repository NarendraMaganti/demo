package com.capgemini.listassignment;

import java.util.*;
public class Demo4 {
	public static void main(String[] args) {
		LinkedList<Float> a1=new LinkedList<Float>();
		a1.add(10.02F);
		a1.add(20.20F);
		a1.add(30.30F);
		a1.add(40.40f);
		a1.add(50.50F);
		a1.add(10.02F);
		a1.add(20.05F);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.add(0, 10.02f);
		System.out.println(a1);
	    a1.set(0, 12.25f);
	    System.out.println(a1);
	    System.out.println(a1.isEmpty());
	    System.out.println(a1.get(0));
	    Collection<Float> col=new ArrayList<Float>();
	    col.addAll(a1);
	    System.out.println(col);
		col.retainAll(a1);
		System.out.println(col);
		col.clear();
		System.out.println(col);
	System.out.println(col.getClass());
		System.out.println("----------Iterating ways----------------");
		for(int i=0;i<a1.size();i++) {
			System.out.print(a1.get(i)+" ");
		}
		System.out.println();
		for(Float i:a1) {
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		ListIterator li=a1.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		ListIterator b=a1.listIterator(a1.size());
		while(b.hasPrevious()) {
			System.out.print(b.previous()+" ");
		}
		System.out.println();
		a1.removeAll(a1);
		System.out.println(a1);
		
		
		
		
	}

}
