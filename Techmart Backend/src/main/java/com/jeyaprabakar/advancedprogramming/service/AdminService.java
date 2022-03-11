package com.jeyaprabakar.advancedprogramming.service;

import com.jeyaprabakar.advancedprogramming.model.entity.Admin;

public interface AdminService {
	Admin validate(String userid, String pwd);
	void updateAdmin(Admin amin);
}
