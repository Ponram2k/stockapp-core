import static org.junit.Assert.*;

import org.junit.Test;

import com.stock.User;

public class TestUser {

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
	public void UserNameCorrectAndPasswordWrong() {
		boolean existsLogin = User.logIn("Admin","Admin1");
		assertEquals(false, existsLogin);
	}
	
	@Test
	public void UserNameWrongAndPasswordCorrect() {
		boolean existsLogin = User.logIn("Admin1"," ");
		assertEquals(false, existsLogin);
	}
}
