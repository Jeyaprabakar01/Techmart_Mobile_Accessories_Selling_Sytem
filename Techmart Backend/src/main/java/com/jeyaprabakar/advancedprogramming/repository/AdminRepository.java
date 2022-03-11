package com.jeyaprabakar.advancedprogramming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeyaprabakar.advancedprogramming.model.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
