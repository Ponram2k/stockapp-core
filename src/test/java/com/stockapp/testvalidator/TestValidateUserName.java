package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import com.stockapp.validator.ValidateUserName;

import org.junit.Test;

public class TestValidateUserName {

	//Test case for valid user name
	@Test
	public void test() {
		boolean valid = ValidateUserName.isValidUsername("ponram");
		assertTrue(valid);
	}
	
	//Test case when the user name is null
	@Test
	public void testUerNameIsNull() {
		boolean valid = ValidateUserName.isValidUsername(null);
		assertFalse(valid);
	}
}
