package com.naveen.SpringMvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@org.hibernate.annotations.NamedQueries({
    @org.hibernate.annotations.NamedQuery(name = "hql_alian_select", 
      query = "from Alian where aname=:aname")
})
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

	
	public Alian(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Alian [aname=" + aname + ", aid=" + aid + "]";
	}
	
}
