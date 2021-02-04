package com.springmvc.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private String name;
	private long id;
	private String city;
	private List<String> cources;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getCources() {
		return cources;
	}
	public void setCources(List<String> cources) {
		this.cources = cources;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + ", cources=" + cources + ", date=" + date
				+ ", gender=" + gender + "]";
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
