package com.capgemini.collectionframework.set;
import java.util.*;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add(null);
		hs.add("a");
		System.out.println(hs);
		hs.add("Ea");
		hs.add("FB");
		System.out.println("Ea".hashCode());
		System.out.println("FB".hashCode());










	}

}
