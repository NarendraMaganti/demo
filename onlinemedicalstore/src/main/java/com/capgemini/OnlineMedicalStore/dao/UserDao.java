package com.capgemini.OnlineMedicalStore.dao;

import com.capgemini.OnlineMedicalStore.dto.UserBean;

public interface UserDao {
	public boolean loginUser(int id, String password);

	public boolean searchProduct(String categoryType, String itemName);

	public boolean signUpUser(UserBean userBean);



	public boolean changePassword(int id, String newpassword);
	

}
