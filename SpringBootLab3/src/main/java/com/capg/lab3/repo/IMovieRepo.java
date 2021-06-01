package com.capg.lab3.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.capg.lab3.entity.Movie;

@Repository
public interface IMovieRepo extends JpaRepository<Movie, Integer>
{

	
	
	
    public List<Movie> findBymovieGenre(String MovieGenre);
    


    
   
	
	
	
	
	
}
