package br.com.microservice.loja.model;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private String descrição;
	private BigDecimal valor;

	//Metodo construtor para adicionar os valores das variavies do objeto
	public Produto(String nome, String descrição, BigDecimal valor) {
		this.nome = nome;
		this.descrição = descrição;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
