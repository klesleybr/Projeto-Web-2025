package com.project.backend_web.domain.users;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "users")
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private UUID id;
	private String username;
	private String password;
	private String email;
	private String picture;
	private Date createdAt;
	
	public Date getCreatedAt() {
		
		return createdAt;
		
	}
	
	public void setCreatedAt(Date createdAt) {
		
		this.createdAt = createdAt;
		
	}
	
	public String getPicture() {
		
		return picture;
		
	}
	
	public void setPicture(String picture) {
		
		this.picture = picture;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public void setPassword(String password) {
		
		this.password = password;
		
	}
	
	public String getUsername() {
		
		return username;
		
	}
	
	public void setUsername(String username) {
		
		this.username = username;
		
	}
	
	public UUID getId() {
		
		return id;
		
	}
	
	public void setId(UUID id) {
		
		this.id = id;
		
	}

}
