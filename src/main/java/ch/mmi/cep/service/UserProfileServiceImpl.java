package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.UserProfileDao;
import ch.mmi.cep.model.UserProfile;


@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao userProfileDao;
	
	public UserProfile findById(int id) {
		return userProfileDao.findById(id);
	}

	public UserProfile findByType(String type){
		return userProfileDao.findByType(type);
	}

	public List<UserProfile> findAll() {
		return userProfileDao.findAll();
	}
}
