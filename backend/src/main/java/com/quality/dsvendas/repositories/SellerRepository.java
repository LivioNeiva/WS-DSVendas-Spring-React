package com.quality.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quality.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
