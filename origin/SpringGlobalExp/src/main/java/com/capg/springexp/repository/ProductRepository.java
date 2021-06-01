package com.capg.springexp.repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.springexp.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
