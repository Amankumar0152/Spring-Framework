package com.cloud.earth.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cloud.earth.model.Human;

public interface HumanRepo extends CrudRepository<Human, Integer> 
{
		List<Human> findByTech(String tech); 
		
		List <Human> findByAidGreaterThan(int aid);
}
