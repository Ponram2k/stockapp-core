package com.stockapp.testservise;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stockapp.module.Register;
import com.stockapp.service.RegisterManager;

public class TestRegisterManager {

	@Test
	public void testAddUser() {
		Register user1 = new Register();
		user1.name = "Ponram";
		user1.mobileNumber = 8903117739L;
		user1.email = "ponram2503@gmail.com";
		user1.password = "Ponram@123";

		Register user2 = new Register();
		user2.name = "Siva";
		user2.mobileNumber = 9302116632L;
		user2.email = "siva@gmail.com";
		user2.password = "SiVa#123";

		Register user3 = new Register();
		user3.name = "Raja";
		user3.mobileNumber = 7658934121L;
		user3.email = "raja@gmail.com";
		user3.password = "Raja$123";

		boolean valid = RegisterManager.addUser(user1, user2, user3);

		assertTrue(valid);
	}

	@Test
	public void testIsDuplicateUser() {
		Register user = new Register();
		user.name = "Raja";
		user.mobileNumber = 7658934121L;
		user.email = "raja@gmail.com";
		user.password = "Raja$123";
		
		boolean valid = RegisterManager.addUser(user);

		assertFalse(valid);
	}
}
