package com.jeyaprabakar.advancedprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeyaprabakar.advancedprogramming.model.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
