package com.capgemini.collectionframework.set;
import java.util.*;
public class SortEmpName implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}

	
	
	
	

}
