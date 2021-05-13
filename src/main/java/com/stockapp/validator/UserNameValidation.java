package com.stockapp.validator;

import com.stockapp.util.StringValidator;

public class UserNameValidation {

	/**
	 * To validate user name should contain minimum of 4 character
	 * And user name does't be empty
	 * @param userName
	 * @return
	 */
	public static boolean isValidUsername(String userName) {
		boolean validUserName = false;
		if (StringValidator.isValidString(userName)) {
			if (userName.length() >= 4) {
				validUserName = true;
			}
		}
		return validUserName;
	}

}
