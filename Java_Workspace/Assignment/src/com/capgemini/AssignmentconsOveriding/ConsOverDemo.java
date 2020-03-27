package com.capgemini.AssignmentconsOveriding;

public class ConsOverDemo {
	
	ConsOverDemo(){
		System.out.println("default constructor");
	}
	ConsOverDemo(int i){
		System.out.println("different in no of parameters ");
	}
	public static void main(String[] args) {
		ConsOverDemo a=new ConsOverDemo();
		ConsOverDemo a1=new ConsOverDemo(10);
		
		
		
	}
	

}
