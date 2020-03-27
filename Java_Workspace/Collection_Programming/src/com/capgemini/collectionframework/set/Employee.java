package com.capgemini.collectionframework.set;

public class Employee  {
	int empId;
	String empName;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
/*	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
	}
*/	
	
	
	/*@Override
	public int compareTo(Employee o) {
		if(this.empId<o.empId)
		return -1;
		else if(this.empId>o.empId)
			return 1;
		else
			return 0;
		
	}*/

	
	

}
