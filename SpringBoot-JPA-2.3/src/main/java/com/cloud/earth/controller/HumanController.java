package com.cloud.earth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	public String getHuman()
	{
		
		return repo.findAll().toString();
		
	}
	
	@RequestMapping("/human/{aid}")
	@ResponseBody
	public String getHuman(@PathVariable("aid") int aid)
	{
		
		return repo.findById(aid).toString();
		
	}
}
