package com.cadastroproduto.demo.dto;

public record CreateProductDTO(
		Long id,
		String nome, 
		String descricao,
		Double preco) {

}
