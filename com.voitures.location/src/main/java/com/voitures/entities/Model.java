package com.voitures.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "model")
	private List<Model> location;

	//getters setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameModel() {
		return name;
	}

	public void setNameModel(String name) {
		this.name = name;
	}

	public List<Model> getLocation() {
		return location;
	}

	public void setLocation(List<Model> location) {
		this.location = location;
	}

}
