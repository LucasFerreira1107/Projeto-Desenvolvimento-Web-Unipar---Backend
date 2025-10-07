package com.cadastroproduto.demo.dto;

public record UpdateProductDTO(
		Long id,
		String nome, 
		String descricao,
		Double preco) {

}
