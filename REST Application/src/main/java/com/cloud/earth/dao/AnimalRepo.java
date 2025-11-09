package com.cloud.earth.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.earth.model.Animal;

public interface AnimalRepo extends JpaRepository<Animal, Integer> 
{
		List<Animal> findByTech(String tech); 
		
		List <Animal> findByAidGreaterThan(int aid);
}
