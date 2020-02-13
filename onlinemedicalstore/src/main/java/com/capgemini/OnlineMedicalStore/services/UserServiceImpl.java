package com.capgemini.OnlineMedicalStore.services;

import com.capgemini.OnlineMedicalStore.dao.UserDaoImpl;
import com.capgemini.OnlineMedicalStore.dto.UserBean;
import com.capgemini.OnlineMedicalStore.factory.Factory;

public class UserServiceImpl implements UserService{
	UserDaoImpl userDao = (UserDaoImpl) Factory.getUserDao();
	@Override
	public boolean loginUser(int id, String password) {
		return userDao.loginUser(id, password);
	}

	@Override
	public boolean searchProduct(String categoryType, String itemName) {
		return userDao.searchProduct(categoryType, itemName);
	}

	@Override
	public boolean signUpUser(UserBean userBean) {
		return userDao.signUpUser(userBean);
	}

	@Override
	public boolean changePassword(int id, String newpassword) {
		return userDao.changePassword(id, newpassword);
	}

}
