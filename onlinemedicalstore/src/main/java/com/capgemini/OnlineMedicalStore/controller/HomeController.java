package com.capgemini.OnlineMedicalStore.controller;

import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HomeController {

	static Logger log = LogManager.getLogger("Home");

	public static void backToHome() {
		Scanner scanner = new Scanner(System.in);
		
		log.info("***** Welcome To Online Medical Store Booking System *****");
		log.info("please select a number ");
		log.info("1.Admin");
		log.info("2.User");
		log.info("3.Visitor");
		log.info("4.About Us");
		int number = scanner.nextInt();
		if (number == 1) {
			log.info("*****Welcome To AdminBean Page *****");
			AdminController ac = new AdminController();
			ac.mainAdmin();
		} else if (number == 2) {
			log.info("*****  Welcome To UserBean Page *****");
			UserController uc = new UserController();
			uc.mainUser();
		} else if (number == 3) {
			log.info("***** Welcome To Visitor Page *****");
			VisitorController vc = new VisitorController();
		} else if (number == 4) {
			log.info("***** 4.About Us *****");
			AboutController auc = new AboutController();
		} else {
			log.info(" Input Number Mismatch");
		}
		scanner.close();

	}
	public static void main(String[] args) {
		HomeController.backToHome();
	}

}
