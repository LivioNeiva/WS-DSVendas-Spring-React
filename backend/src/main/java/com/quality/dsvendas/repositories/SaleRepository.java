package com.quality.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quality.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
