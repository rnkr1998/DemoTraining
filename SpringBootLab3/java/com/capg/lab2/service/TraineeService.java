package com.capg.lab2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.lab2.entity.Trainee;
import com.capg.lab2.repo.ITraineeRepo;


@Service
public class TraineeService implements ITraineeService{
	
	@Autowired
	ITraineeRepo repo;
	
	
	
	@Override
	public List<Trainee> getAll()
	{
		return repo.findAll();
	}
	
	@Override
	public Trainee getByName(String name)
	{
		return repo.findBytraineeName(name);
	}
	
	@Override
	public Trainee getById(int id)
	{
		return repo.findById(id).orElse(new Trainee());
	}
	
	@Override
	public void deleteTrainee(int id)
	{
		 repo.deleteById(id);
	}
	
	
	@Override
	public Trainee addTrainee(Trainee tr)
	{
		 return repo.save(tr);
	}
	
	@Override
	public Trainee updateTrainee(Trainee tr)
	{
		return repo.save(tr);
	}
	
	@Override
	public List<Trainee> getTraineeByLoc(String loc1,String loc2)
	{
		return repo.findTraineeByLoc(loc1, loc2);
	}

	@Override
	public List<Trainee> getNamesIn(String name,String name2)
	{
		return repo.findNamesIn(name,name2);
	}
		

}
