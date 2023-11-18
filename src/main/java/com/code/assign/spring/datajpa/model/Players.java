package com.code.assign.spring.datajpa.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

@Entity
@Table(name = "players")
public class Players {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	@Column(name = "email")
	private String email;
    @NotNull
	@Column(name = "level")
	private Integer level;
    @NotNull
	@Column(name = "age")
	private Integer age;
    @NotNull
	@Column(name = "gender")
	private String gender;


	public Players() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Players [id=" + id + ", email=" + email + ", level=" + level + ", age=" + age + ", gender=" + gender
				+ ", getId()=" + getId() + ", getEmail()=" + getEmail() + ", getLevel()=" + getLevel() + ", getAge()="
				+ getAge() + ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
