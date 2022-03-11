package com.jeyaprabakar.advancedprogramming.controller;

import com.jeyaprabakar.advancedprogramming.model.entity.Admin;
import com.jeyaprabakar.advancedprogramming.model.LoginDTO;
import com.jeyaprabakar.advancedprogramming.model.Response;
import com.jeyaprabakar.advancedprogramming.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
    AdminService adminService;
	
	@PostMapping("/validate")
	@ApiOperation(value = "Validate the admin user")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		Admin admin=adminService.validate(dto.getUserid(),dto.getPwd());
		if(admin!=null)
			return Response.success(admin);
		else
			return Response.status(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	@ApiOperation(value="Update the admin profile such as name and password")
	public ResponseEntity<?> updateProfile(@RequestBody Admin admin) {
		adminService.updateAdmin(admin);
		return Response.status(HttpStatus.OK);
	}

}
