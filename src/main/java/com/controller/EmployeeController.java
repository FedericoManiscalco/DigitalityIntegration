package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.services.EmployeeService;

@CrossOrigin
@RequestMapping("/classicmodels_low/v1")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		return es.findAll();
	}

//	@GetMapping("/getEmployeesFewestCustomers")
//	public Employee findEmployeeWithFewestCustomers() {
//		return es.findEmployeeWithFewestCustomers();
//	}
}
