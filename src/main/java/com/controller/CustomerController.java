package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;
import com.services.CustomerService;

@CrossOrigin
@RequestMapping("/classicmodels_low/v1")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@GetMapping("/getCustomers")
	public List<Customer> getCustomers() {
		return cs.findAllC();
	}
}
