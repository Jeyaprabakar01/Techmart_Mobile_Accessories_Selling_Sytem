package com.jeyaprabakar.advancedprogramming.service;

import com.jeyaprabakar.advancedprogramming.model.entity.Address;

public interface AddressService {
	Address saveAddress(Address address);
	Address findAddress(int id);
}
