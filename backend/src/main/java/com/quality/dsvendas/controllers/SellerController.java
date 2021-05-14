package com.quality.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quality.dsvendas.DTO.SellerDTO;
import com.quality.dsvendas.service.SellerService;

@RestController //informa que essa classe é um controlador rest
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findall(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list); //ok indica a resposta 200(Sucesso) doprotocolo http.
		
	}
	
	
	

}
