package com.lm.bingo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lm.bingo.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
