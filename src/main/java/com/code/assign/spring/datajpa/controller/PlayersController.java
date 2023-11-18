package com.code.assign.spring.datajpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.assign.spring.datajpa.model.Players;
import com.code.assign.spring.datajpa.model.SportsPlayers;
import com.code.assign.spring.datajpa.repository.PlayersRepository;
import com.code.assign.spring.datajpa.repository.SportsPlayersRepo;
import com.code.assign.spring.datajpa.repository.SportsPlayersRepository;

@RestController
public class PlayersController {

	@Autowired
	PlayersRepository playersRepository;
	@Autowired 
	SportsPlayersRepository sportsPlayersRepo;
	@Autowired
	SportsPlayersRepo sportsPlayersRepository;

 
	@RequestMapping(value = "/a1" ,method = RequestMethod.GET)
	public ResponseEntity<?> a1(@RequestParam("gender") String gender , @RequestParam("level") Integer level ,@RequestParam("age") Integer age) {
		
		try {
			
		List<Players> list =	playersRepository.findByGenderAndLevelAndAge(gender, level, age);	
		
		return ResponseEntity.status(HttpStatus.OK)
		        .body(list);
		}
		catch (Exception e) {
			
			//throw new Business Exception()
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Exception occurs");
		
		
		
	}

	@RequestMapping(value = "/a2" ,method = RequestMethod.GET)
	public ResponseEntity<?> a2() {
		
		
		List<SportsPlayers> list =	sportsPlayersRepo.findMultiple();	
		  
		
		return ResponseEntity.status(HttpStatus.OK)
			        .body(list);
		
	}
	@RequestMapping(value = "/a3" ,method = RequestMethod.GET)
	public ResponseEntity<?> a1() {
		
		
		List<SportsPlayers> list =	sportsPlayersRepo.NoPlayer();	
		  
		
		return ResponseEntity.status(HttpStatus.OK)
			        .body(list);
		
	}
	
	@RequestMapping(value = "/b2" ,method = RequestMethod.GET)
	public ResponseEntity<?> b2() {
		
		
		List<SportsPlayers> list =	sportsPlayersRepo.countByPlayerNoSport();	
		  
		
		return ResponseEntity.status(HttpStatus.OK)
			        .body(list);
		
	}
	
	@RequestMapping(value = "/b4" ,method = RequestMethod.GET)
	public ResponseEntity<?> b4(@RequestParam("id") String id) {
		
		
		sportsPlayersRepo.deleteById(Long.valueOf(id));	
		  
		
		return ResponseEntity.status(HttpStatus.OK)
			        .body("SUCCESS");
		
	}

	@RequestMapping(value = "/b5" ,method = RequestMethod.GET)
	public ResponseEntity<?> b5(@RequestParam("desc") String desc) {
		
		   
		Pageable sortedByName = 
				  PageRequest.of(0, 3, Sort.by("desc"));
		  Page<SportsPlayers> list= 	sportsPlayersRepository.findAll(sortedByName);	
		  
		  
		
		return ResponseEntity.status(HttpStatus.OK)
			        .body(list);
		
	}

}
