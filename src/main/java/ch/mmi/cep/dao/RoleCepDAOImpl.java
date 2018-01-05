package ch.mmi.cep.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.RoleCep;

@Repository
public class RoleCepDAOImpl implements RoleCepDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public RoleCep getRoleCep(int roleCep_id) {
		RoleCep roleCep = (RoleCep) getCurrentSession().load(RoleCep.class, roleCep_id);
		return roleCep;
	}

}
