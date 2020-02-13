package com.capgemini.OnlineMedicalStore.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PaymentController {
	static Logger log = LogManager.getLogger("Payment..!");
	static Scanner in = new Scanner(System.in);

	public static void makePayment() {

		log.info("Choose the way to make a payment");
		log.info("enter 1 to make a payment by CreditCard..!");
		log.info("enter 2 to make a payment by BHIM/UPI..!");

		int choose = in.nextInt();

		switch (choose) {

		case 1:
			log.info("CreditCard..!");
			creditPayment();
			break;
		case 2:
			log.info("BHIM/UPI");
			scanPayment();
			break;
		}
	}

	public static void scanPayment() {
		log.info("Enter UPI ID:");
		String upiId = in.next();
		transferMoneyViaUPI(upiId);

	}

	public static void creditPayment() {
		log.info("Enter card holder name");
		String name = in.next();
		log.info("Enter the card number");
		int cardNumber = in.nextInt();
		log.info("Enter the expiry date");
		String date = in.next();
		log.info("Enter the cvv number");
		int cvv = in.nextInt();
		transferMoneyViaCard(name, cardNumber, cvv, date);

	}

	private static void transferMoneyViaCard(String name, int cardNumber, int cvv, String date) {
		// just perform validations on the card details data
		// if valid data show "payment successful else un-successful 
	}
	
	private static void transferMoneyViaUPI(String upiID) {
		// Validate upi id and diplay payment successfull or not
	}


}
