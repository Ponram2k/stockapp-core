package com.stockapp.testservise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stockapp.model.Order;
import com.stockapp.model.Product;
import com.stockapp.service.OrderManager;
import com.stockapp.service.ProductManager;

public class TestOrderManager {

	@Before
	public void setUp() throws Exception {

		Product product1 = new Product("it01","Nokia","9s","Mobile",9000,10);

		Product product2 = new Product("it02","Iphone", "SE2020","Mobile",40000,10);

		Product product3 = new Product("it03","Asus","Laptop","X509UA",30000,10);

		Product product4 = new Product("it04","Boat","Heatset","Airdot935",2000,10);

		// Add 4 different product in the ArrayList
		ProductManager.addStock(product1, product2, product3, product4);
	}

	@After
	public void tearDown() throws Exception {
		ProductManager.stockDetails.clear();
	}

	@Test
	public void testViewItems() {
		OrderManager.viewItems();
	}
	
	@Test
	public void testPlaceOrder() {
		
		Order purchase1 = new Order();
		purchase1.billNumber = 1;
		purchase1.name = "ponram";
		
		purchase1.totalAmount = 0;
		purchase1.totalAmountWithGst = 0;
		
		boolean valid = OrderManager.placeOrder(purchase1);
		assertTrue(valid);
	}
	
}
