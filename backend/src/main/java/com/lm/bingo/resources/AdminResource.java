package com.lm.bingo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.bingo.DTOs.AdminDto;
import com.lm.bingo.services.AdminService;

@RestController
@RequestMapping(value = "/admin")
public class AdminResource {
	
	@Autowired
	private AdminService service;
	
	@PostMapping
	public ResponseEntity<AdminDto> insert(){
		AdminDto dto = service.insert();
		return ResponseEntity.ok(dto);
				
	}

}
