
package com.javabrains;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> MusicList = new ArrayList<>();
	List<String> MovieList = new ArrayList<>();
	List<String> GameList = new ArrayList<>();

	ProductServiceImpl() {
		bookList.add("JoyLand");
		bookList.add("How to think rich");
		bookList.add("Ramayana");

		MusicList.add("Atarinti daredi");
		MusicList.add("Abinandana");
		MusicList.add("Gang Leader");

		MovieList.add("black water");
		MovieList.add("Cast Away");
		MovieList.add("Shathamanam bhavathi");

		GameList.add("volleyball");
		GameList.add("cricket");
		GameList.add("tennis");
	}

	public List<String> getProductCatergories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("Games");

		return categories;
	}

	public List<String> getProducts( String category){
		switch (category.toLowerCase()) {
		case "Books":
			return bookList;		
		case "Music":
			return MusicList;		
		case "Movies":
			return MovieList;
		case "Games":
			return GameList;
		default:
			return null;		
		}
	}
	
	
}