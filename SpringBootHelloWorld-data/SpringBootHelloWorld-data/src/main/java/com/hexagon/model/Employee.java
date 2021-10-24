package com.hexagon.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String idtoString;

	private String name;

	private Date date;
	
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIdtoString() {
		return idtoString;
	}

	public void setIdtoString(String idtoString) {
		this.idtoString = idtoString;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private boolean manager;

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", manager=" + manager + ", date=" + date + "]";
	}

}
