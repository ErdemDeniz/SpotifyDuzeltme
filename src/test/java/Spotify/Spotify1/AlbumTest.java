package Spotify.Spotify1;

import org.junit.After;
import org.junit.Test;

public class AlbumTest {
	
	@Test
	public void register()
	{
		Album album = new Album();
		album.createAlbums("Hayko Cepkin", "Sandik");
		album.createAlbums("Hayko Cepkin", "Tanisma Bitti");
		album.createAlbums("Duman", "Ah");
		album.createAlbums("Duman", "Helal Olsun");
		album.createAlbums("Duman", "Senden Daha Guzel");
		album.createAlbums("Tarkan", "Dudu");
		album.createAlbums("Teoman", "Onyedi");
		album.createAlbums("Teoman", "Yavas Yavas");
	}
	@After
	public void testAlbums()
	{
		Album album = new Album();
		album.findAllAlbums();
	}
	@After
	public void testAlbumSreachByName()
	{
		Album album = new Album();
		album.findAlbumsByName("Dudu");
	}
	@After
	public void testAlbumSreachBySinger()
	{
		Album album = new Album();
		album.findAlbumsBySinger("Duman");
	}
	
}
