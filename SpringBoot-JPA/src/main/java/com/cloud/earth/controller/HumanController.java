package com.cloud.earth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/addHuman")
	public String addHuman(Human human)
	{
		repo.save(human);
		return "home.jsp";
	}
}
