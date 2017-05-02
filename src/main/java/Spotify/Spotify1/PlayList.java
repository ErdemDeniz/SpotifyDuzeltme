package Spotify.Spotify1;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	static List<String> listOfPlaylist = new ArrayList<String>();
	static List<String> listOfPlaylistBy = new ArrayList<String>();

	public void createPlaylist(String user, String playlist)
	{
		listOfPlaylist.add(playlist);
		listOfPlaylistBy.add(user);
	}
	
	public void findPlaylistBy(String user)
	{
		for(int i = 0; i<listOfPlaylist.size(); i++){
			if(listOfPlaylistBy.get(i).toLowerCase().equals(user.toLowerCase())){
				System.out.println("Wanted Playlist : " + user + " =) " + listOfPlaylist.get(i));
			}
		}
	}
	
	public void findPlaylistBy(String user, String name)
	{
		for(int i = 0; i<listOfPlaylist.size(); i++){
			if(listOfPlaylistBy.get(i).toLowerCase().equals(user.toLowerCase()) && listOfPlaylist.get(i).toLowerCase().equals(name.toLowerCase())){
				System.out.println("Wanted Playlist : " + user + " =) " + listOfPlaylist.get(i));
			}
		}
	}
}
