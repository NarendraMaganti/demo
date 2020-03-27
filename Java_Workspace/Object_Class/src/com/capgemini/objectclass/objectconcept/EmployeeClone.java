package com.capgemini.objectclass.objectconcept;

public class EmployeeClone implements Cloneable {
	String compName;
	double salary;
	public EmployeeClone(String compName, double salary) {
		super();
		this.compName = compName;
		this.salary = salary;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Employee [compName=" + compName + ", salary=" + salary + "]";
	}
	
	

}
