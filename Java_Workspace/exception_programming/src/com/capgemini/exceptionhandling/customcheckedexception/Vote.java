package com.capgemini.exceptionhandling.customcheckedexception;

public class Vote{
	public static void main(String[] args) {

		Election e=new Election();
		try {
			e.voting(19);
		} catch (AgeLimitException e1) {
			System.out.println(e1.getMessage());
		}

	}
}
