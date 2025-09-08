package com.project.backend_web.domain.buy_list;

import java.util.Date;
import java.util.UUID;

import com.project.backend_web.domain.products.Product;
import com.project.backend_web.domain.users.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "buy_list")
@Entity
public class BuyList {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	private int amount;
	private double weight = 0;
	private double unityPrice;
	private boolean isBought = false;
	private boolean isWeightSell = false;
	private Date dateAdd = null;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public BuyList() {}
	
	public BuyList(UUID id, Product product, int quantify, double weight, double unityPrice, boolean isBought, 
			boolean isWeightSell, Date dateAdd, User user) {
		
		this.id = id;
		this.product = product;
		this.amount = quantify;
		this.weight = weight;
		this.unityPrice = unityPrice;
		this.isBought = isBought;
		this.isWeightSell = isWeightSell;
		this.dateAdd = dateAdd;
		this.user = user;
		
	}
	
	public BuyList(Product product, int quantify, double unityPrice, User user) {
		
		this.product = product;
		this.amount = quantify;
		this.unityPrice = unityPrice;
		this.user = user;
		
	}
	
	public UUID getId() {
		
		return this.id;
		
	}
	
	public void setId(UUID id) {
		
		this.id = id;
		
	}
	
	public int getQuantify() {
		
		return this.amount;
		
	}
	
	public void setQuantify(int quantify) {
		
		this.amount = quantify;
	}
	
	public double getWeight() {
		
		return this.weight;
		
	}
	
	public void setWeight(double weight) {
		
		this.weight = weight;
		
	}
	
	public double getUnityPrice() {
		
		return this.unityPrice;
		
	}
	
	public void setUnityPrice(double unityPrice) {
		
		this.unityPrice = unityPrice;
		
	}
	
	public boolean getIsBought() {
		
		return this.isBought;
		
	}
	
	public void setIsBought(boolean isBought) {
		
		this.isBought = isBought;
		
	}
	
	public boolean getIsWeightSell() {
		
		return this.isWeightSell;
		
	}
	
	public void setIsWeightSell(boolean isWeightSell) {
		
		this.isWeightSell = isWeightSell;
		
	}
	
	public Date getDateAdd() {
		
		return this.dateAdd;
		
	}
	
	public void setDateAdd(Date dateAdd) {
		
		this.dateAdd = dateAdd;
		
	}
	
	public User getUser() {
		
		return this.user;
		
	}
	
	public void setUser(User user) {
		
		this.user = user;
		
	}
	
	public Product getProduct() {
		
		return this.product;
		
	}
	
	public void setProduct(Product product) {
		
		this.product = product;
		
	}

}
