package com.lm.bingo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.bingo.DTOs.NumberDto;
import com.lm.bingo.services.NumberService;

@RestController
@RequestMapping(value = "/number")
public class NumberResource {

	@Autowired
	private NumberService service;
	
	@PutMapping(value = "/{adminCode}")
	public ResponseEntity<NumberDto> insert(@PathVariable Integer adminCode){
		
		NumberDto dto = service.insert(adminCode);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(value = "/{adminCode}")
	public List<NumberDto> getAll(@PathVariable Integer adminCode){
		List<NumberDto> dto = service.getAll(adminCode);
		return dto;
	}
}
