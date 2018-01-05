package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.UserCepDAO;
import ch.mmi.cep.model.UserCep;

@Service
@Transactional
public class UserCepServiceImpl implements UserCepService {
	
	@Autowired
    private UserCepDAO userCepDAO;
	
    public UserCep getUserCep(String userCepLogin) {
        return userCepDAO.getUserCep(userCepLogin);
    }
    
	public void addUserCep(UserCep userCep) {
		userCepDAO.addUserCep(userCep);		
	}

	public void updateUserCep(UserCep userCep) {
		userCepDAO.updateUserCep(userCep);
	}

	public UserCep getUserCep(int userCep_id) {
		return userCepDAO.getUserCep(userCep_id);
	}

	public void deleteUserCep(int userCep_id) {
		userCepDAO.deleteUserCep(userCep_id);
	}
	
	public void deleteUserCep(UserCep userCep) {
		userCepDAO.deleteUserCep(userCep);
	}
	
	public List<UserCep> getUsersCep() {
		return userCepDAO.getUsersCep();
	}
	
	public UserCep findById(int userCep_id) {
		return userCepDAO.findById(userCep_id);
	}

	public void saveUser(UserCep userCep) {
		userCepDAO.save(userCep);
	}

	public void updateUUser(UserCep userCep) {
		UserCep entity = userCepDAO.findById(userCep.getUserCep_id());
		if(entity!=null){
			entity.setUserCepPassword(userCep.getUserCepPassword());
			entity.setUserCepLastName(userCep.getUserCepLastName());
			entity.setUserCepFirstName(userCep.getUserCepFirstName());
			entity.setUserCepEmail(userCep.getUserCepEmail());
			entity.setRoleCep(userCep.getRoleCep());//???
		}
	}

	public List<UserCep> findAllUsers() {
		return userCepDAO.findAllUsers();
	}
 
}
