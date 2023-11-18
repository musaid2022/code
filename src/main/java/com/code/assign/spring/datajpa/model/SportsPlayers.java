package com.code.assign.spring.datajpa.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

@Entity
@Table(name = "sports_players")
public class SportsPlayers {
	
	@Id
	@GeneratedValue
	private long id;
	

	@Column(name = "player_id")
	private Long playerId;

	@Column(name = "sport_id")
	private Long sport_id;
    
	@Column(name="description")
	private String desc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public Long getSport_id() {
		return sport_id;
	}

	public void setSport_id(Long sport_id) {
		this.sport_id = sport_id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
