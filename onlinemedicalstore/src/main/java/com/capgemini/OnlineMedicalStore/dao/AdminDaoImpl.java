package com.capgemini.OnlineMedicalStore.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import com.capgemini.OnlineMedicalStore.exception.PasswordException;
import com.capgemini.OnlineMedicalStore.exception.ProductException;
import com.capgemini.OnlineMedicalStore.exception.UserException;


public class AdminDaoImpl implements AdminDao {

	Properties pro;
	static Logger log = LogManager.getLogger("UserDaoImpl");
//	UserBean userbean = Factory.getUserBean();
//	ProductBean productbean = Factory.getProductBean();

	public AdminDaoImpl() {
		try {
			FileInputStream fs = new FileInputStream("admin.properties");
			pro = new Properties();
			pro.load(fs);
			Class.forName(pro.getProperty("driver"));
		} catch (Exception e) {
			log.info("driver not found");
		}
	}

	@Override
	public boolean loginAdmin(int id, String password) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("loginquery"))) {
			pstmt.setInt(1, id);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (Exception p) {
			p.printStackTrace();
			throw new PasswordException("Invalid ID and Password");

		}

	}

	@Override
	public boolean changePassword(int id,String  newpassword) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("updatequery"))) {

			pstmt.setString(1, newpassword);
			pstmt.setInt(2, id);
			
			
			int i = pstmt.executeUpdate();
			if (i > 0) {
				return true;
			}else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new PasswordException("already password exist");
			
		}
		
	}

	@Override
	public boolean createProduct(ProductBean bean) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("insertQuery"))) {
			pstmt.setInt(1, bean.getItemCode());
			pstmt.setString(2, bean.getCategoryType());
			pstmt.setString(3, bean.getItemName());
			pstmt.setDouble(4, bean.getPrice());
			pstmt.setString(5, bean.getManufacturingDate());
			pstmt.setString(6, bean.getExpiryDate());
			pstmt.setInt(7, bean.getStock());
			pstmt.setString(8, bean.getSupplierName());
			int count = pstmt.executeUpdate();
		
			if (count > 0) {
				
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
		 e.printStackTrace();
//			e.getMessage();
			 throw new ProductException("product already exists");
		}
		
	}

	@Override
	public boolean updateProduct(int itemCode,int stock) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("updatequery1"))) {
			pstmt.setInt(1, stock);
			pstmt.setInt(2, itemCode);
			int count = pstmt.executeUpdate();
			if (count == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
		
			throw new ProductException("product cannot be updated\nEnter valid itemCode");
		}
		

	}

	@Override
	public boolean deleteProduct(int itemCode) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("deletequery"))) {
			pstmt.setInt(1, itemCode);
			int count = pstmt.executeUpdate();
			if (count > 0) {

				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			
			throw new ProductException("product cannot be deleted\nEnter valid itemCode for the product");
		}

	}

	@Override
	public boolean deleteUserAccount(int id) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("deletequery1"))) {
			pstmt.setInt(1, id);
			int count = pstmt.executeUpdate();
			if (count == 1) {

				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new UserException("Enter valid id for userBean\nUser account cannot be deleted");
		}

	}

	
}

	