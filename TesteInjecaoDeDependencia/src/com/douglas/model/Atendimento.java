package com.douglas.model;

import java.math.BigDecimal;

public class Atendimento {
	
	public String descricaoConsulta;
	public BigDecimal preco;
	public String data;
	public Atendimento(String descricaoConsulta, BigDecimal preco, String data) {
		super();
		this.descricaoConsulta = descricaoConsulta;
		this.preco = preco;
		this.data = data;
	}
	public String getDescricaoConsulta() {
		return descricaoConsulta;
	}
	public void setDescricaoConsulta(String descricaoConsulta) {
		this.descricaoConsulta = descricaoConsulta;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getData() {
		return data;
	}
	
	

}
