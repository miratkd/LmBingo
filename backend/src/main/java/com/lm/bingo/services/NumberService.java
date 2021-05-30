package com.lm.bingo.services;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.bingo.DTOs.NumberDto;
import com.lm.bingo.entities.Admin;
import com.lm.bingo.entities.Number;
import com.lm.bingo.repositories.AdminRepository;
import com.lm.bingo.repositories.NumberRepository;

@Service
public class NumberService {
	@Autowired
	private NumberRepository repository;
	
	@Autowired
	private AdminRepository adminRepository;

	public NumberDto insert(Integer adminCode) {
		Integer randomInt = newNumber(adminCode);
		Admin admin = adminRepository.getOne(adminCode);
		Number entity = new Number(randomInt, admin);
		NumberDto dto = new NumberDto(repository.save(entity));
		return dto;
	}
	
	@Transactional
	public List<NumberDto> getAll(Integer adminCode){
		Admin admin = adminRepository.findById(adminCode).orElseThrow();
		List<Number> dto =  repository.find(admin);
		return dto.stream().map(x -> new NumberDto(x)).collect(Collectors.toList());
	}
	
	public Integer newNumber(Integer adminCode) {
		Admin admin = adminRepository.findById(adminCode).orElseThrow();
		List<Integer> numberList =  repository.find(admin).stream().map(x -> x.getValue()).collect(Collectors.toList());
		Random random = new Random();
		boolean repeat;
		Integer randomInt;
		do {
			randomInt = random.nextInt(99);
			repeat = (numberList.contains(randomInt));
		}while(repeat);
		return randomInt;
	}
}
