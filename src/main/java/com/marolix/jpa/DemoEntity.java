package com.marolix.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DemoEntity {
	@Id
	private Integer id;
	private String name;
	
	public DemoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoEntity(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DemoEntity [id=" + id + ", name=" + name + "]";
	}
	
	
}
