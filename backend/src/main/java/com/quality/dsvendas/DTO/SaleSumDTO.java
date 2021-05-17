package com.quality.dsvendas.DTO;

import java.io.Serializable;

import com.quality.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String sallerName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}
	
	public SaleSumDTO(Seller seller, Double sum) {
		this.sallerName = seller.getName(); //na hora eu agrupar os dados na consulta, eu agrupo por seller
		this.sum = sum;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}
