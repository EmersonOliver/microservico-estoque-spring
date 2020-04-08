package br.com.microservice.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.model.Produto;
import br.com.microservice.loja.service.EstoqueService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
	
	//Dizendo pro spring que nosso EstoqueService faz parte da aplicação
	@Autowired
	private EstoqueService estoqueService;
	
	//Metodo GET pra listar os produtos
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/listarProdutos")
	public ResponseEntity<List<Produto>> listarEstoque(){
		return ResponseEntity.ok(this.estoqueService.listarProdutosEstoque());
	}
	
	
}
