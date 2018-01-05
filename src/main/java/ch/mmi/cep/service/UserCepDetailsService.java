package ch.mmi.cep.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.UserCepDAO;
import ch.mmi.cep.model.UserCep;

@Service
@Transactional(readOnly = true)
public class UserCepDetailsService implements UserDetailsService {
	
	final static Logger logger = Logger.getLogger(UserCepDetailsService.class);

	@Autowired
	private UserCepDAO userCepDAO;

	public UserDetails loadUserByUsername(String userLogin) throws UsernameNotFoundException {
		UserCep domainUserCep = userCepDAO.getUserCep(userLogin);
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		String userNameLogin = domainUserCep.getUserCepLogin();
		logger.info("## LogIn --> ManagerCEP of User: " + userNameLogin);
		return new User(domainUserCep.getUserCepLogin(), domainUserCep.getUserCepPassword(), enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, getAuthorities(domainUserCep.getRoleCep().getRoleCep_id()));
	}

	public Collection<? extends GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
		return authList;
	}

	public List<String> getRoles(Integer role) {
		List<String> roles = new ArrayList<String>();
		if (role.intValue() == 1) {
			roles.add("ROLE_ADMIN");
		} else if (role.intValue() == 2) {
			roles.add("ROLE_MODERATOR");
		} else if (role.intValue() == 3) {
			roles.add("ROLE_USER");
		} else if (role.intValue() == 4) {
			roles.add("ROLE_DBA");
		}
		return roles;
	}

	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

}
