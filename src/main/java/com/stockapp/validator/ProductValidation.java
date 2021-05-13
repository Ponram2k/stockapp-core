package com.stockapp.validator;

import com.stockapp.model.Product;
import com.stockapp.util.NumberValidator;
import com.stockapp.util.StringValidator;

public class ProductValidation {

	/**
	 * This method is used to check whether, 
	 * The item id,brand name,item name and category should not to be null and empty string input
	 * And quantity and rate of the product should not lesser than zero
	 * @param product
	 * @return
	 */
	public static boolean isValidProduct(Product product) {
		boolean valid = false;
		if (StringValidator.isValidString(product.itemId) 
				&& StringValidator.isValidString(product.brandName)
				&& StringValidator.isValidString(product.itemName)
				&& StringValidator.isValidString(product.itemCategory)
				&& NumberValidator.isValidNumber(product.quantity)
				&& NumberValidator.isValidNumber(product.rate)) {
			valid = true;
			
		}
		
		return valid;
	}
}
