package Spotify.Spotify1;

import org.junit.After;
import org.junit.Test;

public class UserTest {

	@Test
	public void register()
	{
		User user = new User();
		user.registerUser("Deniz", "1234");
		user.registerUser("Halil", "2341");
		user.registerUser("Omer", "3412");
		user.registerUser("Huseyin", "4321");
		
	}
	@After
	public void testUsers()
	{
		User users = new User();
		users.findAllUsers();
	}

}
