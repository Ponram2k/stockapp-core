package com.stockapp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	/**
	 * Email format should be
	 * digits—0 to 9
	 * lower case and upper letters — a to z and A to Z
     * Some special characters
     * After @ symbol use domain name for email address with same alphabet and digit's criteria
     * Furthermore, the domain name section of the email address may consist of the following characters:
	 * @param email
	 * @return 
	 */
	public static boolean isValidEmail(String email) {
		
		String check = "^[a-zA-Z0-9_!#$%&.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(email);
		boolean valid = m.matches();
		
		return valid;
	}
}
