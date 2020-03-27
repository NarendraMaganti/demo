package com.capgemini.collectionframework.set;
import java.util.*;
public class SortEmpId implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		return o1.empId-o2.empId;
	}

	
	
	
	

}
