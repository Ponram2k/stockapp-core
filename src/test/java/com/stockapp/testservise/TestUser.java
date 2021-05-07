package com.stockapp.testservise;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.service.User;

public class TestUser {

	@Test
	public void usernameValidationTest() {
		boolean existsLogin = User.login("Admin","Admin1@232");
		assertFalse(existsLogin);
	}
	
	@Test
	public void passwordValidationTest() {
		boolean existsLogin = User.login("Admin","Admin1");
		assertFalse(existsLogin);
	}
	
	@Test
	public void bothUserNameAndPasswordCorrect() {
		boolean existsLogin = User.login("Admin","Admin@1234");
		assertTrue(existsLogin);
	}
	
	@Test
	public void bothUserNameAndPasswordWrong() {
		boolean existsLogin = User.login("Admin1","Admin1@232");
		assertFalse(existsLogin);
	}
	
	@Test
	public void usernameCorrectAndPasswordWrong() {
		boolean existsLogin = User.login("Admin","Admin1@232");
		assertFalse(existsLogin);
	}
	
	@Test
	public void usernameWrongAndPasswordCorrect() {
		boolean existsLogin = User.login("Admin1","Admin1@232");
		assertFalse(existsLogin);
	}
}
