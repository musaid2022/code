package com.code.assign.spring.datajpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.code.assign.spring.datajpa.model.SportsPlayers;
import java.util.*;
public interface SportsPlayersRepository  extends JpaRepository<SportsPlayers, Long>{
	
	@Query("select sp from SportsPlayers sp  where sp.playerId is NULL")
	List<SportsPlayers> NoPlayer();
	

	
	@Query("select count(*) from SportsPlayers ex where ex.playerId is NOT NULL")
	long countByPlayer();
	
	
	@Query("SELECT m FROM SportsPlayers m WHERE (SELECT COUNT(e) FROM SportsPlayers e WHERE e.playerId is NOT NULL) > 2")
	List<SportsPlayers> findMultiple();


	
	@Query("select sp from SportsPlayers sp where sp.sport_id is NULL")
	List<SportsPlayers>  countByPlayerNoSport();
	
 



	
}
