package com.cadastroproduto.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroproduto.demo.dto.CreateProductDTO;
import com.cadastroproduto.demo.entity.Product;
import com.cadastroproduto.demo.service.ProductService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService service;
	
	@GetMapping
	public List<Product> listAllProducts(){
		return service.listAllProducts();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Product> save(@RequestBody CreateProductDTO product) {
		service.save(product);
		return ResponseEntity.ok(service.save(product));
	}
	
	 @PutMapping("/{id}")
	  public Product atualizar(@PathVariable Long id, @RequestBody Product p){
		 return service.update(id, p);
	 }
	 
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletar(@PathVariable Long id) {
	       
	        service.delete(id);
	        return ResponseEntity.noContent().build();
	    }
}
