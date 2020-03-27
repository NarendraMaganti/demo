package com.capgemini.listassignment;
import java.util.*;
public class Demo10 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("sai");
	al.add(20);
	System.out.println(al);
	LinkedList ll=new LinkedList(al);
	System.out.println(ll);
	List l=new Vector(ll);
	System.out.println(l);
	Stack st=new Stack();
	st.addAll(l);
	System.out.println(st);
	System.out.println("----------Iterating ways----------------");
	for(int i=0;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	for(Object i:al) {
		System.out.print(i+" ");
	}
	System.out.println();
	Iterator i=ll.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	System.out.println();
	ListIterator li=l.listIterator();
	while(li.hasNext()) {
		System.out.print(li.next()+" ");
	}
	System.out.println();
	ListIterator b=st.listIterator(st.size());
	while(b.hasPrevious()) {
		System.out.print(b.previous()+" ");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
