package com.stock;

public class User {
	/**
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public static boolean logIn(String userName, String password) {

		boolean exists = false;
		if (Validate.isValideUsername(userName) && Validate.isValidePassword(password)) {
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
