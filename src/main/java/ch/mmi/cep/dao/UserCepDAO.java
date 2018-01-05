package ch.mmi.cep.dao;

import java.util.List;

import ch.mmi.cep.model.UserCep;

public interface UserCepDAO {
	
	public UserCep getUserCep(String userCepLogin);
	
	public void addUserCep(UserCep userCep);
	public void updateUserCep(UserCep userCep);
	public UserCep getUserCep(int userCep_id);
	public void deleteUserCep(int userCep_id);
	public void deleteUserCep(UserCep userCep);
	public List<UserCep> getUsersCep();
	
	UserCep findById(int userCep_id);
	void save(UserCep userCep);	
	List<UserCep> findAllUsers();

}
