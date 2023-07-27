package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	@Query("SELECT e\r\n FROM Employee e \r\n LEFT JOIN Customer c ON e.employeeNumber = c.salesRepresentative \r\n GROUP BY e.employeeNumber, e.lastName, e.firstName \r\n ORDER BY COUNT(c.customerNumber) ASC\r\n")
//	public Employee findEmployeeWithFewestCustomers();

}
