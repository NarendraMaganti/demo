package com.capgemini.javaBasics;

public class InitalizingStaticNonstatic {
	int p = 25;
	static int q = 20;

	static void mainmeth() {
		System.out.println("hello static method");
	}

	void mainmeth1() {
		System.out.println("Hello non static method");
	}

	static void main() {
		int i = 10;
		System.out.println(i);
		System.out.println(q);
		mainmeth();
		// mainmeth1(); nonstatic member
		// System.out.println(p);//cannot access becuase it is a non static member

	}

	void mainDemo() {

		System.out.println(p);
		System.out.println(q);
		mainmeth();
		mainmeth1();
	}    

	public static void main(String[] args) {

		InitalizingStaticNonstatic.main();
		InitalizingStaticNonstatic a0=new InitalizingStaticNonstatic();
		a0.mainmeth1();

	}

}
