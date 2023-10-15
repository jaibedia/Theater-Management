package theatreapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Factory.ConnectionFactory;
import com.Factory.MovieServiceFactory;
import com.theatre.dto.Movie;
import com.theatre.service.MovieService;

public class TheatreApp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println();
			System.out.println("=======================Movie module=======================");
			System.out.println("\t1 .Movie add.");
			System.out.println("\t2 .Movie search.");
			System.out.println("\t3 .Movie update.");
			System.out.println("\t4 .Movie delete.");
			System.out.println("\t5 .Exit");
			System.out.println();
			System.out.print("choose option[1,2,3,4]");
			String option = br.readLine();
			int opt = Integer.parseInt(option);
//			System.out.println(option);
			String movieId;
			String movieName;
			String genre;
			String duration;
			Movie movie = null;
			MovieService movieService=null;
			switch(opt) {
			case 1:
				System.out.println("================Movie add Module======");
				System.out.print("\tEnter movie Id       : ");
				movieId = br.readLine();
				System.out.print("\tEnter movie name     : ");
				movieName = br.readLine();
				System.out.print("\tEnter movie genre    : ");
				genre = br.readLine();
				System.out.print("\tEnter movie duration : ");
				duration = br.readLine();
				movie = new Movie();
				movie.setMovieId(movieId);
				movie.setMovieName(movieName);
				movie.setGenre(genre);
				movie.setDuration(duration);
				movieService = MovieServiceFactory.getMovieService();
				String status= movieService.addMovie(movie);
				System.out.println(status);
				break;
			case 2:
				System.out.println("==========MOvie search Module======");
				System.out.print("\nEnter Movie Id : ");
				movieId = br.readLine();
				movieService = MovieServiceFactory.getMovieService();
				movie = movieService.searchMovie(movieId);
				if(movie==null) {
					System.out.println("Movie not Exist..");
				}else {
				System.out.println("==========Movie details========");
				System.out.print("\nMovie Id       : "+movie.getMovieId());
				System.out.print("\nMovie name     : "+movie.getMovieName());
				System.out.print("\nMovie genre    : "+movie.getGenre());
				System.out.print("\nMovie duration : "+movie.getDuration());
				}
				break;
			case 3:
				System.out.println("============Movie update Module=======");
				System.out.print("\nEnter Movie Id : ");
				movieId = br.readLine();
				movieService = MovieServiceFactory.getMovieService();
				movie = movieService.searchMovie(movieId);
				if(movie==null) {
					System.out.println("Movie Id does not exists..");
				}else {
					System.out.print("\nMovie Id : "+movie.getMovieId());
					System.out.print("\nMovie name [old = "+movie.getMovieName()+"]  :  ");
					movieName = br.readLine();
					if(movieName==null || movieName.equals("")) {
						movieName = movie.getMovieName();
					}
					
					System.out.print("Movie genre [old = "+movie.getGenre()+"]  : ");
					genre = br.readLine();
					if(genre==null || genre.equals("")) {
						genre =movie.getGenre();
					}
					
					System.out.print("Movie duration [old = "+movie.getDuration()+"] : ");
					duration = br.readLine();
					if(duration ==null ||duration.equals("")) {
						duration = movie.getDuration();
					}
					movie = new Movie();
					movie.setMovieId(movieId);
					movie.setMovieName(movieName);
					movie.setGenre(genre);
					movie.setDuration(duration);
					status = movieService.updateMovie(movie);
					System.out.println(status);
					
				}
				break;
			case 4:
				System.out.println("=============Movie delete Module====");
				System.out.print("\nEnter Movie Id : ");
				movieId = br.readLine();
				movieService = MovieServiceFactory.getMovieService();
				movie = movieService.searchMovie(movieId);
				if(movie==null) {
					System.out.println("Movie does not exist..");
				}else {
					status = movieService.deleteMovie(movieId);
					System.out.println(status);
				}
				break;
			case 5:
				ConnectionFactory.cleanUp();
				System.out.println("============Thank You=========");
				System.exit(0);
				break;
			default:
				break;
			}
		} 
	}
}




















