package com.capgemini.listassignment;

import java.util.*;
public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("sai");
		a1.add("phani");
		a1.add("kamal");
		a1.add("gopi");
		a1.add("hari");
		a1.add("ashok");
		a1.add("narpath");
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.add(0,"narpath");
		System.out.println(a1);
	    a1.set(0, "adusumalli");
	    System.out.println(a1);
	    System.out.println(a1.isEmpty());
	    System.out.println(a1.get(0));
	    Collection<String> col=new ArrayList<String>();
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
		for(int i=a1.size()-1;i>0;i--) {
			System.out.print(a1.get(i)+" ");
		}
		System.out.println();
		for(String i:a1) {
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
