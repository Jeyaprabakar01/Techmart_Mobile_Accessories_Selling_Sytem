package com.jeyaprabakar.advancedprogramming.service;

import java.util.List;

import com.jeyaprabakar.advancedprogramming.model.entity.Customer;
import com.jeyaprabakar.advancedprogramming.model.entity.Order;

public interface OrderService {

	Order saveOrder(Order order);
	List<Order> getAllOrders();
	List<Order> getCustomerOrders(Customer customer);
	Order findById(int id);
}
