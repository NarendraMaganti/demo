package com.capgemini.accessspecifier.interfaceDemo;

public interface Vehicle {
	// static int a;
	static final int a = 10;

	default void meth() {
		System.out.println("hii");
	}

	public abstract void start();

	static void stop() {
		System.out.println("stopped");
	}
	/*
	 * static { a=10; }
	 */

}
