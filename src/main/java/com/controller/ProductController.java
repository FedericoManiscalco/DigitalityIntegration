package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.services.ProductService;

@CrossOrigin
@RequestMapping("/classicmodels_low/v1")
@RestController
public class ProductController {

	@Autowired
	private ProductService ps;

	@GetMapping("/getProduct")
	public List<Product> getProduct() {
		return ps.findAllP();
	}

	@GetMapping("/getProductBestOrder")
	public List<Object> findProductWithHighestQuantityOrdered() {
		return ps.findProductWithHighestQuantityOrdered();
	}

	@GetMapping("/getProductSoldTheMost")
	public Object findProductSoldTheMost() {
		return ps.findProductSoldTheMost();
	}

	@GetMapping("/findEmployeeWithFewestCustomers")
	public Object findEmployeeWithFewestCustomers() {
		return ps.findEmployeeWithFewestCustomers();
	}

}
