package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Office;

public interface OfficeRepository extends JpaRepository<Office, String> {

}
