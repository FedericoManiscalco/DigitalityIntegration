package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Payment;
import com.entity.PaymentId;

public interface PaymentRepository extends JpaRepository<Payment, PaymentId> {

}
