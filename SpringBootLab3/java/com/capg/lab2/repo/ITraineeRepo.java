package com.capg.lab2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.lab2.entity.*;

@Repository
public interface ITraineeRepo extends JpaRepository<Trainee, Integer>
{

	
	
	
    public Trainee findBytraineeName(String traineeName);
    

    @Query("from Trainee where traineeLocation=:loc1 AND traineeDomain=:loc2")
    public List<Trainee> findTraineeByLoc(@Param("loc1") String loc1,@Param("loc2") String loc2);
    
    @Query("from Trainee where Trainee_name IN(:name1,:name2)")
    public List<Trainee> findNamesIn(@Param("name1") String name,@Param("name2") String name2);
    
   
	
	
	
	
	
}
