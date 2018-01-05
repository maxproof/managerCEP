package ch.mmi.cep.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userprofile")
public class UserProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_userProfile;

	@Column(name = "type", length = 15, unique = true, nullable = false)
	private String type = UserProfileType.USER.getUserProfileType();

	public Integer getId_userProfile() {
		return id_userProfile;
	}

	public void setId_userProfile(Integer id_userProfile) {
		this.id_userProfile = id_userProfile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_userProfile == null) ? 0 : id_userProfile.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof UserProfile))
			return false;
		UserProfile other = (UserProfile) obj;
		if (id_userProfile == null) {
			if (other.id_userProfile != null)
				return false;
		} else if (!id_userProfile.equals(other.id_userProfile))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id_userProfile + ", type=" + type + "]";
	}
}
