package com.pratiti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.training.entity.Album;
import com.pratiti.training.entity.Customer;
import com.pratiti.training.entity.Song;

public class AlbumSongDao {
	
//Adding and updating album and song
//marge used for both insert and update
	public void save(Object obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.merge(obj); 
			em.getTransaction().commit();
		} finally {
			emf.close();
		}

		emf.close();
	}
	
//fetch the record in album and song using single function
	public Object fetchById(Class c , int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			// find method generate the select query with where PK is id
			Object pd = em.find(c, id);
			return pd;
		} finally {
			emf.close();
		}
	}
//fetch song by artist name
	public List<Song> fetchSongByArtist(String artist){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			String str = "select s from Song s where s.artist = :at";
			Query q = em.createQuery(str);
			q.setParameter("at", artist);
			List<Song> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}
	

//fetching album having given artist song;
	public List<Album> fetchAlbumByArtist(String artist){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();
		try {
			String str = "select distinct(a) from Album a join a.songs s where s.artist=:at";
			Query q = em.createQuery(str);
			q.setParameter("at", artist);
			List<Album> list = q.getResultList();
			return list;
		} finally {
			emf.close();
		}
	}
	
//Generic way to fetch the record without any warnings
//	public <E>E fetchById(Class<E> c , int id) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
//		EntityManager em = emf.createEntityManager();
//		try {
//			// find method generate the select query with where PK is id
//			return em.find(c, id);
//		} finally {
//			emf.close();
//		}
//	}
}
