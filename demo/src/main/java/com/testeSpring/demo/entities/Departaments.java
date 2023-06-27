package com.testeSpring.demo.entities;

public class Departaments {

	private Long id;
	private String name;

	public Departaments() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Departaments(Long id, String name) {
		this.id = id;
		this.name = name;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
