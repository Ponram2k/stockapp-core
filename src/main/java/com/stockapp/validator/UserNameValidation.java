package com.stockapp.validator;

public class UserNameValidation {

	/**
	 * To validate user name should contain minimum of 4 character
	 * And user name does't be empty
	 * @param userName
	 * @return
	 */
	public static boolean isValidUsername(String userName) {
		boolean validUserName = false;
		if (userName != null && !userName.trim().equals("")) {
			if (userName.length() >= 4) {
				validUserName = true;
			}
		}
		return validUserName;
	}

}
