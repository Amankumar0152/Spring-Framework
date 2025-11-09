package com.cloud.earth.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.earth.dao.AnimalRepo;
import com.cloud.earth.model.Animal;

@RestController
public class AnimalController {
	
	@Autowired
	AnimalRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	//Post Method
	@PostMapping("/animal")
	public Animal addAnimal(@RequestBody Animal animal)
	{
		repo.save(animal);
		return animal;
	}
	
	//Get Method
	@GetMapping(path="/animals")
	public java.util.List<Animal>  getAnimals()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/animal/{aid}")
	public Optional<Animal> getAnimal(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
}
