package com.stockapp.testservise;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.model.User;
import com.stockapp.service.UserManager;

public class TestRegisterManager {

	@Test
	public void testAddUser() {
		User user1 = new User();
		user1.name = "Ponram";
		user1.mobileNumber = 8903117739L;
		user1.email = "ponram2503@gmail.com";
		user1.password = "Ponram@123";

		User user2 = new User();
		user2.name = "Siva";
		user2.mobileNumber = 9302116632L;
		user2.email = "siva@gmail.com";
		user2.password = "SiVa#123";

		User user3 = new User();
		user3.name = "Raja";
		user3.mobileNumber = 7658934121L;
		user3.email = "raja@gmail.com";
		user3.password = "Raja$123";

		boolean valid = UserManager.addUser(user1, user2, user3);

		assertTrue(valid);
	}

	@Test
	public void testIsDuplicateUser() {
		User user = new User();
		user.name = "Raja";
		user.mobileNumber = 7658934121L;
		user.email = "raja@gmail.com";
		user.password = "Raja$123";
		
		boolean valid = UserManager.addUser(user);

		assertFalse(valid);
	}
}
