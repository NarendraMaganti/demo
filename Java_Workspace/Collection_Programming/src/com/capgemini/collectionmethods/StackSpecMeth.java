package com.capgemini.collectionmethods;

import java.util.Stack;

public class StackSpecMeth {
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(120);
		s.push(125);
		s.push(130);
		s.push(135);
		s.add(140);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search(130));
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
