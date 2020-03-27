package com.capgemini.map.treemap;

import java.util.*;
import java.util.Map.Entry;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer , String> tm=new TreeMap<Integer , String>();
		tm.put(1, "abhi");
		tm.put(2, "divya");
		tm.put(3, "anu");
		tm.put(1, "shree");
		System.out.println(tm);
		Set<Entry<Integer , String>> se=tm.entrySet();
		for(Entry<Integer , String> e:se) {
			System.out.println(e);
			System.out.println(e.getValue());
			System.out.println(e.getKey());
			System.out.println("--------------------");
		}
		Set<Integer> st=tm.keySet();
		for(Integer i:st) {
			System.out.println(i);
		}
		System.out.println("---------------");

		Collection<String> c=tm.values();
		for(String s:c) {
			System.out.println(s);
		}
		System.out.println("-------------");
		System.out.println(tm.containsKey(1));
		System.out.println(tm.containsValue("abhi"));
		System.out.println(tm.get(1));












	}
}
