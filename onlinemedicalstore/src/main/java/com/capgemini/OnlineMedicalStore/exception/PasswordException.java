package com.capgemini.OnlineMedicalStore.exception;

public class PasswordException extends RuntimeException {
	String msg;

	public PasswordException(String msg) {
		this.msg = msg;

	}

	@Override
	public String getMessage() {
		return msg;
	}
}