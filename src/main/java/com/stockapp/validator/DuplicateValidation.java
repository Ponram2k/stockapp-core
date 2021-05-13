package com.stockapp.validator;

import java.util.List;

import com.stockapp.model.User;

public class DuplicateValidation {
	/**
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isDuplicateUser(List<User> registerList,String name) {

		boolean duplicate = false;
		for (User user : registerList) {
			if (name.equalsIgnoreCase(user.name)) {
				duplicate = true;
				break;
			}
		}
		return duplicate;
	}
}
