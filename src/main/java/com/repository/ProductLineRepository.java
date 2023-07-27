package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.ProductLine;

public interface ProductLineRepository extends JpaRepository<ProductLine, String> {

}
