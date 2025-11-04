package com.cloud.earth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/getHuman")
	public ModelAndView getHuman(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("showHuman.jsp");
		Human human = repo.findById(aid).orElse(new Human());
		
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByAidGreaterThan(102));
		
		mv.addObject(human);
		return mv;
	}
	
	// Delete Data by ID
//	@RequestMapping("/deleteHuman")
//	public String deleteHuman(@RequestParam int aid) {
//	    repo.deleteById(aid);
//	    return "home.jsp";
//	}
}
