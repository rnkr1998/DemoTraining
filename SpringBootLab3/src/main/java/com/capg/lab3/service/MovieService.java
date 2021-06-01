package com.capg.lab3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.lab3.entity.Movie;
import com.capg.lab3.repo.IMovieRepo;



@Service
public class MovieService implements IMovieService{
	
	@Autowired
	IMovieRepo repo;
	
	
	
	@Override
	public List<Movie> getAll()
	{
		return repo.findAll();
	}


	
	@Override
	public void deleteMovie(int id)
	{
		 repo.deleteById(id);
	}
	
	
	@Override
	public Movie addMovie(Movie tr)
	{
		 return repo.save(tr);
	}
	
	@Override
	public Movie updateMovie(Movie tr)
	{
		return repo.save(tr);
	}
	
	@Override
	public List<Movie> getMovieByGenre(String genre)
	{
		return repo.findBymovieGenre(genre);
	}

	

}
