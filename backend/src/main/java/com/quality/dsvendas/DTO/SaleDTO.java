package com.quality.dsvendas.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import com.quality.dsvendas.entities.Sale;

public class SaleDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Integer visited;
	private Integer deals; //vendas fechadas
	private Double amount;
	private LocalDate date;
	
	SellerDTO seller;
	
	public SaleDTO() {
		
	}

	public SaleDTO(long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited; //visitas
		this.deals = deals; //vendas
		this.amount = amount; //valres
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
	
}
