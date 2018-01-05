package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.MemberMobDAO;
import ch.mmi.cep.model.MemberMob;

@Service
@Transactional
public class MemberMobServiceImpl implements MemberMobService {

	@Autowired
	private MemberMobDAO memberMobDAO;

	public void addMemberMob(MemberMob memberMob) {
		memberMobDAO.addMemberMob(memberMob);		
	}

	public void updateMemberMob(MemberMob memberMob) {
		memberMobDAO.updateMemberMob(memberMob);
	}

	public MemberMob getMemberMob(int id_memberMob) {
		return memberMobDAO.getMemberMob(id_memberMob);
	}

	public void deleteMemberMob(int id_memberMob) {
		memberMobDAO.deleteMemberMob(id_memberMob);
	}
	
	public void deleteMemberMob(MemberMob memberMob) {
		memberMobDAO.deleteMemberMob(memberMob);
	}
	
	public List<MemberMob> getMembersMob() {
		return memberMobDAO.getMembersMob();
	}
	
}
