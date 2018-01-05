package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.CompanyDAO;
import ch.mmi.cep.model.Company;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyDAO companyDAO;

	public void addCompany(Company company) {
		companyDAO.addCompany(company);		
	}

	public void updateCompany(Company company) {
		companyDAO.updateCompany(company);
	}

	public Company getCompany(int id_company) {
		return companyDAO.getCompany(id_company);
	}

	public void deleteCompany(int id_company) {
		companyDAO.deleteCompany(id_company);
	}
	
	public void deleteCompany(Company company) {
		companyDAO.deleteCompany(company);
	}
	
	public List<Company> getCompanies() {
		return companyDAO.getCompanies();
	}
		
	public Company findById(int id_company) {
		return companyDAO.findById(id_company);
	}

	public List<Company> findAll() {
		return companyDAO.findAll();
	}
}
