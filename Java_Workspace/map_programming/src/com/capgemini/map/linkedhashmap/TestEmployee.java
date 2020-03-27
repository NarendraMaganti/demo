package com.capgemini.map.linkedhashmap;

import java.util.*;
import java.util.Map.Entry;

public class TestEmployee {
	public static void main(String[] args) {
		LinkedHashMap<Employee, String> lh=new LinkedHashMap<Employee, String>();
          lh.put(new Employee(12, "Abhi"), "A");
          lh.put(new Employee(13, "Divya"), "B");
          lh.put(new Employee(14, "Shree"), "C");
          lh.put(new Employee(12, "Abhi"), "D");
          Set<Entry<Employee, String>> se=lh.entrySet();
          for(Entry<Employee, String> e:se ) {
        	  System.out.println(e.getValue());
        	  System.out.println(e.getKey());
        	  System.out.println("--------------");
          }
          











	}

}
