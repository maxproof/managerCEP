package ch.mmi.cep.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.Salutation;

@Repository
public class SalutationDAOImpl implements SalutationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addSalutation(Salutation salutation) {
		salutation.setSalutationIsActive(true);
		salutation.setSalutationDeletionTimestamp(null);
		salutation.setSalutationModificationTimestamp(null);
		getCurrentSession().save(salutation);
	}

	public void updateSalutation(Salutation salutation) {
		Salutation salutationToUpdate = getSalutation(salutation.getId_salutation());
		salutationToUpdate.setSalutationComments(salutation.getSalutationComments());
		salutationToUpdate.setSalutationName((salutation.getSalutationName()));
		salutationToUpdate.setSalutationModificationTimestamp(salutation.getSalutationModificationTimestamp());
		getCurrentSession().update(salutationToUpdate);
	}

	public Salutation getSalutation(int id_salutation) {
		Salutation salutation = (Salutation) getCurrentSession().get(Salutation.class, id_salutation);
		return salutation;
	}

	public void deleteSalutation(int id_salutation) {
		Salutation salutation = getSalutation(id_salutation);
		if (salutation != null)
			getCurrentSession().delete(salutation);
	}
	
	public void deleteSalutation(Salutation salutation) {
		Salutation salutationToDelete = getSalutation(salutation.getId_salutation());
		salutationToDelete.setSalutationDeletionTimestamp(salutation.getSalutationDeletionTimestamp());
		salutationToDelete.setSalutationIsActive(false);
		getCurrentSession().update(salutationToDelete);
	}

	@SuppressWarnings("unchecked")
	public List<Salutation> getSalutations() {
		return getCurrentSession().createQuery("from Salutation").list();
	}

}
