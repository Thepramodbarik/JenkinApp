package com.clover.entity;

import jakarta.validation.constraints.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZenkinEntity {

	static {
		System.out.println("inside Entity class....");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "Name cannot be Null")
	@Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]*?$", message = "Please provide valid name")
	//@Pattern(regexp = "\null\b")
	private String name;


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ZenkinEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ZenkinEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ZenkinTest [id=" + id + ", name=" + name + "]";
	}

}
