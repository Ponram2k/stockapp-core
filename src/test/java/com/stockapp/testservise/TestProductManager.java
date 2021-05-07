package com.stockapp.testservise;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stockapp.module.Product;
import com.stockapp.service.ProductManager;

public class TestProductManager {

	@Before
	public void setUp() throws Exception {

		Product product1 = new Product();
		product1.itemCode = 1;
		product1.brandName = "Nokia";
		product1.itemCategory = "Mobile";
		product1.itemName = "9s";
		product1.rate = 9000;
		product1.quantity = 10;
		product1.amount = product1.rate * product1.quantity;

		Product product2 = new Product();
		product2.itemCode = 2;
		product2.brandName = "Iphone";
		product2.itemCategory = "Mobile";
		product2.itemName = "SE2020";
		product2.rate = 40000;
		product2.quantity = 10;
		product2.amount = product2.rate * product2.quantity;

		Product product3 = new Product();
		product3.itemCode = 3;
		product3.brandName = "Asus";
		product3.itemCategory = "Laptop";
		product3.itemName = "X509UA";
		product3.rate = 30000;
		product3.quantity = 10;
		product3.amount = product3.rate * product3.quantity;

		Product product4 = new Product();
		product4.itemCode = 4;
		product4.brandName = "Boat";
		product4.itemCategory = "Heatset";
		product4.itemName = "Airdot935";
		product4.rate = 2000;
		product4.quantity = 10;
		product4.amount = product4.rate * product4.quantity;

		// Add 4 different product in the ArrayList
		ProductManager.addStock(product1, product2, product3, product4);
	}

	@After
	public void tearDown() throws Exception {
		ProductManager.stockDetails.clear();
	}

	@Test
	public void testAddStock() {

		Product checkProduct = ProductManager.stockDetails.get(0);
		assertEquals("Nokia", checkProduct.brandName);
	}

	@Test
	public void testDisplayStock() {

		ProductManager.displayStock();
	}
	
	@Test
	public void testGetStock() {

		ArrayList<Product> checkList = new ArrayList<Product>();
		checkList = ProductManager.getStock();

		// Get the particular product from the 0 index
		Product checkProduct = checkList.get(0);

		// Check the product is correctly added in ArrayList
		assertEquals(1, checkProduct.itemCode);
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
