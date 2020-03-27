package com.capgemini.streamapi.streamconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(45);
		a.add(50);
		a.add(55);
		System.out.println(a);
	List<Integer> li=a.stream().filter(i->(i%2==0)).collect(Collectors.toList());
	System.out.println(li);
	List<Integer> l2=a.stream().map(i->(i*10)).collect(Collectors.toList());
		System.out.println(l2);
		
		
		
		
		
		
		
	}

}
