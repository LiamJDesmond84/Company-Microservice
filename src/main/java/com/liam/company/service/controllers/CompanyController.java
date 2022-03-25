package com.liam.company.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liam.company.service.models.Company;
import com.liam.company.service.services.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {
	
	@Autowired
	private CompanyService companyServ;
	
	
	@PostMapping("/create")
	private Company createCompany(@RequestBody Company company) {
		return companyServ.create(company);
	}
	
	
	@GetMapping("/{id}")
	private Company findbyCompId(@PathVariable("id") Long id) {
		return companyServ.findByCompId(id);
	}

}
