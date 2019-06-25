package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.model.payment.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Long>{
}
