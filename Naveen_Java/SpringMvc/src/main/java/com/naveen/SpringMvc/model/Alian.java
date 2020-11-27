package com.naveen.SpringMvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alian {
	
	@Id
	private int aid;
	private String aname;	
	
	public Alian() {
		super();
	}

	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "Alian [aname=" + aname + ", aid=" + aid + "]";
	}
	
}
