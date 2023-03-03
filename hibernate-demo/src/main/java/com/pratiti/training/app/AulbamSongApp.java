package com.pratiti.training.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.pratiti.training.dao.AlbumSongDao;
import com.pratiti.training.entity.Album;
import com.pratiti.training.entity.Song;

public class AulbamSongApp {

	public static void main(String[] args) {
		AlbumSongDao dao = new AlbumSongDao();
		
//Scenario: Adding album
//		Album album = new Album();
//		album.setName("rockstar");
//		album.setReleasedDate(LocalDate.of(2021, 10, 25));
//		album.setCopyright("T series");
		
		
//Scenario: Adding song
//		Object obj = dao.fetchById(Album.class , 2);
//		Album album = (Album)obj;
//		Song s1 = new Song();
//		s1.setTitle("Kesariya");
//		s1.setArtist("Arjit singh");
//		s1.setAlbum(album);
//		dao.save(s1);

//inserting multiple song for one alubam 
//to perform above action we have to write cascade in album class
//		Album album = new Album();
//		album.setName("rockstar");
//		album.setReleasedDate(LocalDate.of(2021, 10, 25));
//		album.setCopyright("T series");
//		
//		
//		Song s1 = new Song();
//		s1.setTitle("Ponni Nadhi");
//		s1.setArtist("A. R. Rahman");
//		s1.setAlbum(album);
//		
//		Song s2 = new Song();
//		s2.setTitle("Achha Sila Diya");
//		s2.setArtist("B Paraak");
//		s2.setAlbum(album);
//
//		
//		List<Song>list=new ArrayList<Song>();
//		list.add(s1);
//		list.add(s2);
//		album.setSongs(list);
//		dao.save(album);
		
//		List<Song>list = dao.fetchSongByArtist("Arjit singh");
//		for(Song s:list) {
//			System.out.print(s.getId()+" "+s.getArtist()+" "+s.getTitle());
//			System.out.println();
//		}
		
		List<Album>list = dao.fetchAlbumByArtist("Arjit singh");
		for(Album s:list) {
			System.out.print(s.getName());
			System.out.println();
		}
	
	}
	
	
	

}
