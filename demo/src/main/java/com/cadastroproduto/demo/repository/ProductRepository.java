package com.cadastroproduto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroproduto.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
