package ch.mmi.cep.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.Pattern;

//import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotEmpty;

//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.JoinColumn;

@Entity
@Table(name = "userscep")
public class UserCep implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer userCep_id;
	// @NotBlank(message="Doit être renseigné.")
	private String userCepLastName;
	// @NotBlank(message="Doit être renseigné.")
	private String userCepFirstName;
	// @NotBlank(message="Doit être renseigné.")
	// @Email(message="Format email invalide.")
	// @Pattern(regexp="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
	// message="Format email invalide!")
	private String userCepEmail;
	// @NotBlank(message="Doit être renseigné.")
	private String userCepLogin;
	// @NotBlank(message="Doit être renseigné.")
	private String userCepPassword;
	// @NotEmpty
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "usercep_roles", joinColumns = { @JoinColumn(name = "userCep_id") }, inverseJoinColumns = {
			@JoinColumn(name = "roleCep_id") })
	private RoleCep roleCep;
	private String userCepComments;
	private Timestamp userCepInsertionTimestamp = timestampManager();
	private Timestamp userCepModificationTimestamp = timestampManager();
	private Timestamp userCepDeletionTimestamp = timestampManager();
	private Boolean userCepIsActive;

	public Integer getUserCep_id() {
		return userCep_id;
	}

	public void setUserCep_id(Integer userCep_id) {
		this.userCep_id = userCep_id;
	}

	public String getUserCepLastName() {
		return userCepLastName;
	}

	public void setUserCepLastName(String userCepLastName) {
		this.userCepLastName = userCepLastName;
	}

	public String getUserCepFirstName() {
		return userCepFirstName;
	}

	public void setUserCepFirstName(String userCepFirstName) {
		this.userCepFirstName = userCepFirstName;
	}

	public String getUserCepEmail() {
		return userCepEmail;
	}

	public void setUserCepEmail(String userCepEmail) {
		this.userCepEmail = userCepEmail;
	}

	public String getUserCepLogin() {
		return userCepLogin;
	}

	public void setUserCepLogin(String userCepLogin) {
		this.userCepLogin = userCepLogin;
	}

	public String getUserCepPassword() {
		return userCepPassword;
	}

	public void setUserCepPassword(String userCepPassword) {
		this.userCepPassword = userCepPassword;
	}

	public RoleCep getRoleCep() {
		return roleCep;
	}

	public void setRoleCep(RoleCep roleCep) {
		this.roleCep = roleCep;
	}

	public String getUserCepComments() {
		return userCepComments;
	}

	public void setUserCepComments(String userCepComments) {
		this.userCepComments = userCepComments;
	}

	public Timestamp getUserCepInsertionTimestamp() {
		return userCepInsertionTimestamp;
	}

	public void setUserCepInsertionTimestamp(Timestamp userCepInsertionTimestamp) {
		this.userCepInsertionTimestamp = userCepInsertionTimestamp;
	}

	public Timestamp getUserCepModificationTimestamp() {
		return userCepModificationTimestamp;
	}

	public void setUserCepModificationTimestamp(Timestamp userCepModificationTimestamp) {
		this.userCepModificationTimestamp = userCepModificationTimestamp;
	}

	public Timestamp getUserCepDeletionTimestamp() {
		return userCepDeletionTimestamp;
	}

	public void setUserCepDeletionTimestamp(Timestamp userCepDeletionTimestamp) {
		this.userCepDeletionTimestamp = userCepDeletionTimestamp;
	}

	public Boolean getUserCepIsActive() {
		return userCepIsActive;
	}

	public void setUserCepIsActive(Boolean userCepIsActive) {
		this.userCepIsActive = userCepIsActive;
	}

	@Override
	public String toString() {
		return "UserCep [userCep_id=" + userCep_id + ", userCepLastName=" + userCepLastName + ", userCepFirstName="
				+ userCepFirstName + ", userCepEmail=" + userCepEmail + ", userCepLogin=" + userCepLogin
				+ ", userCepPassword=" + userCepPassword + ", roleCep=" + roleCep + ", userCepComments="
				+ userCepComments + ", userCepInsertionTimestamp=" + userCepInsertionTimestamp
				+ ", userCepModificationTimestamp=" + userCepModificationTimestamp + ", userCepDeletionTimestamp="
				+ userCepDeletionTimestamp + ", userCepIsActive=" + userCepIsActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleCep == null) ? 0 : roleCep.hashCode());
		result = prime * result + ((userCepComments == null) ? 0 : userCepComments.hashCode());
		result = prime * result + ((userCepDeletionTimestamp == null) ? 0 : userCepDeletionTimestamp.hashCode());
		result = prime * result + ((userCepEmail == null) ? 0 : userCepEmail.hashCode());
		result = prime * result + ((userCepFirstName == null) ? 0 : userCepFirstName.hashCode());
		result = prime * result + ((userCepInsertionTimestamp == null) ? 0 : userCepInsertionTimestamp.hashCode());
		result = prime * result + ((userCepIsActive == null) ? 0 : userCepIsActive.hashCode());
		result = prime * result + ((userCepLastName == null) ? 0 : userCepLastName.hashCode());
		result = prime * result + ((userCepLogin == null) ? 0 : userCepLogin.hashCode());
		result = prime * result
				+ ((userCepModificationTimestamp == null) ? 0 : userCepModificationTimestamp.hashCode());
		result = prime * result + ((userCepPassword == null) ? 0 : userCepPassword.hashCode());
		result = prime * result + ((userCep_id == null) ? 0 : userCep_id.hashCode());
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
		UserCep other = (UserCep) obj;
		if (roleCep == null) {
			if (other.roleCep != null)
				return false;
		} else if (!roleCep.equals(other.roleCep))
			return false;
		if (userCepComments == null) {
			if (other.userCepComments != null)
				return false;
		} else if (!userCepComments.equals(other.userCepComments))
			return false;
		if (userCepDeletionTimestamp == null) {
			if (other.userCepDeletionTimestamp != null)
				return false;
		} else if (!userCepDeletionTimestamp.equals(other.userCepDeletionTimestamp))
			return false;
		if (userCepEmail == null) {
			if (other.userCepEmail != null)
				return false;
		} else if (!userCepEmail.equals(other.userCepEmail))
			return false;
		if (userCepFirstName == null) {
			if (other.userCepFirstName != null)
				return false;
		} else if (!userCepFirstName.equals(other.userCepFirstName))
			return false;
		if (userCepInsertionTimestamp == null) {
			if (other.userCepInsertionTimestamp != null)
				return false;
		} else if (!userCepInsertionTimestamp.equals(other.userCepInsertionTimestamp))
			return false;
		if (userCepIsActive == null) {
			if (other.userCepIsActive != null)
				return false;
		} else if (!userCepIsActive.equals(other.userCepIsActive))
			return false;
		if (userCepLastName == null) {
			if (other.userCepLastName != null)
				return false;
		} else if (!userCepLastName.equals(other.userCepLastName))
			return false;
		if (userCepLogin == null) {
			if (other.userCepLogin != null)
				return false;
		} else if (!userCepLogin.equals(other.userCepLogin))
			return false;
		if (userCepModificationTimestamp == null) {
			if (other.userCepModificationTimestamp != null)
				return false;
		} else if (!userCepModificationTimestamp.equals(other.userCepModificationTimestamp))
			return false;
		if (userCepPassword == null) {
			if (other.userCepPassword != null)
				return false;
		} else if (!userCepPassword.equals(other.userCepPassword))
			return false;
		if (userCep_id == null) {
			if (other.userCep_id != null)
				return false;
		} else if (!userCep_id.equals(other.userCep_id))
			return false;
		return true;
	}

	public Timestamp timestampManager() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		return timeStamp;
	}

}
