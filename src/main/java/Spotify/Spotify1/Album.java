package Spotify.Spotify1;

import java.util.ArrayList;
import java.util.List;

public class Album
{
	static List<String> listOfAlbumsBy = new ArrayList<String>();
	static List<String> listOfAlbums = new ArrayList<String>();
	static List<String> listOfAllAlbums = new ArrayList<String>();
	
	public void createAlbums(String singer, String album){
		listOfAlbumsBy.add(singer);
		listOfAlbums.add(album);
		listOfAllAlbums = listOfAlbums;
	}
	
	public void findAllAlbums(){
		for(int i = 0; i<listOfAlbums.size(); i++){
			System.out.println(listOfAlbumsBy.get(i) + "	=)	" + listOfAllAlbums.get(i));
		}
	}

	public void findAlbumsByName(String name){
		for(int i = 0; i<listOfAllAlbums.size(); i++){
			if(listOfAllAlbums.get(i).toLowerCase().equals(name.toLowerCase())){
				System.out.println("Wanted album : " + name + " =) " + listOfAlbumsBy.get(i));
			}
		}
	}
	
	public void findAlbumsBySinger(String singer){
		for(int i = 0; i<listOfAllAlbums.size(); i++){
			if(listOfAlbumsBy.get(i).toLowerCase().equals(singer.toLowerCase())){
				System.out.println("Wanted singer album : " + singer + " =) " + listOfAllAlbums.get(i));
			}
		}
	}
	
	
}
