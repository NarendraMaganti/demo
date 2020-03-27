package com.capgemini.exceptionhandling.customcheckedexception;

public class Election  {
	
     public  void voting(int age) throws AgeLimitException {
		if(age<18) {
			throw new AgeLimitException();
		}else {
			System.out.println(" PERSON IS ELIGIBLE FOR VOTING >>>>LET HIM ALLOW ");
		}
		
	}
	
}
