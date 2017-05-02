package Spotify.Spotify1;

import java.util.ArrayList;
import java.util.List;

public class Singer {
	static List<String> listOfSingers = new ArrayList<String>();

	public void findAllSingers() {
		for(int i = 0; i<listOfSingers.size(); i++){
			System.out.println(listOfSingers.get(i));
		}
	}
	
	public Singer(){}
	
	public Singer(String singer)
	{
		listOfSingers.add(singer);
	}
	
	public void findSingerBy(String string){
		for(int i = 0; i<listOfSingers.size(); i++){
			if(listOfSingers.get(i).toLowerCase().equals(string.toLowerCase())){
				System.out.println("Wanted singer : " + string);
			}
		}
	}
}
