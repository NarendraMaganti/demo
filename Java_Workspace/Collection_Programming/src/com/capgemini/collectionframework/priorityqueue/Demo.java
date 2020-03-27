package com.capgemini.collectionframework.priorityqueue;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(40);
		p.add(20);
		p.add(30);
		p.add(40);
	//	p.add(null); we cannot store null data in case of priority queue
		System.out.println(p);
		p.remove(30);
		System.out.println(p);
		System.out.println("------iterator way-----");
		Iterator itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------for each loop------");
        for(Integer i:p) {
        	System.out.println(i);
        }
	}

}
