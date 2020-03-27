package com.capgemini.listassignment;

import java.util.*;
public class Demo3 {
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(10.00);
		a1.add(20.20);
		a1.add(30.30);
		a1.add(40.40);
		a1.add(50.50);
		a1.add(10.02);
		a1.add(20.05);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.add(0, 10.02);
		System.out.println(a1);
	    a1.set(0, 12.25);
	    System.out.println(a1);
	    System.out.println(a1.isEmpty());
	    System.out.println(a1.get(0));
	    Collection<Double> col=new ArrayList<Double>();
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
		for(Double i:a1) {
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
