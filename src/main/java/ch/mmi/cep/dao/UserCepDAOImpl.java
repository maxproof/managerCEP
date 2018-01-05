package ch.mmi.cep.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.RoleCep;
import ch.mmi.cep.model.UserCep;


@Repository
public class UserCepDAOImpl extends AbstractDao<Integer, UserCep> implements UserCepDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session openSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public UserCep getUserCep(String userCepLogin) {
		List<UserCep> userCepList = new ArrayList<UserCep>();
		Query query = openSession().createQuery("from UserCep u where u.userCepLogin = :userCepLogin");
		query.setParameter("userCepLogin", userCepLogin);
		userCepList = query.list();
		if (userCepList.size() > 0)
			return userCepList.get(0);
		else
			return null;
	}
	
	public void addUserCep(UserCep userCep) {
		userCep.setRoleCep((RoleCep) openSession().get(RoleCep.class, 1));//shortcut
		userCep.setUserCepIsActive(true);
		userCep.setUserCepDeletionTimestamp(null);
		userCep.setUserCepModificationTimestamp(null);
		openSession().save(userCep);
	}

	public void updateUserCep(UserCep userCep) {
		UserCep userCepToUpdate = getUserCep(userCep.getUserCep_id());
		userCepToUpdate.setUserCepLastName(userCep.getUserCepLastName());
		userCepToUpdate.setUserCepFirstName(userCep.getUserCepFirstName());
		userCepToUpdate.setUserCepEmail(userCep.getUserCepEmail());
		userCepToUpdate.setUserCepPassword(userCep.getUserCepPassword());
		userCepToUpdate.setUserCepLogin(userCep.getUserCepLogin());
		userCepToUpdate.setUserCepComments((userCep.getUserCepComments()));
		userCepToUpdate.setUserCepModificationTimestamp(userCep.getUserCepModificationTimestamp());
		openSession().update(userCepToUpdate);
	}

	public UserCep getUserCep(int userCep_id) {
		UserCep userCep = (UserCep) openSession().get(UserCep.class, userCep_id);
		return userCep;
	}

	public void deleteUserCep(int userCep_id) {
		UserCep userCep = getUserCep(userCep_id);
		if (userCep != null)
			openSession().delete(userCep);
	}
	
	public void deleteUserCep(UserCep userCep) {
		UserCep userCepToDelete = getUserCep(userCep.getUserCep_id());
		userCepToDelete.setUserCepDeletionTimestamp(userCep.getUserCepDeletionTimestamp());
		userCepToDelete.setUserCepIsActive(false);
		userCepToDelete.setUserCepPassword("deleted");//no more login with this userCep
		openSession().update(userCepToDelete);
	}

	@SuppressWarnings("unchecked")
	public List<UserCep> getUsersCep() {
		return openSession().createQuery("from UserCep").list();
	}
	
	public UserCep findById(int userCep_id) {
		UserCep userCep = getByKey(userCep_id);
		if(userCep!=null){
			Hibernate.initialize(userCep.getRoleCep());
		}
		return userCep;
	}

	@SuppressWarnings("unchecked")
	public List<UserCep> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("userCepLastName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<UserCep> usersCep = (List<UserCep>) criteria.list();
		return usersCep;
	}

	public void save(UserCep userCep) {
		userCep.setUserCepIsActive(true);
		userCep.setUserCepDeletionTimestamp(null);
		userCep.setUserCepModificationTimestamp(null);
		persist(userCep);
	}

}
