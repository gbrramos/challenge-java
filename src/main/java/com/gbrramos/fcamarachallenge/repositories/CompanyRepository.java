package com.gbrramos.fcamarachallenge.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gbrramos.fcamarachallenge.models.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer>{
    
}
