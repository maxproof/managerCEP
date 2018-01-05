package ch.mmi.cep.dao;

import java.util.List;

import ch.mmi.cep.model.Company;

public interface CompanyDAO {
	
	public void addCompany(Company company);
	public void updateCompany(Company company);
	public Company getCompany(int id_company);
	public void deleteCompany(int id_company);
	public void deleteCompany(Company company);//
	public List<Company> getCompanies();
	
	List<Company> findAll();
	Company findById(int id_company);

}
