package com.douglas.model;

public class Animal {
	
	private int Idade;
	private String nome;
	private String raca;
	public Animal(int idade, String nome, String raca) {
		super();
		Idade = idade;
		this.nome = nome;
		this.raca = raca;
	}
	public int getIdade() {
		return Idade;
	}
	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	
	

}
