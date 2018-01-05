package ch.mmi.cep.dao;

import java.util.List;

import ch.mmi.cep.model.MemberMob;

public interface MemberMobDAO {
	
	public void addMemberMob(MemberMob memberMob);
	public void updateMemberMob(MemberMob memberMob);
	public MemberMob getMemberMob(int id_memberMob);
	public void deleteMemberMob(int id_memberMob);
	public void deleteMemberMob(MemberMob memberMob);
	public List<MemberMob> getMembersMob();

}
