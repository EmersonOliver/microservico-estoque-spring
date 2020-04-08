package br.com.microservice.loja.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.microservice.loja.model.Produto;

@Service
public class EstoqueService {

	//Criando uma lista de produtos
	public List<Produto> listarProdutosEstoque() {
		
		//Criado Objeto produto para adicionar produtos na nossa lista de produtos
		Produto produto1 = new Produto("Camisa Polo", "Camiseta leve 100% algodao", new BigDecimal(10.50));
		Produto produto2 = new Produto("Camisa de Seda", "Camiseta boa e qualidade", new BigDecimal(50.50));
		Produto produto3 = new Produto("Calça Jeans", "Detalhes rasgados, visual e estilo", new BigDecimal(20.50));
		
		//Nossa lista de produtos sera populada com os produtos criados
		List<Produto> produtos = new ArrayList<Produto>();
		
		//adicionando os produtos na lista
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		//retornaremos a lista de produtos adicionados
		return produtos;
	}

}
