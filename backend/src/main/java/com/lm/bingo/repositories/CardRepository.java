package com.lm.bingo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lm.bingo.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>{
	
	

}
