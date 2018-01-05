package ch.mmi.cep.dao;

import java.util.List;

import ch.mmi.cep.model.Contact;

public interface ContactDAO {
	
	public void addContact(Contact contact);
	public void updateContact(Contact contact);
	public Contact getContact(int id_contact);
	public void deleteContact(int id_contact);
	public void deleteContact(Contact contact);
	public List<Contact> getContacts();
	
	Contact findById(int id_contact);
	void save(Contact contact);
	void deleteById(int id_contact);
	List<Contact> findAllContacts();

}
