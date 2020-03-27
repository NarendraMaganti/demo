package com.capgemini.collectionframework.arraydequeue;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
		System.out.println("---add----");
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		System.out.println("-----remove---");
		a1.remove();
		a1.remove(30);
		System.out.println(a1);
		
		
		
		
	}

}
