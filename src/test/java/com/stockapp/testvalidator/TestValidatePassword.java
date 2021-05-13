package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.validator.PasswordValidation;

public class TestValidatePassword {

	//Test case to satisfy all the condition in isValidPassword method
	@Test
	public void testForValidPassword() {
		boolean valide = PasswordValidation.isValidPassword("Abcd@1234");
		assertTrue(valide);
	}
	
	//Test case for empty password
	@Test
	public void testEmptyPassword() {
		boolean valide = PasswordValidation.isValidPassword("");
		assertFalse(valide);
	}
	
	//Test case for password without Alphabet
	@Test
	public void testPasswordWithoutAlphabet() {
		boolean valide = PasswordValidation.isValidPassword("1234@456");
		assertFalse(valide);
	}
	
	//Test case for password without capital letter
	@Test
	public void testPasswordWithoutCapitalLetter() {
		boolean valide = PasswordValidation.isValidPassword("abcd@1234");
		assertFalse(valide);
	}
	
	//Test case for password without small letter
		@Test
		public void testPasswordWithoutSmallLetter() {
			boolean valide = PasswordValidation.isValidPassword("ABCD@1234");
			assertFalse(valide);
		}
		
		//Test case for password without special character
		@Test
		public void testPasswordWithoutSpecial() {
			boolean valide = PasswordValidation.isValidPassword("Abcd12efg");
			assertFalse(valide);
		}
		
		//Test case for password less than 8 character 
		@Test
		public void testPasswordLessThanEightCharacter() {
			boolean valide = PasswordValidation.isValidPassword("Abcd@12");
			assertFalse(valide);
		}
		
		//Test case for password with whitespace
		@Test
		public void testPasswordWithWhitespace() {
			boolean valide = PasswordValidation.isValidPassword("Abcd@12 3");
			assertFalse(valide);
		}
}
