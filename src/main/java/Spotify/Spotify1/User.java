package Spotify.Spotify1;

import java.util.ArrayList;
import java.util.List;

public class User
{
	static List<String> listOfUsers = new ArrayList<String>();
	List<String> passwords = new ArrayList<String>();
	
	public void registerUser(String userName, String password) {
		listOfUsers.add(userName);
		passwords.add(password);
	}

	public void findAllUsers() {
		for(int i = 0; i<listOfUsers.size(); i++){
			System.out.println(listOfUsers.get(i));
		}
	}

}
