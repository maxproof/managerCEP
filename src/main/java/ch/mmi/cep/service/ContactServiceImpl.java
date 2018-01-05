package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import ch.mmi.cep.dao.AbstractDao;
import ch.mmi.cep.dao.ContactDAO;
import ch.mmi.cep.model.Company;
import ch.mmi.cep.model.Contact;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private ContactDAO contactDAO;

	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	public void updateContact(Contact contact) {
		contactDAO.updateContact(contact);
	}

	public Contact getContact(int id_contact) {
		return contactDAO.getContact(id_contact);
	}

	public void deleteContact(int id_contact) {
		contactDAO.deleteContact(id_contact);
	}

	public void deleteContact(Contact contact) {
		contactDAO.deleteContact(contact);
	}

	public List<Contact> getContacts() {
		return contactDAO.getContacts();
	}

	public Contact findById(int id_contact) {
		return contactDAO.findById(id_contact);
	}

	public void saveContact(Contact contact) {
		contactDAO.save(contact);
	}

	public void updateCContact(Contact contact) {
		Contact entity = contactDAO.findById(contact.getId_contact());
		if (entity != null) {
			entity.setContactLastName(contact.getContactLastName());
			entity.setContactFirstName(contact.getContactFirstName());
			entity.setContactModificationTimestamp(contact.getContactModificationTimestamp());
			entity.setContactStreet(contact.getContactStreet());
			entity.setContactPostCode(contact.getContactPostCode());
			entity.setContactCity(contact.getContactCity());
			entity.setContactPhoneNumber(contact.getContactPhoneNumber());
			entity.setContactMobileNumber(contact.getContactMobileNumber());
			entity.setContactEmail(contact.getContactEmail());
			entity.setContactEmail2(contact.getContactEmail2());
			entity.setContactPassword(contact.getContactPassword());
			entity.setContactNewPassword(contact.getContactNewPassword());
			entity.setBilling(contact.getBilling());
			entity.setComments(contact.getComments());
			entity.setSalutations(contact.getSalutations());
			entity.setSendMagazine(contact.getSendMagazine());
			entity.setSendInvitation(contact.getSendInvitation());
			entity.setSendClubInvitation(contact.getSendClubInvitation());
			entity.setMicrotechnics(contact.getMicrotechnics());
			entity.setMagazinePublication(contact.getMagazinePublication());
			entity.setExecutiveBoard(contact.getExecutiveBoard());
			entity.setStrategyBoard(contact.getStrategyBoard());
			entity.setServicesBoard(contact.getServicesBoard());
			entity.setTrainingBoard(contact.getTrainingBoard());
			entity.setCoachingBoard(contact.getCoachingBoard());
			entity.setIndustryBoard(contact.getIndustryBoard());
			entity.setFacilitiesBoard(contact.getFacilitiesBoard());
			entity.setClubCompaniesBoard(contact.getClubCompaniesBoard());
			Company company = companyService.getCompany(contact.getCompany_id());
			contact.getCompanies().clear();
			contact.getCompanies().add(company);
			entity.setContactIsActive(true);
		}
	}

	public void deleteContactById(int id_contact) {
		contactDAO.deleteById(id_contact);
	}

	public List<Contact> findAllContacts() {
		return contactDAO.findAllContacts();
	}

}
