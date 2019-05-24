package com.learning.web.model;

public class Student {
	private int sid;
	private String name;
	private String techno;
	
	public int getSid() {
		return sid;
	}	
	public String getName() {
		return name;
	}	
	public String getTechno() {
		return techno;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public void setTechno(String techno) {
		this.techno = techno;
	}
	
	/*
	 * public Student(int sid, String name, String techno) { super(); this.sid =
	 * sid; this.name = name; this.techno = techno; }
	 */
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", techno=" + techno + "]";
	}
	
	

}
