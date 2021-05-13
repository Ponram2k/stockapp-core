package com.stockapp.service;

import java.util.ArrayList;
import java.util.List;

import com.stockapp.model.User;
import com.stockapp.validator.DuplicateValidation;
import com.stockapp.validator.EmailValidation;
import com.stockapp.validator.MobileNumberValidation;
import com.stockapp.validator.PasswordValidation;
import com.stockapp.validator.UserNameValidation;

public class UserManager {

	private static List<User> registerList = new ArrayList<User>();

	/**
	 * 
	 * @param user
	 * @return
	 */
	public static boolean addUser(User... users) {

		boolean success = false;
		for (User user : users) {
			if (UserNameValidation.isValidUsername(user.name) && EmailValidation.isValidEmail(user.email)
					&& MobileNumberValidation.isValidMobileNumber(user.mobileNumber)
					&& PasswordValidation.isValidPassword(user.password)) {

				if (!DuplicateValidation.isDuplicateUser(registerList,user.name)) {
					registerList.add(user);
					success = true;
				} else {
					System.out.println("User is already exists");
				}
			} else {
				System.out.println("Invalid Data");
			}
		}
		return success;
	}

	/**
	 * @return 
	 * 
	 */
	public static boolean removeUser(String userName, String password) {

		boolean exists;
		int index;
		index = searchUser(userName, password);
		try {
			registerList.remove(index);
			exists = true;
		} catch (Exception e) {
			exists = false;
		}
		return exists;
	}

	/**
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public static int searchUser(String userName, String password) {

		int index = -1;
		for (User user : registerList) {
			if (user.name.equalsIgnoreCase(user.name) && user.password.equals(user.name)) {
				index++;
				break;
			}
			index++;
		}
		return index;
	}
	
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
