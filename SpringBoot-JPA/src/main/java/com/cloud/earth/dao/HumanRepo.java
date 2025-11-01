package com.cloud.earth.dao;

import org.springframework.data.repository.CrudRepository;

import com.cloud.earth.model.Human;

public interface HumanRepo extends CrudRepository<Human, Integer> 
{
	
}
