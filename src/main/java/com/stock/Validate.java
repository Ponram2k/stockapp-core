package com.stock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	public static boolean isValideUsername(String username) {
		boolean validUsername = false;
		if(username.length() >= 4)
		{
			validUsername = true;
		}
		return validUsername;
	}
	/**
	 * Validate the password would contain,
	 * minimum of 8 character maximum of 20 characters
	 * Small and capital Alphabets
	 * Some numerical
	 * And some special character 
	 * @param password
	 * @return boolean value
	 */
	public static boolean isValidePassword(String password) {
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
