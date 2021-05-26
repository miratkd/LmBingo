package com.lm.bingo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.bingo.DTOs.AdminDto;
import com.lm.bingo.entities.Admin;
import com.lm.bingo.repositories.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;

	public AdminDto insert() {
		AdminDto dto =new AdminDto(repository.save(new Admin()));
		return dto;
	}
}
