package com.cloud.earth.controller;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.earth.dao.HumanRepo;
import com.cloud.earth.model.Human;

@Controller
public class HumanController {
	
	@Autowired
	HumanRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	//Insert Data
	@RequestMapping("/addHuman")
	public String addHuman(Human human)
	{
		repo.save(human);
		return "home.jsp";
	}
	
	//Fetch Data by ID
	@RequestMapping("/humans")
	@ResponseBody
	public java.util.List<Human>  getHumans()
	{
		
		return repo.findAll();
		
	}
	
	@RequestMapping("/human/{aid}")
	@ResponseBody
	public Optional<Human> getHuman(@PathVariable("aid") int aid)
	{
		
		return repo.findById(aid);
		
	}
}
