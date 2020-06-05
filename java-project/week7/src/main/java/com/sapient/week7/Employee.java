package com.sapient.week7;

import org.springframework.stereotype.Component;

public class Employee 
{
	private int id;
	private String name,city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id=" + id + "name= " + name + "city= " + city ;
	}
}
