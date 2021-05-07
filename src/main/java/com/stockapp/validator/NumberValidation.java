package com.stockapp.validator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NumberValidation {
	
	/**
	 * This method used to check number is greater than zero
	 * @param value
	 * @return true whether the value is greater then zero
	 */
	public static boolean isValidNumber(int value) {
		
		boolean valid = false;
		if(value > 0) {
			valid = true;
		}
		return valid;
	}
	
	/**
	 * Mobile number should be starting digit in 6 to 9
	 * After 9 number should be any digit between 0 to 9
	 * @param mobileNumber
	 * @return true or false
	 */
	public static boolean isValidMobileNumber(long mobileNumber) {
		
		boolean valid;
		String value = Long.toString(mobileNumber);
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(value);
		valid = m.matches();
		return valid;
	}
}
