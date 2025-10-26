package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bug {
	
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired  // Autowired search by type
	@Qualifier("lap1") // Qualifier search by name
	private Laptop laptop;
	
	public Bug() {
		super();
		System.out.println("Object created Super fucntion");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("Hi Aman in show");
		laptop.compile();
	}
}
