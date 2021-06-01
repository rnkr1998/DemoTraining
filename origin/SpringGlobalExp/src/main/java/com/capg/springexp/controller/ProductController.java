package com.capg.springexp.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springexp.entity.Product;
import com.capg.springexp.exception.InvalidProductException;
import com.capg.springexp.service.IProductService;
import com.capg.springexp.service.ProductServiceImp;

@RestController
@RequestMapping("/product-api")
public class ProductController {
	@Autowired
	IProductService service;

	@PostMapping("/product/add")
	public Product addProduct(@RequestBody Product product) throws InvalidProductException {
		// TODO Auto-generated method stub

		Product addedProduct = null;

		boolean isValid = ProductServiceImp.validateProduct(product);

		if (isValid) {
			System.out.println("added");

			addedProduct = service.addProduct(product);
		}

		else {
			System.out.println("exp");

			throw new InvalidProductException(); // try-catch

		}

		return addedProduct;
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Iterable<Product> iterable = service.getAllProducts();

		Iterator<Product> it = iterable.iterator();

		List<Product> list = new ArrayList<Product>();

		while (it.hasNext()) {
			Product product = it.next();

			list.add(product);

		}

		return list;

	}

	/*
	 * //@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE, reason =
	 * "Product details are invalid")
	 * 
	 * @ExceptionHandler({ InvalidProductException.class }) public
	 * ResponseEntity<String> handler() { // controller level exp-handling
	 * 
	 * System.err.println("invalid");
	 * 
	 * return new
	 * ResponseEntity<String>("Invalid Product Inputs",HttpStatus.NOT_ACCEPTABLE); }
	 */

}
