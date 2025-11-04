package com.cloud.earth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.earth.model.Human;

public interface HumanRepo extends JpaRepository<Human, Integer> 
{
		List<Human> findByTech(String tech); 
		
		List <Human> findByAidGreaterThan(int aid);
}
