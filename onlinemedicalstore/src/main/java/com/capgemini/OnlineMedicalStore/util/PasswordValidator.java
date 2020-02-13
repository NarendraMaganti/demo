package com.capgemini.OnlineMedicalStore.util;

import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordValidator {
	static Scanner scanner = new Scanner(System.in);
	
	
	public static boolean passwordValidator(String plainPassword, String hashPassword) {
		return BCrypt.checkpw(plainPassword, hashPassword);
		
	}
	
	public static void main(String[] args) {
		System.out.println("enter the password to be encoder");
		String plainPassword = scanner.next();
		String hashPassword = PasswordEncoder.passwordEncoder(plainPassword);
		System.out.println(hashPassword);
		System.out.println("enter the password to check");
		String password = scanner.next();
		boolean valid = passwordValidator(password, hashPassword);
		if(valid) {
			System.out.println("password matches");
		} else {
			System.out.println("unmatched");
		}
		
		scanner.close();
		
	}

}
