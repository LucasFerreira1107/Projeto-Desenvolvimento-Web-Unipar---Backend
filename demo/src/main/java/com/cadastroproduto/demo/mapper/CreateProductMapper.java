package com.cadastroproduto.demo.mapper;

import org.mapstruct.Mapper;

import com.cadastroproduto.demo.dto.CreateProductDTO;
import com.cadastroproduto.demo.entity.Product;

@Mapper(componentModel="spring")
public interface CreateProductMapper {

	CreateProductDTO toDTO(Product product);
	Product toEntity(CreateProductDTO product);
}
