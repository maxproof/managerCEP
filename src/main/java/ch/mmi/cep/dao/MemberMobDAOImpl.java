package ch.mmi.cep.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.MemberMob;

@Repository
public class MemberMobDAOImpl implements MemberMobDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addMemberMob(MemberMob memberMob) {
		memberMob.setMembersMobIsActive(true);
		memberMob.setDateMemberMobModification(null);
		memberMob.setDateMemberMobDeletion(null);
		getCurrentSession().save(memberMob);
	}

	public void updateMemberMob(MemberMob memberMob) {
		MemberMob memberMobToUpdate = getMemberMob(memberMob.getId_memberMob());
		memberMobToUpdate.setMemberMobFirstName(memberMob.getMemberMobFirstName());
		memberMobToUpdate.setMemberMobLastName(memberMob.getMemberMobLastName());
		memberMobToUpdate.setMemberMobEmail(memberMob.getMemberMobEmail());
		memberMobToUpdate.setMemberMobPassword(memberMob.getMemberMobPassword());
		memberMobToUpdate.setMemberMobCompany(memberMob.getMemberMobCompany());
		memberMobToUpdate.setMemberMobComments(memberMob.getMemberMobComments());
		memberMobToUpdate.setDateMemberMobModification(memberMob.getDateMemberMobModification());
		getCurrentSession().update(memberMobToUpdate);
	}

	public MemberMob getMemberMob(int id_memberMob) {
		MemberMob memberMob = (MemberMob) getCurrentSession().get(MemberMob.class, id_memberMob);
		return memberMob;
	}

	public void deleteMemberMob(int id_memberMob) {
		MemberMob memberMob = getMemberMob(id_memberMob);
		if (memberMob != null)
			getCurrentSession().delete(memberMob);
	}
	
	public void deleteMemberMob(MemberMob memberMob) {
		MemberMob memberMobToDelete = getMemberMob(memberMob.getId_memberMob());
		memberMobToDelete.setMembersMobIsActive(false);
		memberMobToDelete.setDateMemberMobDeletion(memberMob.getDateMemberMobDeletion());
		getCurrentSession().update(memberMobToDelete);
	}

	@SuppressWarnings("unchecked")
	public List<MemberMob> getMembersMob() {
		return getCurrentSession().createQuery("from MemberMob").list();
	}

}
