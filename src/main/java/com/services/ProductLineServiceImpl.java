package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ProductLine;
import com.repository.ProductLineRepository;

@Service
public class ProductLineServiceImpl implements ProductLineService {

	@Autowired
	private ProductLineRepository pr;

	@Override
	public List<ProductLine> findAllPL() {
		return pr.findAll();
	}

}
