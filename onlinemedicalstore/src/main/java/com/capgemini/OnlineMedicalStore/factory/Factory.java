package com.capgemini.OnlineMedicalStore.factory;

import com.capgemini.OnlineMedicalStore.controller.ProductController;
import com.capgemini.OnlineMedicalStore.dao.AdminDao;
import com.capgemini.OnlineMedicalStore.dao.AdminDaoImpl;
import com.capgemini.OnlineMedicalStore.dao.ProductDao;
import com.capgemini.OnlineMedicalStore.dao.ProductDaoImpl;
import com.capgemini.OnlineMedicalStore.dao.UserDao;
import com.capgemini.OnlineMedicalStore.dao.UserDaoImpl;
import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import com.capgemini.OnlineMedicalStore.dto.UserBean;

public class Factory {

	private Factory() {

	}

	public static AdminDao getAdminDao() {

		AdminDao ad = new AdminDaoImpl();
		return ad;

	}

	public static UserDao getUserDao() {

		UserDao ad = new UserDaoImpl();
		return ad;

	}

	public static UserBean getUser() {

		return new UserBean();
	}

	public static ProductBean getProductBean() {
		return new ProductBean();
	}

	public static ProductController getProductController() {

		return new ProductController();
	}

	public static ProductDao getProductDao() {
		ProductDao pd = new ProductDaoImpl();
		return pd;
	}

}
