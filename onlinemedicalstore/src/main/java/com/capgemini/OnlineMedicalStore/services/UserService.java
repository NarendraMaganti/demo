package com.capgemini.OnlineMedicalStore.services;

import com.capgemini.OnlineMedicalStore.dto.UserBean;

public interface UserService {
	public boolean loginUser(int id, String password);

	public boolean searchProduct(String categoryType, String itemName);

	public boolean signUpUser(UserBean userBean);



	public boolean changePassword(int id, String newpassword);
	
}
