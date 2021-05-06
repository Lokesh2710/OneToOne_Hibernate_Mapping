package com.jocata.Mapping_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private int marks;
	
	@OneToOne
	private Laptop lapobj;
	
	public Laptop getLapobj() {
		return lapobj;
	}
	public void setLapobj(Laptop lapobj) {
		this.lapobj = lapobj;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
