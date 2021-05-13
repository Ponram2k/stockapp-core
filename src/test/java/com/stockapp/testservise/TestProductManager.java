package com.stockapp.testservise;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stockapp.model.Product;
import com.stockapp.service.ProductManager;

public class TestProductManager {

	@Before
	public void setUp() throws Exception {

		Product product1 = new Product("it01","Nokia","9s","Mobile",9000,10);
//		product1.itemCode = "it01";
//		product1.brandName = "Nokia";
//		product1.itemCategory = "Mobile";
//		product1.itemName = "9s";
//		product1.rate = 9000;
//		product1.quantity = 10;
//		product1.amount = product1.rate * product1.quantity;

		Product product2 = new Product("it02","Iphone", "SE2020","Mobile",40000,10);
//		product2.itemCode = "it02";
//		product2.brandName = "Iphone";
//		product2.itemCategory = "Mobile";
//		product2.itemName = "SE2020";
//		product2.rate = 40000;
//		product2.quantity = 10;
//		product2.amount = product2.rate * product2.quantity;

		Product product3 = new Product("it03","Asus","Laptop","X509UA",30000,10);
//		product3.itemCode = "it03";
//		product3.brandName = "Asus";
//		product3.itemCategory = "Laptop";
//		product3.itemName = "X509UA";
//		product3.rate = 30000;
//		product3.quantity = 10;
//		product3.amount = product3.rate * product3.quantity;

		Product product4 = new Product("it04","Boat","Heatset","Airdot935",2000,10);
//		product4.itemCode = "it04";
//		product4.brandName = "Boat";
//		product4.itemCategory = "Heatset";
//		product4.itemName = "Airdot935";
//		product4.rate = 2000;
//		product4.quantity = 10;

		// Add 4 different product in the ArrayList
		ProductManager.addStock(product1, product2, product3, product4);
	}

	@After
	public void tearDown() throws Exception {
		ProductManager.stockDetails.clear();
	}

	@Test
	public void testValidStock() {
		
		Product product1 = new Product("it01","Nokia","9s","Mobile",9000,10);
		Product product2 = new Product("it02","Iphone", "SE2020","Mobile",40000,10);
		Product product3 = new Product("it03","Asus","Laptop","X509UA",30000,10);
		Product product4 = new Product("it04","Boat","Heatset","Airdot935",2000,10);

		boolean success = ProductManager.addStock(product1, product2, product3, product4);
		assertTrue(success);
	}
	
	@Test
	public void testInvalidStock() {
		
		Product product1 = new Product("it01"," ","9s","Mobile",9000,10);

		boolean success = ProductManager.addStock(product1);
		assertFalse(success);
	}

	@Test
	public void testDisplayStock() {

		ProductManager.displayStock();
	}
	
	@Test
	public void testGetStock() {

		ArrayList<Product> checkList = new ArrayList<Product>();
		checkList = (ArrayList<Product>) ProductManager.getStock();

		// Get the particular product from the 0 index
		Product checkProduct = checkList.get(0);

		// Check the product is correctly added in ArrayList
		assertEquals(1, checkProduct.itemId);
	}
	
	@Test
	public void testFilterStock() {
		
		ProductManager.filterStockByCategory("laptop");
	}

	@Test
	public void testgetFilterStock() {

		ArrayList<Product> fliterCheckList = new ArrayList<Product>();
		
		// store the filtered list in checkList from productDetails ArrayList
		fliterCheckList = ProductManager.getFilterStockByCategory("laptop");
		
		// get particular product from checkList store it in checkProduct
		Product checkProduct = fliterCheckList.get(0);
		
		// check the given category is correctly added in checkProduct
		assertEquals("Laptop", checkProduct.itemCategory);
	}
}
