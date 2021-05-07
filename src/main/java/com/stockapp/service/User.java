package com.stockapp.service;

import com.stockapp.validator.PasswordValidation;
import com.stockapp.validator.UserNameValidation;

public class User {
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return true if the user exists
	 */
	public static boolean login(String userName, String password) {

		boolean exists = false;
		if (UserNameValidation.isValidUsername(userName) && PasswordValidation.isValidPassword(password)) {
			if (userName.equals("Admin") && password.equals("Admin@1234")) {
				System.out.println("Login successfuly");
				exists = true;
			} else {
				System.out.println("Invalid Username & Password");
			}
		} 
		else {
			System.out.println("Invalid input");
		}
		return exists;
	}
}