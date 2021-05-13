package com.stockapp.model;

//import java.util.ArrayList;

public class Order {

	public int billNumber;
	public String name;
	public String itemName;
	public int quantity;
	public int prize;
//	public ArrayList<Purchase> purchaseItemList ;
	public int totalAmount;
	public float totalAmountWithGst;

	public String toString() {

		return billNumber + " " + name + " " + itemName + " " + quantity + " " + prize + " " + totalAmount + " "
				+ totalAmountWithGst;
	}
}
