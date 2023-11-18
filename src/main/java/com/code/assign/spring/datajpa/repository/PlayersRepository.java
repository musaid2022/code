package com.code.assign.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.assign.spring.datajpa.model.Players;

public interface PlayersRepository extends JpaRepository<Players, Long> {
	List<Players> findByEmail(String email);
	
	
	/**
	 * RAW-SQL
	 * select * from code.players where gender ='Male' and level=8 and age=30
	 * 
	 * */
	List<Players> findByGenderAndLevelAndAge(String gender,Integer level ,Integer age);

}
