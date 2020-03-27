package com.capgemini.AssignmentOveriding;

public class SoftwareEngineer extends Engineer {
	void work() {
		System.out.println("CODING JOB DONE BY SOFTWARE ENGINEER");
	}
	public static void main(String[] args) {
		SoftwareEngineer a=new SoftwareEngineer();
		a.work();
	}

}
