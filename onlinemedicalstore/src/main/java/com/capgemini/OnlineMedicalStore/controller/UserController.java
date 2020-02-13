package com.capgemini.OnlineMedicalStore.controller;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.OnlineMedicalStore.dao.ProductDao;
import com.capgemini.OnlineMedicalStore.dao.ProductDaoImpl;
import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import com.capgemini.OnlineMedicalStore.dto.UserBean;
import com.capgemini.OnlineMedicalStore.factory.Factory;

public class UserController {
	static Scanner scanner = new Scanner(System.in);
	static Logger log = LogManager.getLogger("UserBean");
	static int id = 0;

	public void mainUser() {
		log.info("select a number accordingly");
		log.info("1.userLogin");
		log.info("2.usersignup");
		log.info("3.to view products");
		switch (scanner.nextInt()) {
		case 1:
			boolean l = userLogin();
			if (l) {
				ProductDao p = Factory.getProductDao();
				log.info("UserBean is login");
				log.info("1.to view products");
				log.info("2.to view cart");
				log.info("3.to view orders");
				switch (scanner.nextInt()) {
				case 1:
					log.info("------------------------------MEDICINES AND PRODUCTS------------------------------------------");
					List<ProductBean> productList = p.showProducts();
					for (ProductBean productBean : productList) {
//						System.out.println("product code = " + productBean.getItemCode());
						log.info(productBean.getItemCode() + "	" + productBean.getItemName() + "		" + productBean.getCategoryType() + "	"
								+ productBean.getPrice() + "	" + "	" + productBean.getManufacturingDate() + "		"
								+ productBean.getExpiryDate() + "	" + productBean.getStock() + "	" + productBean.getSupplierName());
						
						System.out.println("---------------------------------");
					}
					log.info("enter the product number you want to add to cart");
					int select = scanner.nextInt();
					log.info("enter the quantity you want to add to cart");
					int quantity = scanner.nextInt();
					p.cartProduct(select, quantity, id);
					p.makeOrder(id);
					break;
				case 2:
					log.info("-------CART----------");
					

				}
			}
			break;
		case 2:
//			UserBean u = Factory.getUser();
//			log.info("Enter the ID");
//			u.setId(scanner.nextInt());
//			log.info("Enter the name");
//			u.setName(scanner.next());
//			log.info("Enter the password");
//			u.setPassword(scanner.next());
//			log.info("Enter the mobie number");
//			u.setMobileNumber(scanner.nextLong());
//			log.info("Enter the email");
//			u.setEmail(scanner.next());
//			log.info("Enter the address");
//			u.setEmail(scanner.next());
			boolean s = userSignUp();
			if (s) {
				log.info("you're succcessfully registered");
			} else {
				log.info("not registered");
			}
			break;
		case 3:
			Factory.getProductDao().showProducts();
		}
	}

	public boolean userLogin() {

		log.info("  Please Login ");
		log.info(" Enter userBean id ");
		id = scanner.nextInt();
		log.info(" Enter Password ");
		String password = scanner.next();
		boolean a = Factory.getUserDao().loginUser(id, password);
		return a;
	}

	public boolean userSignUp() {
		
		UserBean newUserBean = Factory.getUser();
		newUserBean.setUserType("user");

		log.info("please enter all credentials to signup");
		log.info("enter id");
		newUserBean.setId(scanner.nextInt());
		scanner.nextLine();
		log.info("enter name");
		newUserBean.setName(scanner.nextLine());
		log.info("enter password");
		newUserBean.setPassword(scanner.next());
		newUserBean.setUserType("userBean");
		log.info("enter email");
		newUserBean.setEmail(scanner.next());
		log.info("enter mobile number");
		newUserBean.setMobileNumber(scanner.nextLong());
		scanner.nextLine();
		log.info("enter address");
		newUserBean.setAddress(scanner.nextLine());
		boolean e = Factory.getUserDao().signUpUser(newUserBean);
		return e;
	}

}
