package com.testeSpring.demo.entities;

public class Product {

	private Long id;
	private String nome;
	private Double Price;

	private Departaments departaments;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String nome, Double price, Departaments departaments) {
		this.id = id;
		this.nome = nome;
		Price = price;
		this.departaments = departaments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Departaments getDepartaments() {
		return departaments;
	}

	public void setDepartaments(Departaments departaments) {
		this.departaments = departaments;
	}

}
