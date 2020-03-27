package com.capgemini.javafinalvaraiable;

public class Testnonstaticfinal {
	
	public final int i=10;
	public final int j;
	public final int k;
	Testnonstaticfinal(int j){
		
		this.j=j;
		
	}
	{
		k=10;
	}
	public static void main(String[] args) {
		Testnonstaticfinal tf=new Testnonstaticfinal(10);
		System.out.println(tf.j);
		System.out.println(tf.i);
		System.out.println(tf.k);
		
		
	}
	

}
