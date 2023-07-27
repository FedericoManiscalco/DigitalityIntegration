package com.services;

import java.util.List;

import com.entity.Product;

public interface ProductService {

	public List<Product> findAllP();

	public List<Object> findProductWithHighestQuantityOrdered();

	public Object findProductSoldTheMost();

	public Object findEmployeeWithFewestCustomers();
}
