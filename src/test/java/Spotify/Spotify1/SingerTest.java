package Spotify.Spotify1;

import org.junit.After;
import org.junit.Test;

public class SingerTest {
	
	@Test
	public void register()
	{
		Singer singer = new Singer("Duman");
		singer = new Singer("Tarkan");
		singer = new Singer("Teoman");
		singer = new Singer("Hayko Cepkin");
		
	}
	
	@After
	public void testSingers()
	{
		Singer singer = new Singer();
		singer.findAllSingers();
	}
	
	@After
	public void testSingerSerch()
	{
		Singer singer = new Singer();
		singer.findSingerBy("Tarkan");
	}
}
