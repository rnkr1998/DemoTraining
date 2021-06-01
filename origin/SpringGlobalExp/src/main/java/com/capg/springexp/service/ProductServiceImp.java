package com.capg.springexp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springexp.entity.Product;
import com.capg.springexp.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		
		return repo.save(product);
	}

	@Override
	public Iterable<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}  //
	
		// we write validation code inside service class 
		// validation methods should not be part of service interface
	
	
		public static boolean  validateProduct(Product product) {
			
			boolean flag = false;
			
			
			
	   if(product.getPid() > 0 
		 && product.getPname().length() > 4 
		 && product.getPrice() > 500 ) {
		   
		   flag = true;
		   
		  
	   }
			
			
			
			return flag;
		}

		

}
