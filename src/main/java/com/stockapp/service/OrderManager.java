package com.stockapp.service;

import java.util.ArrayList;
import java.util.List;

import com.stockapp.model.Order;
import com.stockapp.model.Product;

public class OrderManager {
	public static List<Product> itemsList = ProductManager.getStock();
	public static List<Order> orderList = new ArrayList<Order>();
	
	public static void viewItems() {

		for (Product product : itemsList) {
			System.out.println(product);
		}
	}
	
	public static boolean placeOrder(Order ...orders) {
		
		boolean success = false;
		for (Order order : orders) {
			orderList.add(order);
			success = true;
		}
		return success;
	}
	
	public static ArrayList<Order> getOrderDetails(){
		
		return (ArrayList<Order>) orderList;
	}
	
	
}
