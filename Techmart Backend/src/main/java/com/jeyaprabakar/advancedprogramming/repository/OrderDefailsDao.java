package com.jeyaprabakar.advancedprogramming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeyaprabakar.advancedprogramming.model.entity.Order;
import com.jeyaprabakar.advancedprogramming.model.entity.OrderDetails;

@Repository
public interface OrderDefailsDao extends JpaRepository<OrderDetails, Integer> {
	List<OrderDetails> findByOrder(Order order);
}
