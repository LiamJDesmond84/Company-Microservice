package com.liam.company.service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liam.company.service.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	List<Company> findAll();

	Company findByCompanyId(Long id);

}
