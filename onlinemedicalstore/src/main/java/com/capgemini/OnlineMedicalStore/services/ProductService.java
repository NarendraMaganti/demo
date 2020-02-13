package com.capgemini.OnlineMedicalStore.services;

public interface ProductService {
	public void showProducts();
	public void cartProduct(int id,int quantity,int uid);
	public void makeOrder(int id);
    public void viewCart();
}
