package com.jeyaprabakar.advancedprogramming.service;

import com.jeyaprabakar.advancedprogramming.model.entity.Payment;

public interface PaymentService {
	Payment savePayment(Payment payment);
	Payment findPaymentById(int id);
}
