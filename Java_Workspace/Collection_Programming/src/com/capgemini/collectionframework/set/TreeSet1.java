package com.capgemini.collectionframework.set;

import java.util.*;

public class TreeSet1 {
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(10);
	ts.add(20);
	ts.add(30);
	ts.add(10);
	//ts.add(null); single null lso not possible, duplicate wont allowed
	System.out.println(ts);
	TreeSet<String> ts1=new TreeSet<String>();
	ts1.add("sai");
	ts1.add("kumar");
	ts1.add("naidu");
	//ts1.add(null);
	System.out.println(ts1);
	TreeSet<Double> ts2=new TreeSet<Double>();
	ts2.add(20.35);
	ts2.add(20.35);
	ts2.add(35.25);
	//ts1.add(null);
	System.out.println(ts2);
	
	
	
	
	
	
	
	
	
}
}
