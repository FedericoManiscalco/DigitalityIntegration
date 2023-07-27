package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Order;
import com.services.OrderService;

@CrossOrigin
@RequestMapping("/classicmodels_low/v1")
@RestController
public class OrderController {

	@Autowired
	private OrderService os;

	@GetMapping("/getOrderById")
	public Order findById(int id) {

		return os.findById(id);
	}

}
