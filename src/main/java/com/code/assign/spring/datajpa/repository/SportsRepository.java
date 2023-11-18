package com.code.assign.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.assign.spring.datajpa.model.Sports;
import java.util.*;

public interface SportsRepository  extends JpaRepository<Sports, Long> {
	
	List<Sports> findByName(String name);

}
