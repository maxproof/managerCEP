package ch.mmi.cep.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "rolescep")
public class RoleCep implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer roleCep_id;
	private String roleCep;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "usercep_roles", 
		joinColumns = { @JoinColumn(name = "roleCep_id") }, 
		inverseJoinColumns = {@JoinColumn(name = "userCep_id") })
	private Set<UserCep> userRoles;
	
	public Integer getRoleCep_id() {
		return roleCep_id;
	}
	public void setRoleCep_id(Integer roleCep_id) {
		this.roleCep_id = roleCep_id;
	}
	public String getRoleCep() {
		return roleCep;
	}
	public void setRoleCep(String roleCep) {
		this.roleCep = roleCep;
	}
	public Set<UserCep> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserCep> userRoles) {
		this.userRoles = userRoles;
	}
	
	@Override
	public String toString() {
		return "RoleCep [roleCep_id=" + roleCep_id + ", roleCep=" + roleCep + ", userRoles=" + userRoles + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleCep == null) ? 0 : roleCep.hashCode());
		result = prime * result + ((roleCep_id == null) ? 0 : roleCep_id.hashCode());
		result = prime * result + ((userRoles == null) ? 0 : userRoles.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleCep other = (RoleCep) obj;
		if (roleCep == null) {
			if (other.roleCep != null)
				return false;
		} else if (!roleCep.equals(other.roleCep))
			return false;
		if (roleCep_id == null) {
			if (other.roleCep_id != null)
				return false;
		} else if (!roleCep_id.equals(other.roleCep_id))
			return false;
		if (userRoles == null) {
			if (other.userRoles != null)
				return false;
		} else if (!userRoles.equals(other.userRoles))
			return false;
		return true;
	}

}
