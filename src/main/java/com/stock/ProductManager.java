package com.stock;

import java.util.ArrayList;

public class ProductManager {

	public static ArrayList<Product> stockDetails = new ArrayList<Product>();

	/**
	 * This method is used to add the product in the ArrayList
	 * 
	 * @param product
	 */
	public static void addStock(Product... products) {

	for (Product product : products) {
		
		stockDetails.add(product);
		}
	}
	
	
	/**
	 * This method is used to display all product's in the ArrayList
	 */
	public static void displayStock() {
		
		for (Product product : stockDetails) {
			System.out.println(product.itemCode + " " + product.brandName + " " + product.itemCategory + " "
					+ product.itemName + " " + product.rate + " " + product.quantity + " " + product.amount);
		}
	}
  
  }
