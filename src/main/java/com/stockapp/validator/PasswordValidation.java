package com.stockapp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	/**
	 * Validate the password would contain,
	 * minimum of 8 character maximum of 20 characters
	 * Small and capital Alphabets
	 * Some numerical
	 * Some special character 
	 * And no whitespace character should be accepted
	 * @param password
	 * @return boolean value
	 */
	public static boolean isValidPassword(String password) {
		boolean validPassword = false;
		String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])(?=\\S+$).{8,20}$";
		if (password != null) {
			Pattern p = Pattern.compile(check);
			Matcher m = p.matcher(password);
			validPassword = m.matches();
        }
        return validPassword;
	}
}
