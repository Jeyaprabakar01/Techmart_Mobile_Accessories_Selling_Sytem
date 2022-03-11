package com.jeyaprabakar.advancedprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeyaprabakar.advancedprogramming.model.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {
	
	Seller findByUserid(String userid);

}
