package com.quality.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quality.dsvendas.DTO.SaleSuccessDTO;
import com.quality.dsvendas.DTO.SaleSumDTO;
import com.quality.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	//linguagem jpql, Para o jpql funcionar sua classe precisa estar anotada com @Entity . Apenas classes com essa anotação podem ser usadas na sua query.
	@Query("SELECT new com.quality.dsvendas.DTO.SaleSumDTO(obj.seller,SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller")// tempo aula 1:35:00
	List<SaleSumDTO> amountGroupedBySeller();
	
	//new SaleSucessDTO()
	@Query("SELECT new com.quality.dsvendas.DTO.SaleSuccessDTO(seller, SUM(obj.visited), SUM(obj.deals))"
			+ "from Sale as obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBYSeller();
}
