package com.jeyaprabakar.advancedprogramming.service;

import com.jeyaprabakar.advancedprogramming.repository.AddressRepository;
import com.jeyaprabakar.advancedprogramming.model.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
    AddressRepository dao;
	
	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return dao.save(address);
	}

	@Override
	public Address findAddress(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

}
