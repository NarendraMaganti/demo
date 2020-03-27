package com.capgemini.AssignmentconsOveriding;

public class Chaining {
	
	Chaining(){
		this("john");
		System.out.println("default");
	}
	Chaining(String name){
		System.out.println("chaining construcor");
		
	}
	public static void main(String[] args) {
		
		Chaining cng=new Chaining();
		
		
		
		
	}
	
	
	

}
