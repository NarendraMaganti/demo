package com.capgemini.junit.calculator.test;

public class MyRestService {

	public String getStudentName() {

		return "meera";
	}

	public String getTeacherName() {
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			
		}

		return "maya";
	}


}
