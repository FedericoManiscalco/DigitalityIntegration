package com.services;

import com.entity.Payment;

public interface PaymentService {

	public Payment findById(int customerNumber, String checkNumber);
}
