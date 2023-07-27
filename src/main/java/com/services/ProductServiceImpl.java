package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pr;

	@Override
	public List<Product> findAllP() {
		System.out.println("sono entrato");
		return pr.findAll();
	}

	@Override
	public List<Object> findProductWithHighestQuantityOrdered() {
		return pr.findProductWithHighestQuantityOrdered();
	}

	@Override
	public Object findProductSoldTheMost() {
		return pr.findProductSoldTheMost();
	}

	@Override
	public Object findEmployeeWithFewestCustomers() {
		return pr.findEmployeeWithFewestCustomers();
	}

}
