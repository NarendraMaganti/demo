package com.capgemini.OnlineMedicalStore.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import com.capgemini.OnlineMedicalStore.factory.Factory;
import com.capgemini.OnlineMedicalStore.services.AdminService;
import com.capgemini.OnlineMedicalStore.services.AdminServiceImpl;



public class AdminController {
	static Logger log = LogManager.getLogger("Admin");
	static Scanner scanner = new Scanner(System.in);
    static AdminService adminservice = new AdminServiceImpl();
   
	public static void mainAdmin() {
		log.info("--------Admin Module--------");
		log.info("Enter 1 for admin login");
		log.info("Enter 2 to change password");
		log.info("Enter 3 to add a product");
		log.info("Enter 4 to update a product");
		log.info("Enter 5 to delete a product");
		log.info("Enter 6 to delete an User Account");
		log.info("Enter 7 to log out");
		int select = scanner.nextInt();

		switch (select) {
		case 1:
			adminLogin();
			break;
		case 2:
			log.info("Enter id to change the password..!");
			int i = scanner.nextInt();
			changePassword(i);
			break;
		case 3:
			log.info("Enter details to add a product..!");
			ProductBean bean = new ProductBean();
			createProduct();
			break;
		case 4:
			log.info("Enter item code to update a product ..!");
			int itemCode = scanner.nextInt();
			log.info("Enter the  stock to be updated");
			int stock=scanner.nextInt();
			updateProduct(itemCode,stock);
			break;
		case 5:
			log.info("Enter item code to delete a product..!");
			int ic1 = scanner.nextInt();
			deleteProduct(ic1);
			break;
		case 6:
			log.info("Enter id to delete user account..!");
			int ua = scanner.nextInt();
			deleteUserAccount(ua);
			break;
		case 7:
			log.info("Log out successful");
			break;
		default:
			System.out.println("Please enter valid option...");
			mainAdmin();
		}
	}
	public static boolean adminLogin() {
		log.info("  Please Login ");
		log.info(" Enter admin id ");
		int id = scanner.nextInt();
		log.info(" Enter Password ");
		String password = scanner.next();
		boolean a = Factory.getAdminDao().loginAdmin(id, password);
		if (a == true) {
			log.info("Login successfully..!");
		} else {
			log.info("Id and Password Mis-Matches..!");
			log.info("**************************************");
			HomeController.backToHome();
		}
		return false;
	}

	public static boolean changePassword(int id) {
		log.info("Enter the new password");
		String newpassword=scanner.next();
		boolean a = Factory.getAdminDao().changePassword(id, newpassword);
		if (a == true) {
			log.info("Password changed successfully..!");
		} else {
			log.info("Password is same as old password..!");
		}
		return a;
	}


	public static boolean createProduct() {
		ProductBean bean = new ProductBean();
		 log.info("enter item code");
		 bean.setItemCode(scanner.nextInt());
		 log.info("enter category type");
		 bean.setCategoryType(scanner.next());
		 log.info("enter item name");
		 bean.setItemName(scanner.next());
		 log.info("enter price");
		 bean.setPrice(scanner.nextDouble());
		 log.info("enter manufacturing date");
		 bean.setManufacturingDate(scanner.next());
		 log.info("enter expiry date");
		 bean.setExpiryDate(scanner.next());
		 log.info("enter stock");
		 bean.setStock(scanner.nextInt());
		 log.info("enter supplier name");
		 bean.setSupplierName(scanner.next());
		 
		 if (adminservice.createProduct(bean)) {
				log.info("product added successfully....!");
				return true;
			} else {
				log.info("Product cant be added");			
				return false;
			}
	}

	public static boolean updateProduct(int itemCode,int stock) {
		// take the new inputs to update stocks and/or other fields
//		log.info("Enter the stock to be updated");
//		int stock1=scanner.nextInt();
		boolean a = Factory.getAdminDao().updateProduct(itemCode,stock);
		System.out.println(a);
		if (a == true) {
			log.info("Product updated successfully..!");
		} else {
			log.info("Product cant be updated..!");
		}
		return false;
	}

	public static boolean deleteProduct(int ic1) {
		boolean a = Factory.getAdminDao().deleteProduct(ic1);
		if (a == true) {
			log.info("Product deleted successfully..!");
		} else {
			log.info("Product cant be deleted..!");
		}
		return false;
	}

	public static boolean deleteUserAccount(int ua) {
		boolean a = Factory.getAdminDao().deleteUserAccount(ua);
		if (a == true) {
			log.info("User Account deleted successfully..!");
		} else {
			log.info("Account doesn't exists..!");
		}
		return false;
	}

}