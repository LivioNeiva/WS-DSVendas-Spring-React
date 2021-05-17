package com.quality.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quality.dsvendas.DTO.SaleDTO;
import com.quality.dsvendas.DTO.SaleSuccessDTO;
import com.quality.dsvendas.DTO.SaleSumDTO;
import com.quality.dsvendas.entities.Sale;
import com.quality.dsvendas.repositories.SaleRepository;
import com.quality.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	SaleRepository repository;
	
	@Autowired
	SellerRepository sellerRepository;
	
	/*
	 metodo para chamar toda lista de vendedor para cache memoria, evita ficar indo buscar no banco e dados,
	 esse metodo é usado para listas pequenas, listas com 1000 itens não é viavel. Page
	 */
	@Transactional(readOnly = true)//vai garantir q toda operação com banco se resolvida no momento execução do metodo, readOnly = true -> e para na fazer lock no banco
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));//page ja é um string do java 8, nao precisa por stream
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGupedBySeller(){
		return repository.successGroupedBYSeller();
	}
	
	public SaleDTO findById(Long id) {
		
		Sale sale = repository.findById(id).get();
		long num = sale.getId();
		SaleDTO idDTO = new SaleDTO(sale);
		return idDTO;
		
	}
}

/*
paginação por pagina
http://localhost:8080/sales?page=1
cada pagina vai ter 10elementos
http://localhost:8080/sales?page=2&size=10
ordenação por data
http://localhost:8080/sales?page=2&size=10&sort=date
ordenação descendente
http://localhost:8080/sales?page=2&size=10&sort=date,desc
*/
