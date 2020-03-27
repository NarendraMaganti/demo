package com.capgemini.revision.lamdaexpression;

public class KotakBankAtmMachine {
	void withdraw(Atm o) {
		if(o instanceof SbiAtm) {
			System.out.println("tq using sbi");
		}
		else
			System.out.println("tq for using central bank");
	}
	public static void main(String[] args) {
		
		KotakBankAtmMachine k=new KotakBankAtmMachine();
		k.withdraw(new SbiAtm());
		
		
		
	}
	

}
