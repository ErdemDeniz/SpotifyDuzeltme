package Spotify.Spotify1;

import java.util.ArrayList;
import java.util.List;

public class Song {
	static List<String> listOfSongsBySinger = new ArrayList<String>();
	static List<String> listOfSongsByAlbum = new ArrayList<String>();
	static List<String> listOfSongs = new ArrayList<String>();
	static List<String> listOfSongsTime = new ArrayList<String>();
	
	public void createSong (String singer , String album , String song, String songTime)
	{
		listOfSongsBySinger.add(singer);
		listOfSongsByAlbum.add(album);
		listOfSongs.add(song);
		listOfSongsTime.add(songTime);
	}
	
	public void getSongDetail(String singer , String name){
		for(int i = 0; i<listOfSongs.size(); i++){
			if(listOfSongsBySinger.get(i).toLowerCase().equals(singer.toLowerCase()) && listOfSongs.get(i).toLowerCase().equals(name.toLowerCase())){
				System.out.println("Song Details : " + singer + " =) " + listOfSongs.get(i) + " Album : " + listOfSongsByAlbum.get(i) + " Time : " + listOfSongsTime.get(i));
			}
		}
	}
}
