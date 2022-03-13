package com.jeyaprabakar.advancedprogramming.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeyaprabakar.advancedprogramming.model.entity.Product;
import com.jeyaprabakar.advancedprogramming.model.entity.Seller;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findBySeller(Seller sellerId,Sort sort);
	List<Product> findByPcatAndSubcat(String pcat,String subcat,Sort sort);
}


