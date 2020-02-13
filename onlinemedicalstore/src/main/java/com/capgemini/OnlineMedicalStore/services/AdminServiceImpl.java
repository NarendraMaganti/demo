package com.capgemini.OnlineMedicalStore.services;

import com.capgemini.OnlineMedicalStore.dao.AdminDaoImpl;
import com.capgemini.OnlineMedicalStore.dao.ProductDaoImpl;
import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import com.capgemini.OnlineMedicalStore.factory.Factory;

public class AdminServiceImpl implements AdminService{

	AdminDaoImpl adminDao = (AdminDaoImpl) Factory.getAdminDao();
	ProductDaoImpl productDao = (ProductDaoImpl) Factory.getProductDao();
	@Override
	public boolean loginAdmin(int id, String password) {
		return adminDao.loginAdmin(id,password);
	}
	
	

	@Override
	public boolean createProduct(ProductBean bean) {
		return adminDao.createProduct(bean);
	}

	@Override
	public boolean updateProduct(int itemCode,int stock) {
		// TODO Auto-generated method stub
		return adminDao.updateProduct(itemCode,stock);
	}

	@Override
	public boolean deleteProduct(int itemCode) {
		return adminDao.deleteProduct(itemCode);
	}

	@Override
	public boolean deleteUserAccount(int id) {
		return adminDao.deleteUserAccount(id);
	}

	@Override
	public boolean changePassword(int id, String newpassword) {
		return adminDao.changePassword(id,newpassword);
	}

	

}
