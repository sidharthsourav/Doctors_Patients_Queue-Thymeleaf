package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Patient;

public interface PatientRepository extends CrudRepository<Patient,Integer>{
	// it handles CRUD operations.
	
	
}
