package com.stockapp.testvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.validator.ValidatePassword;

public class TestValidatePassword {

	//Test case to satisfy all the condition in isValidPassword method
	@Test
	public void testForValidPassword() {
		boolean valide = ValidatePassword.isValidPassword("Abcd@1234");
		assertTrue(valide);
	}
	
	//Test case for empty password
	@Test
	public void testEmptyPassword() {
		boolean valide = ValidatePassword.isValidPassword("");
		assertFalse(valide);
	}
	
	//Test case for password without Alphabet
	@Test
	public void testPasswordWithoutAlphabet() {
		boolean valide = ValidatePassword.isValidPassword("1234@456");
		assertFalse(valide);
	}
	
	//Test case for password without capital letter
	@Test
	public void testPasswordWithoutCapitalLetter() {
		boolean valide = ValidatePassword.isValidPassword("abcd@1234");
		assertFalse(valide);
	}
	
	//Test case for password without small letter
		@Test
		public void testPasswordWithoutSmallLetter() {
			boolean valide = ValidatePassword.isValidPassword("ABCD@1234");
			assertFalse(valide);
		}
		
		//Test case for password without special character
		@Test
		public void testPasswordWithoutSpecial() {
			boolean valide = ValidatePassword.isValidPassword("Abcd12efg");
			assertFalse(valide);
		}
		
		//Test case for password less than 8 character 
		@Test
		public void testPasswordLessThanEightCharacter() {
			boolean valide = ValidatePassword.isValidPassword("Abcd@12");
			assertFalse(valide);
		}
		
		//Test case for password with whitespace
		@Test
		public void testPasswordWithWhitespace() {
			boolean valide = ValidatePassword.isValidPassword("Abcd@12 3");
			assertFalse(valide);
		}
}
