package com.capgemini.listassignment;

import java.util.*;
public class Demo6 {
	public static void main(String[] args) {
		LinkedList<Boolean> a1=new LinkedList<Boolean>();
		a1.add(0, true);
		a1.add(1, true);
		a1.add(2, false);
		a1.add(3, true);
		a1.add(4, false);
		a1.add(5, true);
		a1.add(true);
		a1.add(6,null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.add(0,true);
		System.out.println(a1);
	    a1.set(0, null);
	    System.out.println(a1);
	    System.out.println(a1.isEmpty());
	    System.out.println(a1.get(0));
	    Collection<Boolean> col=new ArrayList<Boolean>();
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
		for(Boolean i:a1) {
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
