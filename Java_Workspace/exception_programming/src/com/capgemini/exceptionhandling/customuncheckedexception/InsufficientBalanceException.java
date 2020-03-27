package com.capgemini.exceptionhandling.customuncheckedexception;

public class InsufficientBalanceException extends RuntimeException {
	String msg=" Insufficient Balance";

	public InsufficientBalanceException() {
		
	}

	public InsufficientBalanceException(String msg) {
          super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}

	


	

}
