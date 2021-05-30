package com.lm.bingo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lm.bingo.DTOs.CardDto;
import com.lm.bingo.DTOs.CardReturnDto;
import com.lm.bingo.services.CardService;

@RestController
@RequestMapping(value = "/cards")
public class CardResource {

	@Autowired
	private CardService service;
	
	@PostMapping
	private ResponseEntity<CardReturnDto> insert(@RequestBody CardDto dto){
		CardReturnDto response = service.insert(dto);
		return ResponseEntity.ok(response);
	}
}
