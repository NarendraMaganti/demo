package com.capgemini.OnlineMedicalStore.dao;

import java.util.List;

import com.capgemini.OnlineMedicalStore.dto.ProductBean;

public interface ProductDao {
	
	public List<ProductBean> showProducts();
	public void cartProduct(int id,int quantity,int uid);
	public void makeOrder(int id);
    public void viewCart();
}
