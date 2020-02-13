package com.capgemini.OnlineMedicalStore.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.capgemini.OnlineMedicalStore.dto.UserBean;
import com.capgemini.OnlineMedicalStore.exception.PasswordException;
import com.capgemini.OnlineMedicalStore.exception.ProductException;
import com.capgemini.OnlineMedicalStore.factory.Factory;

public class UserDaoImpl implements UserDao {

	Properties pro;
	static Logger log = LogManager.getLogger("UserDAOImpl");
	UserBean userBean = Factory.getUser();

	public UserDaoImpl() {
		try {
			FileInputStream input = new FileInputStream("user.properties");
			pro = new Properties();
			pro.load(input);
			Class.forName(pro.getProperty("driver"));
		} catch (Exception e) {
			log.info("driver not found");
		}
	}

	@Override
	public boolean loginUser(int id, String password) {
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

		} catch (Exception e) {

			throw new PasswordException("Invalid id and password");
		}
	}

	@Override
	public boolean signUpUser(UserBean userBean) {

		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("insertUserQuery"))) {
			pstmt.setInt(1, userBean.getId());
			pstmt.setString(2, userBean.getUserType());
			pstmt.setString(3, userBean.getName());
			pstmt.setString(4, userBean.getPassword());
			pstmt.setLong(5, userBean.getMobileNumber());
			pstmt.setString(6, userBean.getEmail());
			pstmt.setString(7, userBean.getAddress());
			int rs = pstmt.executeUpdate();
			System.out.println(rs);
			if (rs == 1) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean searchProduct(String categoryType, String itemName) {
	
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("searchquery"))) {
			pstmt.setString(1, categoryType);
			pstmt.setString(2, itemName);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String aCategoryType = rs.getString("categoryType");
				String aItemName = rs.getString("itemName");

				if (aCategoryType.equals(categoryType) && aItemName.equals(itemName)) {
					return true;
				}else {
					return false;
			}
			}
		} catch (Exception e) {
			throw new ProductException("No product found");
		}
		return false;

		
	}

	@Override
	public boolean changePassword(int id, String newpassword) {
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

	

}
