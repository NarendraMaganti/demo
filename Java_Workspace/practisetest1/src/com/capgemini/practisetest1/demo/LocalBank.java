package com.capgemini.practisetest1.demo;

public class LocalBank {
	Bank bank;
	public void atmMachine(Bank bank) {
		if(bank instanceof SbiBank) {
			System.out.println("Tq for using SBI!!!!!");
		}
		else if(bank instanceof CentralBank) {
			System.out.println("tq for using Central Bank !!!!");
		}
		else
			System.out.println("tq for using Andhra Bank @@@@@@@@");
		
	}
	
	public static void main(String[] args) {
		LocalBank lb=new LocalBank();
		lb.atmMachine(new CentralBank());
		
		
		
		
		
	}
	

}
