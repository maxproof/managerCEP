package ch.mmi.cep.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "membersmob")
public class MemberMob implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_memberMob;
	@NotBlank(message="Doit être renseigné!")
	private String memberMobFirstName;
	@NotBlank(message="Doit être renseigné!")
	private String memberMobLastName;
	//@NotBlank(message="Doit être renseigné!")
	@Pattern(regexp="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Format email invalide!")
	private String memberMobEmail;
	@NotBlank(message="Doit être renseigné!")
	@Column(name = "memberMobPassword", length = 100)
	private String memberMobPassword;
	@NotBlank(message="Doit être renseigné!")
	private String memberMobCompany;
	private String memberMobIdentifier = identifierUUIDGenerator();
	private Timestamp dateMemberMobIdentification = timestampManager();
	private Timestamp dateMemberMobModification = timestampManager();
	private Timestamp dateMemberMobDeletion = timestampManager();
	@Column(name = "memberMobComments", length = 500)
	private String memberMobComments;
	private Boolean memberMobIsActive;

	public Integer getId_memberMob() {
		return id_memberMob;
	}

	public void setId_memberMob(Integer id_memberMob) {
		this.id_memberMob = id_memberMob;
	}

	public String getMemberMobFirstName() {
		return memberMobFirstName;
	}

	public void setMemberMobFirstName(String memberMobFirstName) {
		this.memberMobFirstName = memberMobFirstName;
	}

	public String getMemberMobLastName() {
		return memberMobLastName;
	}

	public void setMemberMobLastName(String memberMobLastName) {
		this.memberMobLastName = memberMobLastName;
	}

	public String getMemberMobEmail() {
		return memberMobEmail;
	}

	public void setMemberMobEmail(String memberMobEmail) {
		this.memberMobEmail = memberMobEmail;
	}

	public String getMemberMobPassword() {
		return memberMobPassword;
	}

	public void setMemberMobPassword(String memberMobPassword) {
		this.memberMobPassword = memberMobPassword;
	}

	public Timestamp getDateMemberMobIdentification() {
		return dateMemberMobIdentification;
	}

	public String getMemberMobCompany() {
		return memberMobCompany;
	}

	public void setMemberMobCompany(String memberMobCompany) {
		this.memberMobCompany = memberMobCompany;
	}

	public void setDateMemberMobIdentification(Timestamp dateMemberMobIdentification) {
		this.dateMemberMobIdentification = dateMemberMobIdentification;
	}

	public Timestamp getDateMemberMobModification() {
		return dateMemberMobModification;
	}

	public void setDateMemberMobModification(Timestamp dateMemberMobModification) {
		this.dateMemberMobModification = dateMemberMobModification;
	}

	public Timestamp getDateMemberMobDeletion() {
		return dateMemberMobDeletion;
	}

	public void setDateMemberMobDeletion(Timestamp dateMemberMobDeletion) {
		this.dateMemberMobDeletion = dateMemberMobDeletion;
	}

	public void setMemberMobIsActive(Boolean memberMobIsActive) {
		this.memberMobIsActive = memberMobIsActive;
	}

	public String getMemberMobComments() {
		return memberMobComments;
	}

	public void setMemberMobComments(String memberMobComments) {
		this.memberMobComments = memberMobComments;
	}

	public Boolean getMemberMobIsActive() {
		return memberMobIsActive;
	}

	public void setMembersMobIsActive(Boolean memberMobIsActive) {
		this.memberMobIsActive = memberMobIsActive;
	}

	public String getMemberMobIdentifier() {
		return memberMobIdentifier;
	}

	public void setMemberMobIdentifier(String memberMobIdentifier) {
		this.memberMobIdentifier = memberMobIdentifier;
	}

	@Override
	public String toString() {
		return "MemberMob [id_memberMob=" + id_memberMob + ", memberMobFirstName=" + memberMobFirstName
				+ ", memberMobLastName=" + memberMobLastName + ", memberMobEmail=" + memberMobEmail
				+ ", memberMobPassword=" + memberMobPassword + ", memberMobCompany=" + memberMobCompany
				+ ", memberMobIdentifier=" + memberMobIdentifier + ", dateMemberMobIdentification="
				+ dateMemberMobIdentification + ", dateMemberMobModification=" + dateMemberMobModification
				+ ", dateMemberMobDeletion=" + dateMemberMobDeletion + ", memberMobComments=" + memberMobComments
				+ ", memberMobIsActive=" + memberMobIsActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateMemberMobDeletion == null) ? 0 : dateMemberMobDeletion.hashCode());
		result = prime * result + ((dateMemberMobIdentification == null) ? 0 : dateMemberMobIdentification.hashCode());
		result = prime * result + ((dateMemberMobModification == null) ? 0 : dateMemberMobModification.hashCode());
		result = prime * result + ((id_memberMob == null) ? 0 : id_memberMob.hashCode());
		result = prime * result + ((memberMobComments == null) ? 0 : memberMobComments.hashCode());
		result = prime * result + ((memberMobCompany == null) ? 0 : memberMobCompany.hashCode());
		result = prime * result + ((memberMobEmail == null) ? 0 : memberMobEmail.hashCode());
		result = prime * result + ((memberMobFirstName == null) ? 0 : memberMobFirstName.hashCode());
		result = prime * result + ((memberMobIdentifier == null) ? 0 : memberMobIdentifier.hashCode());
		result = prime * result + ((memberMobIsActive == null) ? 0 : memberMobIsActive.hashCode());
		result = prime * result + ((memberMobLastName == null) ? 0 : memberMobLastName.hashCode());
		result = prime * result + ((memberMobPassword == null) ? 0 : memberMobPassword.hashCode());
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
		MemberMob other = (MemberMob) obj;
		if (dateMemberMobDeletion == null) {
			if (other.dateMemberMobDeletion != null)
				return false;
		} else if (!dateMemberMobDeletion.equals(other.dateMemberMobDeletion))
			return false;
		if (dateMemberMobIdentification == null) {
			if (other.dateMemberMobIdentification != null)
				return false;
		} else if (!dateMemberMobIdentification.equals(other.dateMemberMobIdentification))
			return false;
		if (dateMemberMobModification == null) {
			if (other.dateMemberMobModification != null)
				return false;
		} else if (!dateMemberMobModification.equals(other.dateMemberMobModification))
			return false;
		if (id_memberMob == null) {
			if (other.id_memberMob != null)
				return false;
		} else if (!id_memberMob.equals(other.id_memberMob))
			return false;
		if (memberMobComments == null) {
			if (other.memberMobComments != null)
				return false;
		} else if (!memberMobComments.equals(other.memberMobComments))
			return false;
		if (memberMobCompany == null) {
			if (other.memberMobCompany != null)
				return false;
		} else if (!memberMobCompany.equals(other.memberMobCompany))
			return false;
		if (memberMobEmail == null) {
			if (other.memberMobEmail != null)
				return false;
		} else if (!memberMobEmail.equals(other.memberMobEmail))
			return false;
		if (memberMobFirstName == null) {
			if (other.memberMobFirstName != null)
				return false;
		} else if (!memberMobFirstName.equals(other.memberMobFirstName))
			return false;
		if (memberMobIdentifier == null) {
			if (other.memberMobIdentifier != null)
				return false;
		} else if (!memberMobIdentifier.equals(other.memberMobIdentifier))
			return false;
		if (memberMobIsActive == null) {
			if (other.memberMobIsActive != null)
				return false;
		} else if (!memberMobIsActive.equals(other.memberMobIsActive))
			return false;
		if (memberMobLastName == null) {
			if (other.memberMobLastName != null)
				return false;
		} else if (!memberMobLastName.equals(other.memberMobLastName))
			return false;
		if (memberMobPassword == null) {
			if (other.memberMobPassword != null)
				return false;
		} else if (!memberMobPassword.equals(other.memberMobPassword))
			return false;
		return true;
	}

	public Timestamp timestampManager() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		return timeStamp;
	}
	
	public String identifierUUIDGenerator() {
		// generate random UUID
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		return id;
	}
}
