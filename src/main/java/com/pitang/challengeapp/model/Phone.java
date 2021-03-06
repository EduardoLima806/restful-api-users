package com.pitang.challengeapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "phone")
public class Phone {

	@Id
    @GeneratedValue
    @JsonIgnore
    private Long id;
	@NotNull
	private Long number;
	@NotNull
	private Short areaCode;
	@NotBlank
	private String countryCode;
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;
		
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getNumber() {
		return number;
	}
	
	public void setNumber(Long number) {
		this.number = number;
	}
	
	public Short getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(Short areaCode) {
		this.areaCode = areaCode;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
