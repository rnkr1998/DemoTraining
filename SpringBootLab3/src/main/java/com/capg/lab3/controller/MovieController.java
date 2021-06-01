package com.capg.lab3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.lab3.entity.Movie;
import com.capg.lab3.service.IMovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	IMovieService service;
	
	@PostMapping("add")
	public Movie addMovie(@RequestBody Movie tr)
	{
		return service.addMovie(tr);
	}
	
	@PutMapping("update")
	public Movie updateTrainee(@RequestBody Movie tr)
	{
		return service.updateMovie(tr);
	}
	
	
	@DeleteMapping("del/{id}")
	public void deleteTrainee(@PathVariable int id)
	{
	      service.deleteMovie(id);
	}
	
	@GetMapping("get/genre/{genre}")
	public List<Movie> getMovieByGenre(@PathVariable String genre)
	{
		return service.getMovieByGenre(genre);
	} 
	
	
	@GetMapping("get/all")
	public List<Movie> getAll()
	{
		return service.getAll();
	}
	
	


	



}
