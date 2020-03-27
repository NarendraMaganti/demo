package com.capgemini.collectionframework.priorityqueue;

import java.util.*;

public class ExampleDouble {
	public static void main(String[] args) {
		PriorityQueue<Double> p=new PriorityQueue<Double>();
		p.add(20.25);
		p.add(52.20);
		p.add(26.52);
		System.out.println(p);
		System.out.println("---remove");
		p.remove();
		System.out.println(p);
		for(Double d:p) {
			System.out.println(d);
		}
		System.out.println("-----iterator way");
		Iterator itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
