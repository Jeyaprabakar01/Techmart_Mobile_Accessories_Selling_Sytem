package com.jeyaprabakar.advancedprogramming.service;

import com.jeyaprabakar.advancedprogramming.repository.PaymentRepository;
import com.jeyaprabakar.advancedprogramming.model.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
    PaymentRepository dao;
	
	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return dao.save(payment);
	}

	@Override
	public Payment findPaymentById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

}
