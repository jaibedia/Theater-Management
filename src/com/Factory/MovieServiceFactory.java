package com.Factory;

import com.theatre.service.MovieService;
import com.theatre.service.MovieServiceImple;

public class MovieServiceFactory {
	private static MovieService movieService =null;
	static {
		movieService = new MovieServiceImple();
	}
	public static MovieService getMovieService() {
		return movieService;
	}
}
