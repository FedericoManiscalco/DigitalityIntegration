package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository er;

	@Override
	public List<Employee> findAll() {
		return er.findAll();
	}

//	@Override
//	public Employee findEmployeeWithFewestCustomers() {
//
//		return er.findEmployeeWithFewestCustomers();
//	}

}
