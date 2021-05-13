package com.stockapp.service;

import java.util.ArrayList;
import java.util.List;

import com.stockapp.model.Product;
import com.stockapp.validator.ProductValidation;

public class ProductManager {

	public static List<Product> stockDetails = new ArrayList<Product>();

	/**
	 * This method is used to add the product in the ArrayList
	 * 
	 * @param product
	 * @throws Exception
	 */
	public static boolean addStock(Product... products) {

		boolean added = false;
		for (Product product : products) {
			if (ProductValidation.isValidProduct(product)) {
				stockDetails.add(product);
				added = true;
			}
			else {
				System.out.println("Invalid Product Details");
			}
		}
		return added;
	}

	/**
	 * This method is used the get the product in another list
	 * 
	 * @return product ArrayList
	 */
	public static List<Product> getStock() {

		return stockDetails;
	}

	/**
	 * This method is used to display product
	 * 
	 * @param category
	 */
	public static void filterStockByCategory(String category) {

		for (Product product : stockDetails) {
			if (product.itemCategory.equalsIgnoreCase(category)) {
				System.out.println(product.itemId + " " + product.brandName + " " + product.itemCategory + " "
						+ product.itemName + " " + product.rate + " " + product.quantity + " " + product.amount);
			}
		}
	}

	/**
	 * This method is used to display and return filtered product
	 * 
	 * @param category
	 * @return
	 */

	public static ArrayList<Product> getFilterStockByCategory(String category) {

		ArrayList<Product> filterList = new ArrayList<Product>();
		for (Product product : stockDetails) {
			if (product.itemCategory.equalsIgnoreCase(category)) {
				filterList.add(product);
			}
		}
		return filterList;
	}

	/**
	 * This method is used to display all product's in the ArrayList
	 */
	public static void displayStock() {

		for (Product product : stockDetails) {
			System.out.println(product.itemId + " " + product.brandName + " " + product.itemCategory + " "
					+ product.itemName + " " + product.rate + " " + product.quantity + " " + product.amount);
		}
	}
}
