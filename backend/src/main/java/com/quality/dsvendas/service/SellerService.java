package com.quality.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quality.dsvendas.DTO.SellerDTO;
import com.quality.dsvendas.entities.Seller;
import com.quality.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){//vamos retornar uma lista do tipo SellerDTO
		List<Seller> result =  repository.findAll();
		//o repository retorna um lista de entidade, e teremos uma lista do tipo Seller,
		//o metodo retorna uma lista do tipo DTO, temos q converter a lista do tipo Seller para DTO
		//x(result) sera instanciado no SellerDTO() que retornara uma lista do tipo DTO
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
