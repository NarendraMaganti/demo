package com.capgemini.listassignment;
import java.util.*;
public class Demo9 {
	public static void main(String[] args) {
		Stack<Long> st=new Stack<Long>();
		st.add(10l);
		st.add(20l);
		st.add(30l);
		st.push(125l);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search(10l));
		System.out.println();
		System.out.println(st);
		
		
		
		
		
	}

}
