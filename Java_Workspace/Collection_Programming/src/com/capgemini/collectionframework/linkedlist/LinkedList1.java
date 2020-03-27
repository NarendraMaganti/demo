package com.capgemini.collectionframework.linkedlist;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.addFirst(5);
		ll.addLast(45);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll);
		ll.offer(1);
		System.out.println(ll);
		ll.offerFirst(2);
		ll.offerLast(48);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		ll.push(100);
		ll.poll();
		System.out.println(ll);
		System.out.println("----------");
		ll.addFirst(20);
		ll.addLast(20);
		System.out.println(ll);
		ll.removeFirstOccurrence(20);
		System.out.println(ll);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
