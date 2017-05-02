package Spotify.Spotify1;

import org.junit.After;
import org.junit.Test;

public class PlayListTest {
	@Test
	public void register()
	{
		PlayList playlist = new PlayList();
		playlist.createPlaylist("Deniz", "Favori");
		playlist.createPlaylist("Halil", "hayko");
		playlist.createPlaylist("Omer",  "dumannn");
		playlist.createPlaylist("Deniz", "son eklenenler");
		playlist.createPlaylist("Halil", "rasgele");
		playlist.createPlaylist("Huseyin", "liste tarkan");
		playlist.createPlaylist("Huseyin", "liste teoman");
		playlist.createPlaylist("Deniz", "liste teoman");
	}
	@After
	public void testPlaylist()
	{
		PlayList playlist = new PlayList();
		playlist.findPlaylistBy("Deniz");
		playlist.findPlaylistBy("Omer" , "dumannn");
	}
}
