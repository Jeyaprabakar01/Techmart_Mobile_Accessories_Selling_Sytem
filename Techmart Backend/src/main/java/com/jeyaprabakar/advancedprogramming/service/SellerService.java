package com.jeyaprabakar.advancedprogramming.service;

import java.util.List;

import com.jeyaprabakar.advancedprogramming.model.entity.Seller;

public interface SellerService {
	void registerSeller(Seller seller);
	List<Seller> allSellers();
	Seller findById(int id);
	Seller validate(String userid,String pwd);
	void deleteSeller(int id);
	
}
