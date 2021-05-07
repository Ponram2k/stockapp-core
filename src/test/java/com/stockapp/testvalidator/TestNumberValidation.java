package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.validator.NumberValidation;

public class TestNumberValidation {

	/**
	 * Number validation
	 */
	// if given number is less than 0
	@Test
	public void testNumberIsLessThanZero() {

		boolean valid = NumberValidation.isValidNumber(-1);
		assertFalse(valid);
	}

	// if given number is equals to 0
	@Test
	public void testNumberIsEqualToZero() {

		boolean valid = NumberValidation.isValidNumber(0);
		assertFalse(valid);
	}

	// if given number is greater than 0
	@Test
	public void testNumberIsGreaterThanZero() {
			
		boolean valid = NumberValidation.isValidNumber(0);
		assertTrue(valid);
	}
	
	/**
	 * Mobile number validation
	 */
	// if mobile number less than 10 digits
	@Test
	public void testMobileNumberIsLessThanTenDigit() {
		
		boolean valid = NumberValidation.isValidMobileNumber(890311773L);
		assertFalse(valid);
	}
	
	@Test
	public void testMobileNumberIsEqualToTenDigit() {
		
		boolean valid = NumberValidation.isValidMobileNumber(8903117739L);
		assertTrue(valid);
	}
}
