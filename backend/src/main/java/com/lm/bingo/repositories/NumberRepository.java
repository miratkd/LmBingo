package com.lm.bingo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lm.bingo.entities.Admin;
import com.lm.bingo.entities.Number;

@Repository
public interface NumberRepository extends JpaRepository<Number, Integer> {

	@Query("SELECT obj FROM Number obj WHERE obj.admin = :admin")
	List<Number> find(Admin admin);
}
