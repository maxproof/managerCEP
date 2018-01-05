package ch.mmi.cep.dao;

import java.util.List;

import ch.mmi.cep.model.Salutation;

public interface SalutationDAO {
	
	public void addSalutation(Salutation salutation);
	public void updateSalutation(Salutation salutation);
	public Salutation getSalutation(int id_salutation);
	public void deleteSalutation(int id_salutation);
	public void deleteSalutation(Salutation salutation);
	public List<Salutation> getSalutations();

}
