package com.project.backend_web.domain.products;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "products")
@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private UUID id;
	private String name;
	private String manufacturer;
	private String description;
	private String picture;
	private double weight;
	private double volume;
	
	public Product() {}
	
	public Product(UUID id, String name, String manufacturer, String description, String picture, 
			double weight, double volume) {
		
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.picture = picture;
		this.weight = weight;
		this.volume = volume;
		
	}
	
	public UUID getId() {
		
		return this.id;
		
	}
	
	public void setId(UUID id) {
		
		this.id = id;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getManufacturer() {
		
		return this.manufacturer;
		
	}
	
	public void setManufacturer(String manufacturer) {
		
		this.manufacturer = manufacturer;
		
	}

	public String getDescription() {
		
		return this.description;
		
	}
	
	public void setDescription(String description) {
		
		this.description = description;
		
	}

	public String getPicture() {
		
		return this.picture;
		
	}
	
	public void setPicture(String picture) {
		
		this.picture = picture;
		
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public void setWeight(double weight) {
		
		this.weight = weight;
		
	}
	
	public double getVolume() {
		
		return this.volume;
		
	}
	
	public void setVolume(double volume) {
		
		this.volume = volume;
		
	}

		
}
