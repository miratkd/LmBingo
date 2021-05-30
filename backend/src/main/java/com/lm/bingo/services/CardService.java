package com.lm.bingo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.bingo.DTOs.CardDto;
import com.lm.bingo.DTOs.CardReturnDto;
import com.lm.bingo.entities.Card;
import com.lm.bingo.repositories.AdminRepository;
import com.lm.bingo.repositories.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository repository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Transactional
	public CardReturnDto insert(CardDto dto) {
		Card entity = new Card();
		entity.setUserName(dto.getUserName());
		entity.setBingo(false);
		entity.setAdmin(adminRepository.getOne(dto.getAdminCode()));
		entity.seddingTable();
		
		entity = repository.save(entity);
		
		return new CardReturnDto(entity);
	}

}
