package com.capgemini.map.treemap;

import java.util.Comparator;

public class SortPersonName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
