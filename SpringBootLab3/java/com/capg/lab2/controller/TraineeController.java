package com.capg.lab2.controller;

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

import com.capg.lab2.entity.Trainee;
import com.capg.lab2.service.ITraineeService;

@RestController
@RequestMapping("/Trainee")
public class TraineeController {
	
	@Autowired
	ITraineeService service;
	
	@PostMapping("add")
	public Trainee addTrainee(@RequestBody Trainee tr)
	{
		return service.addTrainee(tr);
	}
	
	@PutMapping("update")
	public Trainee updateTrainee(@RequestBody Trainee tr)
	{
		return service.addTrainee(tr);
	}
	
	
	@DeleteMapping("del/id/{id}")
	public void deleteTrainee(@PathVariable int id)
	{
	      service.deleteTrainee(id);
	}
	
	@GetMapping("get/id/{id}")
	public Trainee getById(@PathVariable int id)
	{
		return service.getById(id);
	} 
	
	
	@GetMapping("get/all")
	public List<Trainee> getAll()
	{
		return service.getAll();
	}
	
	
	@GetMapping("get/name/{name}")
	public Trainee getByName(@PathVariable String name)
	{
		return service.getByName(name);
	}
	
	//get employee based on location and domain
	@GetMapping("get/{loc1}/{loc2}")
	public List<Trainee> getTraineeByLoc(@PathVariable String loc1,@PathVariable String loc2)
	{
		return service.getTraineeByLoc(loc1, loc2);
	}
	
	@GetMapping("get/namesin/{name}/{name2}")
	public List<Trainee> getNamesIn(@PathVariable String name, @PathVariable String name2)
	{
		return service.getNamesIn(name, name2);
	}
	

	



}
