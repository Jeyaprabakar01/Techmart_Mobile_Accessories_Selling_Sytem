package com.jeyaprabakar.advancedprogramming.service;

import java.util.Optional;

import com.jeyaprabakar.advancedprogramming.repository.AdminRepository;
import com.jeyaprabakar.advancedprogramming.model.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
    AdminRepository dao;

	@Override
	public Admin validate(String userid, String pwd) {
		// TODO Auto-generated method stub
		Optional<Admin> admin=dao.findById(userid);
		if(admin.isPresent() && admin.get().getPwd().equals(pwd)) {
			return admin.get();
		}
		return null;
	}

	@Override
	public void updateAdmin(Admin admin) {
		if(admin.getPwd().equals("") || admin.getPwd()==null) {
			admin.setPwd(dao.getById(admin.getUserid()).getPwd());
		}
		dao.save(admin);		
	}

}
