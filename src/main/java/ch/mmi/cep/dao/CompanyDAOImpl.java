package ch.mmi.cep.dao;

import java.util.List;
//import java.util.stream.Collectors;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.Company;
import ch.mmi.cep.model.Contact;

@Repository
public class CompanyDAOImpl extends AbstractDao<Integer, Company> implements CompanyDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addCompany(Company company) {
		company.setCompanyIsActive(true);
		company.setCompanyDeletionTimestamp(null);
		company.setCompanyModificationTimestamp(null);
		getCurrentSession().save(company);
	}

	public void updateCompany(Company company) {
		Company companyToUpdate = getCompany(company.getId_company());
		companyToUpdate.setCompanyCategory((company.getCompanyCategory()));
		companyToUpdate.setCompanyName((company.getCompanyName()));
		companyToUpdate.setCompanyStreet(company.getCompanyStreet());
		companyToUpdate.setCompanyPostCode(company.getCompanyPostCode());
		companyToUpdate.setCompanyCity(company.getCompanyCity());
		companyToUpdate.setCompanyPhoneNumber(company.getCompanyPhoneNumber());
		companyToUpdate.setCompanyMobileNumber(company.getCompanyMobileNumber());
		companyToUpdate.setCompanyEmail(company.getCompanyEmail());
		companyToUpdate.setCompanyEmail2(company.getCompanyEmail2());
		companyToUpdate.setCompanyWebsite(company.getCompanyWebsite());
		companyToUpdate.setCompanyComments(company.getCompanyComments());
		companyToUpdate.setCompanyModificationTimestamp(company.getCompanyModificationTimestamp());
		companyToUpdate.setCompanyLogo(company.getCompanyLogo());
		companyToUpdate.setCompanyLogoMimeType(company.getCompanyLogoMimeType());
		getCurrentSession().update(companyToUpdate);
	}

	public Company getCompany(int id_company) {
		Company company = (Company) getCurrentSession().get(Company.class, id_company);
		return company;
	}

	public void deleteCompany(int id_company) {
		Company company = getCompany(id_company);
		if (company != null)
			getCurrentSession().delete(company);
	}

	public void deleteCompany(Company company) {
		Company companyToDelete = getCompany(company.getId_company());
		companyToDelete.setCompanyDeletionTimestamp(company.getCompanyDeletionTimestamp());
		companyToDelete.setCompanyIsActive(false);
		for (Contact contact : companyToDelete.getContacts()) {
			if (contact.getCompanies().size() == 1) {
				//getCurrentSession().delete(contact);//complete deletion
				contact.setContactIsActive(false);
			} else {
				for (Company contactCompany : contact.getCompanies()) {
					if (contactCompany.equals(company)) {
						// contact.getCompanies().remove(company);//complete delettion
						contact.setContactIsActive(false);
					}
				}
			}
		}
		companyToDelete.getContacts().clear();
		getCurrentSession().update(companyToDelete);
	}

	@SuppressWarnings("unchecked")
	public List<Company> getCompanies() {
		return getCurrentSession().createQuery("from Company").list();
	}

	public Company findById(int id_company) {
		return getByKey(id_company);
	}

	@SuppressWarnings("unchecked")
	public List<Company> findAll() {
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("id_company"));
		return (List<Company>) crit.list();
	}
}
