package com.capgemini.OnlineMedicalStore.controller;

import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ProductController {
	static Logger log = LogManager.getLogger("productController");	
	public void showProduct() {
		ProductBean pBean = new ProductBean();
		
		
		log.info(pBean.getItemCode() + "	" + pBean.getItemName() + "	" + pBean.getCategoryType() + "	"
				+ pBean.getPrice() + "	" + "	" + pBean.getManufacturingDate() + "		"
				+ pBean.getExpiryDate() + "	" + pBean.getStock() + "	" + pBean.getSupplierName());
	}
	public void showList() {
		
		log.info("ItemCode" + "	" + "ItemName" + " 	" + "CategoryType" + "	" + "Price" + "	" + "	"
				+ "ManufacturingDate" + "	" + "ExpireDate" + "	" + "Stock" + "	" + "SupplierName");
	}

}
