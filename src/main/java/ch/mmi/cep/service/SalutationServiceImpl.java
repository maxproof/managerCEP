package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.SalutationDAO;
import ch.mmi.cep.model.Salutation;

@Service
@Transactional
public class SalutationServiceImpl implements SalutationService {
	
	@Autowired
	private SalutationDAO salutationDAO;

	public void addSalutation(Salutation salutation) {
		salutationDAO.addSalutation(salutation);		
	}

	public void updateSalutation(Salutation salutation) {
		salutationDAO.updateSalutation(salutation);
	}

	public Salutation getSalutation(int id_salutation) {
		return salutationDAO.getSalutation(id_salutation);
	}

	public void deleteSalutation(int id_salutation) {
		salutationDAO.deleteSalutation(id_salutation);
	}
	
	public void deleteSalutation(Salutation salutation) {
		salutationDAO.deleteSalutation(salutation);
	}
	
	public List<Salutation> getSalutations() {
		return salutationDAO.getSalutations();
	}

}
