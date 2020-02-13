package com.capgemini.OnlineMedicalStore.util;

import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncoder {
	static Scanner scanner = new Scanner(System.in);
	
	public static String passwordEncoder(String plainPassword) {
		
		return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the password to be encoder");
		String plainPassword = scanner.next();
		String sec = passwordEncoder(plainPassword);
		System.out.println(sec);
		System.out.println(sec.length());
		
		
		
		
	}

}
