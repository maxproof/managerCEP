package ch.mmi.cep.dao;

import java.util.List;

import ch.mmi.cep.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	UserProfile findByType(String type);
	UserProfile findById(int id);
}
