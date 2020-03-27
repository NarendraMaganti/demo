package com.capgemini.exceptionhandling.customuncheckedexception;

public class SbiAtmMachine {
	public static void main(String[] args) {
		double amount=10000;
		System.out.println(" Main Started");
		AtmSimulator a=new AtmSimulator();
		try {
			a.withdraw(amount);
			System.out.println(a);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());

		}
		System.out.println(" Main Ended");


	}

}
