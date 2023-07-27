package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Payment;
import com.entity.PaymentId;
import com.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository pr;

	@Override
	public Payment findById(int customerNumber, String checkNumber) {

		return pr.findById(new PaymentId(customerNumber, checkNumber)).get();
	}

}
