package com.Factory;

import com.theatre.dao.MovieDao;
import com.theatre.dao.MovieDaoImple;

public class MovieDaoFactory {
	private static MovieDao movieDao=null;
	static {
		movieDao = new MovieDaoImple();
	}
	public static  MovieDao getMovieDao() {
		return movieDao;
	}
}
