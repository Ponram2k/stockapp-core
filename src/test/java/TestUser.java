import static org.junit.Assert.*;

import org.junit.Test;

import com.stock.User;

public class TestUser {

	@Test
	public void usernameValidationTest() {
		boolean existsLogin = User.logIn("Adm","Admin1@232");
		assertEquals(false, existsLogin);
	}
	
	@Test
	public void passwordValidationTest() {
		boolean existsLogin = User.logIn("Admin","Admin1");
		assertEquals(false, existsLogin);
	}
	
	@Test
	public void bothUserNameAndPasswordCorrect() {
		boolean existsLogin = User.logIn("Admin","Admin@1234");
		assertEquals(true, existsLogin);
	}
	
	@Test
	public void bothUserNameAndPasswordWrong() {
		boolean existsLogin = User.logIn("Admin1","Admin1@232");
		assertEquals(false, existsLogin);
	}
	
	@Test
	public void usernameCorrectAndPasswordWrong() {
		boolean existsLogin = User.logIn("Admin","Admin1@232");
		assertEquals(false, existsLogin);
	}
	
	@Test
	public void usernameWrongAndPasswordCorrect() {
		boolean existsLogin = User.logIn("Admin1","Admin1@232");
		assertEquals(false, existsLogin);
	}
	
}
