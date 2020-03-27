package com.capgemini.collectionconcept.boxing;

public class KotakBankAtmMachine {
	/*Atm sa=new SbiAtm();
	Atm ha=new HdfcAtm();
	Atm ia=new IciciAtm();*/
	void withDraw(Atm a1) {
		if(a1 instanceof SbiAtm) {
			System.out.println("welcome to sbi");
		}
		else if(a1 instanceof HdfcAtm){
			System.out.println("welcome to hdfc");
		}
		else {
			System.out.println("welcome to Icici");
		}
	}
	
	public static void main(String[] args) {
		KotakBankAtmMachine k=new KotakBankAtmMachine();
		k.withDraw(new SbiAtm());
		


	}

}
