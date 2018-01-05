package ch.mmi.cep.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

//import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "contacts")
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_contact;
	@NotBlank(message="Doit être renseigné!")
	private String contactLastName;
	@NotBlank(message="Doit être renseigné!")
	private String contactFirstName;
	private Timestamp contactInsertionTimestamp = timestampManager();
	private Timestamp contactModificationTimestamp = timestampManager();
	private Timestamp contactDeletionTimestamp = timestampManager();
	@NotBlank(message="Doit être renseigné!")
	private String contactStreet;
	//@NotBlank(message="Doit être renseigné!")
	@Length(max=4,min=4,message="CP invalide! Doit comporter 4 chiffres.")
	private String contactPostCode;
	@NotBlank(message="Doit être renseigné!")
	private String contactCity;
	//@NotBlank
	@Length(max=10,min=10,message="Téléphone invalide! Doit comporter 10 chiffres.")
	private String contactPhoneNumber;
	private String contactMobileNumber;
	//@NotBlank(message="Doit être renseigné!")
	//@Email(message="Format email invalide!")
	@Pattern(regexp="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Format email invalide!")
	private String contactEmail;
	private String contactEmail2;
	private String contactPassword;
	private String contactNewPassword;
	private String billing;
	private String comments;
	@NotBlank(message="Choisissez une politesse!")
	private String salutations;
	private String sendMagazine;
	private String sendInvitation;
	private String sendClubInvitation;
	private String microtechnics;
	private String magazinePublication;
	private String executiveBoard;
	private String strategyBoard;
	private String servicesBoard;
	private String trainingBoard;
	private String coachingBoard;
	private String industryBoard;
	private String facilitiesBoard;
	private String clubCompaniesBoard;
	private Boolean contactIsActive;

	@Transient
	private Integer company_id;
	
	@Transient
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@NotEmpty(message="Choisissez une entreprise!")
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "companies_contacts", joinColumns = { @JoinColumn(name = "id_contact") }, inverseJoinColumns = {
			@JoinColumn(name = "id_company") })
	private Set<Company> companies = new HashSet<Company>();

	public String getContactCompanyName() {
		return companies.size() > 0 ? companies.iterator().next().getCompanyName() : null;
	}

	public Integer getCompany_id() {
		if (company_id == null) {
			return companies.size() > 0 ? companies.iterator().next().getId_company() : null;
		} else {
			return company_id;
		}
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getId_contact() {
		return id_contact;
	}

	public void setId_contact(Integer id_contact) {
		this.id_contact = id_contact;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public Timestamp getContactInsertionTimestamp() {
		return contactInsertionTimestamp;
	}

	public void setContactInsertionTimestamp(Timestamp contactInsertionTimestamp) {
		this.contactInsertionTimestamp = contactInsertionTimestamp;
	}

	public Timestamp getContactModificationTimestamp() {
		return contactModificationTimestamp;
	}

	public void setContactModificationTimestamp(Timestamp contactModificationTimestamp) {
		this.contactModificationTimestamp = contactModificationTimestamp;
	}

	public String getContactStreet() {
		return contactStreet;
	}

	public void setContactStreet(String contactStreet) {
		this.contactStreet = contactStreet;
	}

	public String getContactPostCode() {
		return contactPostCode;
	}

	public void setContactPostCode(String contactPostCode) {
		this.contactPostCode = contactPostCode;
	}

	public String getContactCity() {
		return contactCity;
	}

	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSalutations() {
		return salutations;
	}

	public void setSalutations(String salutations) {
		this.salutations = salutations;
	}

	public String getSendMagazine() {
		return sendMagazine;
	}

	public void setSendMagazine(String sendMagazine) {
		this.sendMagazine = sendMagazine;
	}

	public String getSendInvitation() {
		return sendInvitation;
	}

	public void setSendInvitation(String sendInvitation) {
		this.sendInvitation = sendInvitation;
	}

	public String getSendClubInvitation() {
		return sendClubInvitation;
	}

	public void setSendClubInvitation(String sendClubInvitation) {
		this.sendClubInvitation = sendClubInvitation;
	}

	public String getMicrotechnics() {
		return microtechnics;
	}

	public void setMicrotechnics(String microtechnics) {
		this.microtechnics = microtechnics;
	}

	public String getMagazinePublication() {
		return magazinePublication;
	}

	public void setMagazinePublication(String magazinePublication) {
		this.magazinePublication = magazinePublication;
	}

	public String getExecutiveBoard() {
		return executiveBoard;
	}

	public void setExecutiveBoard(String executiveBoard) {
		this.executiveBoard = executiveBoard;
	}

	public String getStrategyBoard() {
		return strategyBoard;
	}

	public void setStrategyBoard(String strategyBoard) {
		this.strategyBoard = strategyBoard;
	}

	public String getServicesBoard() {
		return servicesBoard;
	}

	public void setServicesBoard(String servicesBoard) {
		this.servicesBoard = servicesBoard;
	}

	public String getTrainingBoard() {
		return trainingBoard;
	}

	public void setTrainingBoard(String trainingBoard) {
		this.trainingBoard = trainingBoard;
	}

	public String getCoachingBoard() {
		return coachingBoard;
	}

	public void setCoachingBoard(String coachingBoard) {
		this.coachingBoard = coachingBoard;
	}

	public String getIndustryBoard() {
		return industryBoard;
	}

	public void setIndustryBoard(String industryBoard) {
		this.industryBoard = industryBoard;
	}

	public String getFacilitiesBoard() {
		return facilitiesBoard;
	}

	public void setFacilitiesBoard(String facilitiesBoard) {
		this.facilitiesBoard = facilitiesBoard;
	}

	public String getClubCompaniesBoard() {
		return clubCompaniesBoard;
	}

	public void setClubCompaniesBoard(String clubCompaniesBoard) {
		this.clubCompaniesBoard = clubCompaniesBoard;
	}

	public Timestamp getContactDeletionTimestamp() {
		return contactDeletionTimestamp;
	}

	public void setContactDeletionTimestamp(Timestamp contactDeletionTimestamp) {
		this.contactDeletionTimestamp = contactDeletionTimestamp;
	}

	public String getContactMobileNumber() {
		return contactMobileNumber;
	}

	public void setContactMobileNumber(String contactMobileNumber) {
		this.contactMobileNumber = contactMobileNumber;
	}

	public String getContactEmail2() {
		return contactEmail2;
	}

	public void setContactEmail2(String contactEmail2) {
		this.contactEmail2 = contactEmail2;
	}

	public String getContactPassword() {
		return contactPassword;
	}

	public void setContactPassword(String contactPassword) {
		this.contactPassword = contactPassword;
	}

	public String getContactNewPassword() {
		return contactNewPassword;
	}

	public void setContactNewPassword(String contactNewPassword) {
		this.contactNewPassword = contactNewPassword;
	}

	public Boolean getContactIsActive() {
		return contactIsActive;
	}

	public void setContactIsActive(Boolean contactIsActive) {
		this.contactIsActive = contactIsActive;
	}

	public Set<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

	/*@Override
	public String toString() {
		return "Contact [id_contact = " + id_contact + ", Contact Last Name = " + contactLastName + "]";
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_contact == null) ? 0 : id_contact.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Contact [id_contact=" + id_contact + ", contactLastName=" + contactLastName + ", contactFirstName="
				+ contactFirstName + ", contactStreet=" + contactStreet + ", contactPostCode=" + contactPostCode
				+ ", contactCity=" + contactCity + ", contactPhoneNumber=" + contactPhoneNumber
				+ ", contactMobileNumber=" + contactMobileNumber + ", contactEmail=" + contactEmail + ", contactEmail2="
				+ contactEmail2 + ", contactPassword=" + contactPassword + ", contactNewPassword=" + contactNewPassword
				+ ", company_id=" + company_id + ", companyName=" + companyName + ", companies=" + companies + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Contact))
			return false;
		Contact other = (Contact) obj;
		if (id_contact == null) {
			if (other.id_contact != null)
				return false;
		} else if (!id_contact.equals(other.id_contact))
			return false;
		return true;
	}

	public Timestamp timestampManager() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		return timeStamp;
	}
}
