package com.liam.company.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liam.company.service.models.Company;
import com.liam.company.service.repositories.CompanyRepository;

@Service
public class CompanyService {
	
	
	@Autowired
	private CompanyRepository companyRepo;
	
	
	public Company create(Company company) {
		return companyRepo.save(company);
	}

	public Company findByCompId(Long id) {
		return companyRepo.findByCompanyId(id);
	}
}
