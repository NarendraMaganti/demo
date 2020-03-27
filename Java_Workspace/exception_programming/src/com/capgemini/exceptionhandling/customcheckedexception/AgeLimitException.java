package com.capgemini.exceptionhandling.customcheckedexception;

public class AgeLimitException extends Exception {
	String msg=" Age is Less Than 18 years";

	public AgeLimitException() {
		super();
	}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return this.msg;
	}
	
	

}
