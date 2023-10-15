package com.theatre.service;

import com.theatre.dto.Movie;

public interface MovieService {
	public String addMovie(Movie movie);
	public Movie searchMovie(String movieId);
	public String updateMovie(Movie movie);
	public String deleteMovie(String movieId);
}
