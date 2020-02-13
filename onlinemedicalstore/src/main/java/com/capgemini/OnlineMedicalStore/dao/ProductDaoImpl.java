package com.capgemini.OnlineMedicalStore.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.OnlineMedicalStore.dto.ProductBean;
import com.capgemini.OnlineMedicalStore.factory.Factory;

public class ProductDaoImpl implements ProductDao {

	static Logger log = LogManager.getLogger("ProductDAOImpl");
	static Properties pro;
	static int a = 0;
	static ProductBean pBean = Factory.getProductBean();
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static int rsi = 0;
	static String category = null;
	static String pname = null;
	static int b = 0;
	static ArrayList<Integer> orderId = new ArrayList<Integer>();
	static double total = 0;

	public ProductDaoImpl() {
		try {
			FileInputStream fs = new FileInputStream("product.properties");
			pro = new Properties();
			pro.load(fs);
			Class.forName(pro.getProperty("driver"));
		} catch (Exception e) {
			log.info("driver not found");
		}
	}

	@Override
	public List<ProductBean> showProducts() {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("query1"))) {
			rs = pstmt.executeQuery();
//			log.info("ItemCode" + "	" + "ItemName" + "	" + "CategoryType" + "	" + "Price" + "	" + "ManufacturingDate"
//					+ "	" + "ExpireDate" + "	" + "Stock" + "	" + "SupplierName");
			List<ProductBean> productsList = new ArrayList<>();
			while (rs.next()) {
				ProductBean pBean = new ProductBean();
				pBean.setItemCode(rs.getInt("itemCode"));
				pBean.setCategoryType(rs.getString("categoryType"));
				pBean.setItemName(rs.getString("itemName"));
				pBean.setPrice(rs.getInt("price"));
				pBean.setManufacturingDate(rs.getString("manufacturingDate"));
				pBean.setExpiryDate(rs.getString("expiryDate"));
				pBean.setStock(rs.getInt("stock"));
				pBean.setSupplierName(rs.getString("supplierName"));
				
				productsList.add(pBean);

				
//				log.info(pBean.getItemCode() + "	" + pBean.getItemName() + "		" + pBean.getCategoryType() + "	"
//						+ pBean.getPrice() + "	" + "	" + pBean.getManufacturingDate() + "		"
//						+ pBean.getExpiryDate() + "	" + pBean.getStock() + "	" + pBean.getSupplierName());

			}
			return productsList;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void cartProduct(int id, int quantity, int uid) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("query2"))) {
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				category = rs.getString("categoryType");
				pname = rs.getString("itemName");
				b = rs.getInt("price");
			}
			double orderPrice = b * quantity;
			addToCart(uid, id, quantity, orderPrice, category, pname);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

	public void addToCart(int id, int select, int quantity, double orderPrice, String category, String pname) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt1 = conn
						.prepareStatement("select quantity from cart where id = ? and itemCode = ?");
				PreparedStatement pstmt2 = conn
						.prepareStatement("update cart set quantity = ? where id = ? and itemCode = ? ");
				PreparedStatement pstmt3 = conn.prepareStatement(pro.getProperty("query3"))) {

			pstmt1.setInt(1, id);
			pstmt1.setInt(2, select);
			ResultSet rs = pstmt1.executeQuery();
			if (rs.next()) {
				int oldQuantity = rs.getInt("quantity");
				oldQuantity = oldQuantity + quantity;
				pstmt2.setInt(1, oldQuantity);
				pstmt2.setInt(2, id);
				pstmt2.setInt(3, select);

				rsi = pstmt2.executeUpdate();
				if (rsi > 0) {
					System.out.println("Product already in the cart. Updated the quantity.");
				}

			} else {

				pstmt3.setInt(1, id);
				pstmt3.setInt(2, select);
				pstmt3.setString(3, pname);
				pstmt3.setString(4, category);
				pstmt3.setInt(5, quantity);
				pstmt3.setDouble(6, orderPrice);
				rsi = pstmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println(" not added to cart ");
			e.getMessage();
			e.printStackTrace();
		}
	}

	@Override
	public void makeOrder(int id) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("query4"))) {
			pstmt.setInt(1, id);
			pstmt.setDouble(2, getTotal(id));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("order data not inserted");
		}

	}

	public static double getTotal(int id) {
		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("query5"))) {
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				total = total + rs.getDouble("orderPrice");
			}
		} catch (Exception e) {
			System.out.println("query not executed");
			e.getMessage();
		}
		return total;
	}

	@Override
	public void viewCart() {

		try (Connection conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"),
				pro.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(pro.getProperty("query6"))) {
			rs = pstmt.executeQuery();
			log.info("Id" + "	" + "ItemCode" + " 	" + "itemName" + "	" + "CategoryType" + "	" + "quantity" + "	"
					+ "orderPrice");

			while (rs.next()) {
				pBean.setItemCode(rs.getInt("id"));
				pBean.setCategoryType(rs.getString("itemCode"));
				pBean.setItemName(rs.getString("itemName"));
				pBean.setPrice(rs.getInt("categoryType"));
				pBean.setManufacturingDate(rs.getString("quantity"));
				pBean.setExpiryDate(rs.getString("orderPrice"));
				log.info(pBean.getItemCode() + "	" + pBean.getItemName() + "	" + pBean.getCategoryType() + "	"
						+ pBean.getPrice() + "	" + "	" + pBean.getManufacturingDate() + "		"
						+ pBean.getExpiryDate() + "	" + pBean.getStock() + "	" + pBean.getSupplierName());

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}