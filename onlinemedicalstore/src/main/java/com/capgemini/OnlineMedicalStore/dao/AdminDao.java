package com.capgemini.OnlineMedicalStore.dao;

import com.capgemini.OnlineMedicalStore.dto.ProductBean;

public interface AdminDao {
	public boolean loginAdmin(int id,String password);
	public boolean createProduct(ProductBean bean);
	public boolean updateProduct(int itemCode,int stock);
	public boolean deleteProduct(int itemCode);
	public boolean deleteUserAccount(int id);
	boolean changePassword(int id, String newpassword);
}
