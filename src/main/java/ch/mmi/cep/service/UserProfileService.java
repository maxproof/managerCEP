package ch.mmi.cep.service;

import java.util.List;

import ch.mmi.cep.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);
	UserProfile findByType(String type);
	List<UserProfile> findAll();

}
