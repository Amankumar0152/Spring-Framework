package com.cloud.earth.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cloud.earth.model.Human;

public interface HumanRepo extends CrudRepository<Human, Integer> 
{
		List<Human> findByTech(String tech); 
		
		List <Human> findByAidGreaterThan(int aid);
		
//		@Query("from Human where tech=?1order by name")
//		List <Human> findByTechSorted(String tech);
}
