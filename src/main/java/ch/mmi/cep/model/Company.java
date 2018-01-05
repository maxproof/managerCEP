package ch.mmi.cep.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

//import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "companies")
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_company;
	@NotBlank(message="Choisissez une catégorie!")
	private String companyCategory;
	@NotBlank(message="Doit être renseigné!")
	private String companyName;
	@NotBlank(message="Doit être renseigné!")
	private String companyStreet;
	//@NotBlank(message="Doit être renseigné!")
	@Length(max=4,min=4,message="CP invalide! Doit comporter 4 chiffres.")
	private String companyPostCode;
	@NotBlank(message="Doit être renseigné!")
	private String companyCity;
	//@NotBlank(message="Doit être renseigné!")
	@Length(max=10,min=10,message="Téléphone invalide! Doit comporter 10 chiffres.")
	private String companyPhoneNumber;
	private String companyMobileNumber;
	//@NotBlank(message="Doit être renseigné!")
	//@Email(message="Format email invalide!")
	@Pattern(regexp="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message="Format email invalide!")
	private String companyEmail;
	private String companyEmail2;
	private String companyComments;
	private String companyWebsite;
	private Timestamp companyInsertionTimestamp = timestampManager();
	private Timestamp companyModificationTimestamp = timestampManager();
	private Timestamp companyDeletionTimestamp = timestampManager();
	private byte[] companyLogo;
	private String companyLogoMimeType;
	private Boolean companyIsActive;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "companies", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Set<Contact> contacts = new HashSet<Contact>();
	
	public Integer getId_company() {
		return id_company;
	}

	public void setId_company(Integer id_company) {
		this.id_company = id_company;
	}

	public String getCompanyCategory() {
		return companyCategory;
	}

	public void setCompanyCategory(String companyCategory) {
		this.companyCategory = companyCategory;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyStreet() {
		return companyStreet;
	}

	public void setCompanyStreet(String companyStreet) {
		this.companyStreet = companyStreet;
	}

	public String getCompanyPostCode() {
		return companyPostCode;
	}

	public void setCompanyPostCode(String companyPostCode) {
		this.companyPostCode = companyPostCode;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyComments() {
		return companyComments;
	}

	public void setCompanyComments(String companyComments) {
		this.companyComments = companyComments;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public Timestamp getCompanyInsertionTimestamp() {
		return companyInsertionTimestamp;
	}

	public void setCompanyInsertionTimestamp(Timestamp companyInsertionTimestamp) {
		this.companyInsertionTimestamp = companyInsertionTimestamp;
	}

	public Timestamp getCompanyModificationTimestamp() {
		return companyModificationTimestamp;
	}

	public void setCompanyModificationTimestamp(Timestamp companyModificationTimestamp) {
		this.companyModificationTimestamp = companyModificationTimestamp;
	}

	public String getCompanyMobileNumber() {
		return companyMobileNumber;
	}

	public void setCompanyMobileNumber(String companyMobileNumber) {
		this.companyMobileNumber = companyMobileNumber;
	}

	public String getCompanyEmail2() {
		return companyEmail2;
	}

	public void setCompanyEmail2(String companyEmail2) {
		this.companyEmail2 = companyEmail2;
	}

	public Timestamp getCompanyDeletionTimestamp() {
		return companyDeletionTimestamp;
	}

	public void setCompanyDeletionTimestamp(Timestamp companyDeletionTimestamp) {
		this.companyDeletionTimestamp = companyDeletionTimestamp;
	}
	
	public byte[] getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(byte[] companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getCompanyLogoMimeType() {
		return companyLogoMimeType;
	}

	public void setCompanyLogoMimeType(String companyLogoMimeType) {
		this.companyLogoMimeType = companyLogoMimeType;
	}

	public Boolean getCompanyIsActive() {
		return companyIsActive;
	}

	public void setCompanyIsActive(Boolean companyIsActive) {
		this.companyIsActive = companyIsActive;
	}
	
	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public String toString() {
		return "Company [id_company = " + id_company + ", Company Name = " + companyName + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_company == null) ? 0 : id_company.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Company))
			return false;
		Company other = (Company)obj;
		if (id_company == null) {
			if (other.id_company != null)
				return false;
		} else if (!id_company.equals(other.id_company))
			return false;
		return true;
	}

	public Timestamp timestampManager() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		return timeStamp;
	}
}
