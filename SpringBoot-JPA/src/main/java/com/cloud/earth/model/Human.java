package com.cloud.earth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Human {
	
	@Id
	int aid;
	String aname;
	
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
	@Override
	public String toString() {
		return "Human [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
}
