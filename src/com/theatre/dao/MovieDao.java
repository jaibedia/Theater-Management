package com.theatre.dao;

import com.theatre.dto.Movie;

public interface MovieDao {
	public String add(Movie movie);
	public Movie search(String movieId);
	public String update(Movie movie);
	public String delete(String movieId);
}
