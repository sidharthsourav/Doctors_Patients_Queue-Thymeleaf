package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String date,name,phoneNo;
	Integer age;
	Integer id,notAttendedyet,seen,updated,cancelled;
	
	public Patient()
	{
		
	}

	public Patient(String date, String name, String phoneNo, Integer age, Integer id, Integer notAttendedyet,
			Integer seen, Integer updated, Integer cancelled) {
		super();
		this.date = date;
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.id = id;
		this.notAttendedyet = notAttendedyet;
		this.seen = seen;
		this.updated = updated;
		this.cancelled = cancelled;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNotAttendedyet() {
		return notAttendedyet;
	}

	public void setNotAttendedyet(Integer notAttendedyet) {
		this.notAttendedyet = notAttendedyet;
	}

	public Integer getSeen() {
		return seen;
	}

	public void setSeen(Integer seen) {
		this.seen = seen;
	}

	public Integer getUpdated() {
		return updated;
	}

	public void setUpdated(Integer updated) {
		this.updated = updated;
	}

	public Integer getCancelled() {
		return cancelled;
	}

	public void setCancelled(Integer cancelled) {
		this.cancelled = cancelled;
	}

	@Override
	public String toString() {
		return "Patient [date=" + date + ", name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + ", id=" + id
				+ ", notAttendedyet=" + notAttendedyet + ", seen=" + seen + ", updated=" + updated + ", cancelled="
				+ cancelled + "]";
	}
	
	
	
}
