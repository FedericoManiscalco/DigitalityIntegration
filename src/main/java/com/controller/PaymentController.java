package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Payment;
import com.services.PaymentService;

@CrossOrigin
@RequestMapping("/classicmodels_low/v1")
@RestController
public class PaymentController {

	@Autowired
	private PaymentService ps;

	@GetMapping("/getPaymentById")
	public Payment findById(int customerNumber, String checkNumber) {

		return ps.findById(customerNumber, checkNumber);
	}

}
