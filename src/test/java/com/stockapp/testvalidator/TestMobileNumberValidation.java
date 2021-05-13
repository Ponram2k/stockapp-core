package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.validator.MobileNumberValidation;

public class TestMobileNumberValidation {
	
	/**
	 * Mobile number validation
	 */
	// if mobile number less than 10 digits
	@Test
	public void testMobileNumberIsLessThanTenDigit() {
		
		boolean valid = MobileNumberValidation.isValidMobileNumber(890311773L);
		assertFalse(valid);
	}
	
	@Test
	public void testMobileNumberIsEqualToTenDigit() {
		
		boolean valid = MobileNumberValidation.isValidMobileNumber(8903117739L);
		assertTrue(valid);
	}
}
