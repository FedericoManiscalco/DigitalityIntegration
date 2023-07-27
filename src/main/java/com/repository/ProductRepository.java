package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	@Query(value = "SELECT max(sum) sum, product_line productLine, a.product_name productName FROM (SELECT product_name, product_line, products.product_code, sum(quantity_ordered) as sum FROM products JOIN orderdetails ON products.product_code = orderdetails.product_code GROUP BY product_name ORDER BY sum DESC) a GROUP BY product_line;", nativeQuery = true)
	public List<Object> findProductWithHighestQuantityOrdered();

	@Query(value = "SELECT max(sum), product_line, a.product_name FROM (SELECT product_name, product_line, products.product_code, sum(quantity_ordered) as sum FROM products JOIN orderdetails ON products.product_code = orderdetails.product_code GROUP BY product_name ORDER BY sum DESC ) a", nativeQuery = true)
	public Object findProductSoldTheMost();

	@Query(value = "SELECT sales_rep_employee_number, first_name, last_name, max(counter) as customers FROM (SELECT first_name, last_name, sales_rep_employee_number, count(customer_number) as counter FROM classicmodels_low.customers JOIN employees ON employee_number = sales_rep_employee_number WHERE sales_rep_employee_number IS NOT NULL GROUP BY sales_rep_employee_number) a;", nativeQuery = true)
	public Object findEmployeeWithFewestCustomers();

}
