package com.jeyaprabakar.advancedprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeyaprabakar.advancedprogramming.model.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
