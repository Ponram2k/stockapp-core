package com.stockapp.service;

import java.util.ArrayList;

import com.stockapp.module.Register;
import com.stockapp.validator.EmailValidation;
import com.stockapp.validator.NumberValidation;
import com.stockapp.validator.PasswordValidation;
import com.stockapp.validator.UserNameValidation;

public class RegisterManager {

	private static ArrayList<Register> registerList = new ArrayList<Register>();

	/**
	 * 
	 * @param user
	 * @return
	 */
	public static boolean addUser(Register ...users) {

		boolean success = false;
		for (Register user : users) {
			if (UserNameValidation.isValidUsername(user.name) && EmailValidation.isValidEmail(user.email)
					&& NumberValidation.isValidMobileNumber(user.mobileNumber)
					&& PasswordValidation.isValidPassword(user.password)) {

				if (!isDuplicateUser(user.name)) {
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

	public static boolean isDuplicateUser(String name) {

		boolean duplicate = false;
		for (Register user : registerList) {
			if (name.equalsIgnoreCase(user.name)) {
				duplicate = true;
				break;
			}
		}
		return duplicate;
	}
}
