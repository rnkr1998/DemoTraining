package com.capg.springexp.service;

import java.util.List;

import com.capg.springexp.entity.Product;

public interface IProductService {
	
		public  Product  addProduct(Product product);
		
		public Iterable<Product>   getAllProducts();
	

}
