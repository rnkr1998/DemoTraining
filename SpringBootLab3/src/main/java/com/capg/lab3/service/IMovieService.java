package com.capg.lab3.service;
import com.capg.lab3.entity.*;

import java.util.List;

public interface IMovieService {

	public List<Movie> getAll();

	public void deleteMovie(int id);
	
	public Movie addMovie(Movie tr);
	
	public Movie updateMovie(Movie tr);
	
	 public List<Movie> getMovieByGenre(String genre);

		
	
}
