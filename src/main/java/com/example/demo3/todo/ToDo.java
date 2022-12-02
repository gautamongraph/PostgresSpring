package com.example.demo3.todo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="todotable")
public class ToDo {
	
	@Id
	Integer Id;
	String title;
	String Summary;
	String Description;
	
	public ToDo() {
		
	}

	public ToDo(Integer id, String title, String summary, String description) {
		super();
		Id = id;
		this.title = title;
		Summary = summary;
		Description = description;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return Summary;
	}

	public void setSummary(String summary) {
		Summary = summary;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	
	
	

}
