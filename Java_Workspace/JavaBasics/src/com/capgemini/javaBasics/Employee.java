package com.capgemini.javaBasics;

public class Employee {
	static String name="abc";//correct way to initialize
	static int age=24;
	static {
		System.out.println(name="johnconstructor");//correct way to initialize
		System.out.println(age=30);
		
	}
	static void method() {
		System.out.println(name="johnconstructor");//Reintializing
		System.out.println(age=30);
		
	}
		
		void method1() {
			name="johnnonstatic";// Re-intializing
			age=29;
		}
		
		Employee(){
			System.out.println(name="johnconstructor");//Re-intializing
			System.out.println(age=30);
			
			
		}
		public static void main(String[] args) {
			Employee.method();
			Employee emp=new Employee();
			emp.method1();
			
			
			
		}
		
		
		
		
	}


