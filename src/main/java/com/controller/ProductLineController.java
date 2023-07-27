package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ProductLine;
import com.services.ProductLineService;

@CrossOrigin
@RequestMapping("/classicmodels_low/v1")
@RestController
public class ProductLineController {

	@Autowired
	private ProductLineService pls;

	@GetMapping("/getProductLines")
	public List<ProductLine> getProductLines() {
		return pls.findAllPL();
	}
}
