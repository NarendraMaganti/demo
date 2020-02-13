package com.capgemini.OnlineMedicalStore.services;

import com.capgemini.OnlineMedicalStore.dao.AdminDaoImpl;
import com.capgemini.OnlineMedicalStore.dao.ProductDaoImpl;
import com.capgemini.OnlineMedicalStore.factory.Factory;

public class ProductServiceImpl implements ProductService{
	ProductDaoImpl productDao = (ProductDaoImpl) Factory.getProductDao();
	@Override
	public void showProducts() {
//		return productDao.showProducts();
		
	}

	@Override
	public void cartProduct(int id, int quantity, int uid) {
//		return productDao.cartProduct(id, quantity, uid);
		
	}

	@Override
	public void makeOrder(int id) {
//	return productDao.makeOrder(id);
		
	}

	@Override
	public void viewCart() {
//		return productDao.viewCart();
	}

}
