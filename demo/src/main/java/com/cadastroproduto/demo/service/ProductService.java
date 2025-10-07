package com.cadastroproduto.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cadastroproduto.demo.dto.CreateProductDTO;
import com.cadastroproduto.demo.entity.Product;
import com.cadastroproduto.demo.mapper.CreateProductMapper;
import com.cadastroproduto.demo.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository repository;
	private final CreateProductMapper mapper;
	
	public Product save(CreateProductDTO dto) {
		Product p = mapper.toEntity(dto);
		return repository.save(p);
		
	}
	
	public List<Product> listAllProducts(){
		return repository.findAll();
	}
	
	public  ResponseEntity<Product> findById(Long id) {
		return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
	
	public Product update(Long id, Product updatedProduct) {
		return repository.findById(id).map(
				p ->{
					p.setNome(updatedProduct.getNome());
					p.setDescricao(updatedProduct.getDescricao());
					p.setPreco(updatedProduct.getPreco());
					repository.save(p);
					return p;
					
				}).orElse(null);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
