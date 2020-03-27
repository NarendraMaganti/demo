package com.capgemini.exceptionhandling.customuncheckedexception;

public class AtmSimulator {
	double balance=15000;
	void withdraw(double amount) {
	if(amount>balance) {
		throw new InsufficientBalanceException();
	}else {
		double rem_balance=balance-amount;
		System.out.println(rem_balance);
	}
	}
	@Override
	public String toString() {
		return "AtmSimulator [balance=" + balance + "]";
	}

}
