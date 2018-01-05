package ch.mmi.cep.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.Company;
//import ch.mmi.cep.model.Company;
import ch.mmi.cep.model.Contact;

@Repository
public class ContactDAOImpl extends AbstractDao<Integer, Contact> implements ContactDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addContact(Contact contact) {
		contact.setContactIsActive(true);
		contact.setContactModificationTimestamp(null);
		contact.setContactDeletionTimestamp(null);
		getCurrentSession().save(contact);
	}

	public void updateContact(Contact contact) {
		Contact contactToUpdate = getContact(contact.getId_contact());
		contactToUpdate.setContactLastName(contact.getContactLastName());
		contactToUpdate.setContactFirstName(contact.getContactFirstName());
		contactToUpdate.setContactModificationTimestamp(contact.getContactModificationTimestamp());
		contactToUpdate.setContactStreet(contact.getContactStreet());
		contactToUpdate.setContactPostCode(contact.getContactPostCode());
		contactToUpdate.setContactCity(contact.getContactCity());
		contactToUpdate.setContactPhoneNumber(contact.getContactPhoneNumber());
		contactToUpdate.setContactMobileNumber(contact.getContactMobileNumber());
		contactToUpdate.setContactEmail(contact.getContactEmail());
		contactToUpdate.setContactEmail2(contact.getContactEmail2());
		contactToUpdate.setBilling(contact.getBilling());
		contactToUpdate.setComments(contact.getComments());
		contactToUpdate.setSalutations(contact.getSalutations());
		contactToUpdate.setSendMagazine(contact.getSendMagazine());
		contactToUpdate.setSendInvitation(contact.getSendInvitation());
		contactToUpdate.setSendClubInvitation(contact.getSendClubInvitation());
		contactToUpdate.setMicrotechnics(contact.getMicrotechnics());
		contactToUpdate.setMagazinePublication(contact.getMagazinePublication());
		contactToUpdate.setExecutiveBoard(contact.getExecutiveBoard());
		contactToUpdate.setStrategyBoard(contact.getStrategyBoard());
		contactToUpdate.setServicesBoard(contact.getServicesBoard());
		contactToUpdate.setTrainingBoard(contact.getTrainingBoard());
		contactToUpdate.setCoachingBoard(contact.getCoachingBoard());
		contactToUpdate.setIndustryBoard(contact.getIndustryBoard());
		contactToUpdate.setFacilitiesBoard(contact.getFacilitiesBoard());
		contactToUpdate.setClubCompaniesBoard(contact.getClubCompaniesBoard());
		Company company = (Company) getCurrentSession().get(Company.class, contact.getCompany_id());
		contactToUpdate.getCompanies().clear();
		contactToUpdate.getCompanies().add(company);
		getCurrentSession().update(contactToUpdate);
	}

	public Contact getContact(int id_contact) {
		Contact contact = (Contact) getCurrentSession().get(Contact.class, id_contact);
		return contact;
	}

	public void deleteContact(int id_contact) {
		Contact contact = getContact(id_contact);
		if (contact != null)
			getCurrentSession().delete(contact);
	}

	public void deleteContact(Contact contact) {
		Contact contactToDelete = getContact(contact.getId_contact());
		contactToDelete.setContactDeletionTimestamp(contact.getContactDeletionTimestamp());
		contactToDelete.setContactIsActive(false);
		getCurrentSession().update(contactToDelete);
	}

	@SuppressWarnings("unchecked")
	public List<Contact> getContacts() {
		return getCurrentSession().createQuery("from Contact").list();
	}

	public Contact findById(int id_contact) {
		Contact contact = getByKey(id_contact);
		if (contact != null) {
			Hibernate.initialize(contact.getCompanies());
		}
		return contact;
	}

	@SuppressWarnings("unchecked")
	public List<Contact> findAllContacts() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("contactLastName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid
																		// duplicates.
		List<Contact> contacts = (List<Contact>) criteria.list();
		return contacts;
	}

	public void save(Contact contact) {
		contact.setContactIsActive(true);
		persist(contact);
	}

	public void deleteById(int id_contact) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("id_contact", id_contact));
		Contact contact = (Contact) crit.uniqueResult();
		delete(contact);
	}

}
