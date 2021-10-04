package com.drpao.springstatemachine.repository;

import com.drpao.springstatemachine.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
