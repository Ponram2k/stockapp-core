package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import com.stockapp.validator.UserNameValidation;

import org.junit.Test;

public class TestValidateUserName {

	//Test case for valid user name
	@Test
	public void test() {
		boolean valid = UserNameValidation.isValidUsername("ponram");
		assertTrue(valid);
	}
	
	//Test case when the user name is null
	@Test
	public void testUerNameIsNull() {
		boolean valid = UserNameValidation.isValidUsername(null);
		assertFalse(valid);
	}
}
