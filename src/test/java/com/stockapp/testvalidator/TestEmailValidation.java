package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.validator.EmailValidation;

public class TestEmailValidation {

	@Test
	public void testInvalidEmail1() {
		boolean valid = EmailValidation.isValidEmail("@gamil.com");
		assertFalse(valid);
	}

	@Test
	public void testInvalidEmail2() {
		boolean valid = EmailValidation.isValidEmail("example.gmail.com");
		assertFalse(valid);
	}
	
	@Test
	public void testValidEmail1() {
		boolean valid = EmailValidation.isValidEmail("ecample@gmail.com");
		assertTrue(valid);
	}
	
	@Test
	public void testValidEmail2() {
		boolean valid = EmailValidation.isValidEmail("ecample#12@gmail.com");
		assertTrue(valid);
	}
}
