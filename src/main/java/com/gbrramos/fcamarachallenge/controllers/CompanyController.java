package com.gbrramos.fcamarachallenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gbrramos.fcamarachallenge.models.Company;
import com.gbrramos.fcamarachallenge.repositories.CompanyRepository;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RestController
public class CompanyController {
    @Autowired
    private CompanyRepository repository;
   
  
    @GetMapping(path="/")
    public @ResponseBody Iterable<Company> list() {
            return repository.findAll();
    }
}
