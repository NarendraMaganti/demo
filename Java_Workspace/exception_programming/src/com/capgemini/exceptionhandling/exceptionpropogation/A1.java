package com.capgemini.exceptionhandling.exceptionpropogation;

public class A1 {
	static void m() {
		try {
		A2.n();
		}catch(ArithmeticException e) {
			System.out.println("Exception will be handled in Class A1 ");
		}
		
		
	}

}
