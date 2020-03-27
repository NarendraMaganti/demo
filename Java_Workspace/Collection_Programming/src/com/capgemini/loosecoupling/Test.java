package com.capgemini.loosecoupling;

public class Test {
	void recieve(Gift g1) {
		if(g1 instanceof Apple) {
			System.out.println("tq for giving apple");
		}
		else if(g1 instanceof MiMobile) {
			System.out.println("tq for giving MiMobile");
		}
		else if(g1 instanceof Kitkat) {
			System.out.println("tq for giving chocolate");
		}
		else  {
			System.out.println("tq for giving  50pschocolate");
		}

		
		
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.recieve(new Apple());
		t.recieve(new MiMobile());
		t.recieve(new Kitkat());
		t.recieve(new KachaMango());
		
		
		
	}
	
	
	
	

}
