package com.capg.lab2.service;
import com.capg.lab2.entity.*;

import java.util.List;

public interface ITraineeService {

	public List<Trainee> getAll();
	public Trainee getByName(String name);
	public Trainee getById(int id);
	public void deleteTrainee(int id);
	public Trainee addTrainee(Trainee tr);
	public Trainee updateTrainee(Trainee tr);
	 public List<Trainee> getTraineeByLoc(String loc1,String loc2);
     public List<Trainee> getNamesIn(String name,String name2);
		
	
}
