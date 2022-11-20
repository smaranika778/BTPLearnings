package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Vendor;

public interface IVendorService extends JpaRepository<Vendor, String> {
	
	List<Vendor> findBycompanyName(String companyName);

}
