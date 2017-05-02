package Spotify.Spotify1;

import org.junit.After;
import org.junit.Test;

public class SongTest {
	@Test
	public void register()
	{
		Song songs = new Song();
		songs.createSong("Hayko Cepkin", "Sandik", "Sandik", "3:30");
		songs.createSong("Teoman", "Onyedi", "17", "4:12");
		songs.createSong("Hayko Cepkin",  "Sandik", "Gelin Olmus", "4:45");
		songs.createSong("Hayko Cepkin", "Tanisma Bitti", "Yanliz Kalsin", "3:55");
		songs.createSong("Duman", "Ah", "Ah", "3:22");
		songs.createSong("Duman", "Helal Olsun", "Helal Olsun", "5:20");
		songs.createSong("Tarkan", "Dudu", "Dudu", "3:30");
		songs.createSong("Tarkan", "Dudu", "Gulumse Kaderine", "4:01");
	}
	@After
	public void testSongs()
	{
		Song songs = new Song();
		songs.getSongDetail("Hayko Cepkin", "Sandik");
		songs.getSongDetail("Duman" , "Ah");
	}
}
