package com.stockapp.testservise;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.service.UserManager;

public class TestUser {

	@Test
	public void usernameValidationTest() {
		boolean existsLogin = UserManager.login("Admin","Admin1@232");
		assertFalse(existsLogin);
	}
	
	@Test
	public void passwordValidationTest() {
		boolean existsLogin = UserManager.login("Admin","Admin1");
		assertFalse(existsLogin);
	}
	
	@Test
	public void bothUserNameAndPasswordCorrect() {
		boolean existsLogin = UserManager.login("Admin","Admin@1234");
		assertTrue(existsLogin);
	}
	
	@Test
	public void bothUserNameAndPasswordWrong() {
		boolean existsLogin = UserManager.login("Admin1","Admin1@232");
		assertFalse(existsLogin);
	}
	
	@Test
	public void usernameCorrectAndPasswordWrong() {
		boolean existsLogin = UserManager.login("Admin","Admin1@232");
		assertFalse(existsLogin);
	}
	
	@Test
	public void usernameWrongAndPasswordCorrect() {
		boolean existsLogin = UserManager.login("Admin1","Admin1@232");
		assertFalse(existsLogin);
	}
}
