package br.com.microservice.loja.model;

import java.util.List;

public class EstoqueModel {

	//Estoque tem produto como uma lista
	private List<Produto> produto;

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
