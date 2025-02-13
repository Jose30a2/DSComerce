package com.jose30a2.dscommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jose30a2.dscommerce.dto.ProductDTO;
import com.jose30a2.dscommerce.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	//Inyectar dependencia del Product Repository
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		
		return service.findById(id);
	}

}
