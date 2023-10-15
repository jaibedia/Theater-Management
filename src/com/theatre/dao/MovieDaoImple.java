package com.theatre.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Factory.ConnectionFactory;
import com.theatre.dto.Movie;

public class MovieDaoImple implements MovieDao {

	@Override
	public String add(Movie movie) {
		String status ="";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st =con.createStatement();
			Movie movi = search(movie.getMovieId());
			if(movi==null) {
				System.out.println("yes null");
				int rowCount = st.executeUpdate("insert into movies values('"+movie.getMovieId()+"','"+
						movie.getMovieName()+"','"+movie.getGenre()+"','"+movie.getDuration()+"')");
				if(rowCount==1) {
					status ="Movie inserted successfully";
				}else {
					status ="Movie insertion failure..";
				}
			}else {
						status ="Movie already exists";
			}
		} catch (Exception e) {
			status ="Movie insertion failure..";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Movie search(String movieId) {
		Movie movie =null;
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st =con.createStatement();
			ResultSet rs = st.executeQuery("select * from movies where MOVIEID='"+movieId+"'");
		  	boolean b= rs.next();
			if(b) {
				movie = new Movie();
				movie.setMovieId(rs.getString("MOVIEID"));
				movie.setMovieName(rs.getString("MOVIENAME"));
				movie.setGenre(rs.getString("GENRE"));
				movie.setDuration(rs.getString("DURATION"));
			}else {
				movie = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return movie;
	}

	@Override
	public String update(Movie movie) {
		String status="";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			int rowCount = st.executeUpdate("update movies set MOVIENAME='"+movie.getMovieName()+"',GENRE='"+movie.getGenre()+"',DURATION='"+movie.getDuration()+"' where MOVIEID='"+movie.getMovieId()+"'");
			if(rowCount==1) {
				status = "Movie updated successfully..";
			}else {
				status ="Movie updation failure...";
			}
		} catch (Exception e) {
			status ="Movie updation failure...";
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public String delete(String movieId) {
		String status="";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st =con.createStatement();
			int rowCount= st.executeUpdate("delete movies where MOVIEID='"+movieId+"'");
			if(rowCount==1) {
				status ="Movie deleted successfully..";
			}else {
				status ="Movie deletion failure..";
			}
		} catch (Exception e) {
			status ="Movie deletion failure..";
			e.printStackTrace();
		}
		
		return status;
	}

}
