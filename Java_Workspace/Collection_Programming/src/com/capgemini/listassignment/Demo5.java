package com.capgemini.listassignment;

import java.util.*;
public class Demo5 {
	public static void main(String[] args) {
		LinkedList<Byte> a1=new LinkedList<Byte>();
		a1.add((byte)10);
		a1.add((byte)20);
		a1.add((byte)30);
		a1.add((byte)40);
		a1.add((byte)50);
		a1.add((byte)10);
		a1.add((byte)20);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.add(0,(byte) 10);
		System.out.println(a1);
	    a1.set(0, (byte)12);
	    System.out.println(a1);
	    System.out.println(a1.isEmpty());
	    System.out.println(a1.get(0));
	    Collection<Byte> col=new ArrayList<Byte>();
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
		for(Byte i:a1) {
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
