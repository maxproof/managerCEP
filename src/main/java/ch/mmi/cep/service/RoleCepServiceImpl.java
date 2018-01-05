package ch.mmi.cep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.RoleCepDAO;
import ch.mmi.cep.model.RoleCep;

@Service
@Transactional
public class RoleCepServiceImpl {
	
	@Autowired
    private RoleCepDAO roleCepDAO;
 
    public RoleCep getRoleCep(int roleCep_id) {
        return roleCepDAO.getRoleCep(roleCep_id);
    }

}
