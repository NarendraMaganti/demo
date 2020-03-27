package com.capgemini.map.linkedhashmap;

import java.util.*;
import java.util.Map.Entry;

public class TestComp {
	public static void main(String[] args) {

		LinkedList<Employee> ll=new LinkedList<Employee>();
		ll.add(new Employee(1, "A"));
		ll.add(new Employee(2, "B"));
		ll.add(new Employee(3, "C"));
		ll.add(new Employee(4, "D"));
		LinkedHashMap<Integer,LinkedList<Employee>> lh1=new LinkedHashMap<Integer,LinkedList<Employee>>();
		lh1.put(1, ll);
		Set<Entry<Integer, LinkedList<Employee>>> se1=lh1.entrySet();
		for(Entry<Integer, LinkedList<Employee>> ee:se1)
		{
			System.out.println(ee);

		}
		System.out.println("-------------");
		Set<Integer> sie=lh1.keySet();
		for(Integer iii:sie) {
			System.out.println(iii);
		}
		System.out.println("__________________________________________________");
Collection<LinkedList<Employee>> cle=lh1.values();
for(LinkedList<Employee> l:cle) {
	for(Employee e:l) {
		System.out.println(e);
	}
}

	}

}
