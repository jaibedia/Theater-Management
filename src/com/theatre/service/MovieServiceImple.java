package com.theatre.service;

import java.sql.Connection;

import com.Factory.ConnectionFactory;
import com.Factory.MovieDaoFactory;
import com.theatre.dao.MovieDao;
import com.theatre.dto.Movie;

public class MovieServiceImple implements MovieService {

	@Override
	public String addMovie(Movie movie) {
		MovieDao movieDao = MovieDaoFactory.getMovieDao();
		String status = movieDao.add(movie);
		return status;
	}

	@Override
	public Movie searchMovie(String movieId) {
		Movie movie = null;
		MovieDao movieDao = MovieDaoFactory.getMovieDao();
		movie = movieDao.search(movieId);
		
		
		return movie;
	}

	@Override
	public String updateMovie(Movie movie) {
		MovieDao  movieDao = MovieDaoFactory.getMovieDao();
		String status = movieDao.update(movie);
		return status;
	}

	@Override
	public String deleteMovie(String movieId) {
		String status="";
		try {
			MovieDao movieDao = MovieDaoFactory.getMovieDao();
			status =movieDao.delete(movieId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
