package ch.mmi.cep.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "salutations")
public class Salutation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_salutation;
	@NotBlank(message = "Renseigner ce champ!")
	private String salutationName;
	private String salutationComments;
	private Timestamp salutationInsertionTimestamp = timestampManager();
	private Timestamp salutationModificationTimestamp = timestampManager();
	private Timestamp salutationDeletionTimestamp = timestampManager();
	private Boolean salutationIsActive;

	public Integer getId_salutation() {
		return id_salutation;
	}

	public void setId_salutation(Integer id_salutation) {
		this.id_salutation = id_salutation;
	}

	public String getSalutationName() {
		return salutationName;
	}

	public void setSalutationName(String salutationName) {
		this.salutationName = salutationName;
	}

	public String getSalutationComments() {
		return salutationComments;
	}

	public void setSalutationComments(String salutationComments) {
		this.salutationComments = salutationComments;
	}

	public Timestamp getSalutationInsertionTimestamp() {
		return salutationInsertionTimestamp;
	}

	public void setSalutationInsertionTimestamp(Timestamp salutationInsertionTimestamp) {
		this.salutationInsertionTimestamp = salutationInsertionTimestamp;
	}

	public Timestamp getSalutationModificationTimestamp() {
		return salutationModificationTimestamp;
	}

	public void setSalutationModificationTimestamp(Timestamp salutationModificationTimestamp) {
		this.salutationModificationTimestamp = salutationModificationTimestamp;
	}

	public Timestamp getSalutationDeletionTimestamp() {
		return salutationDeletionTimestamp;
	}

	public void setSalutationDeletionTimestamp(Timestamp salutationDeletionTimestamp) {
		this.salutationDeletionTimestamp = salutationDeletionTimestamp;
	}

	public Boolean getSalutationIsActive() {
		return salutationIsActive;
	}

	public void setSalutationIsActive(Boolean salutationIsActive) {
		this.salutationIsActive = salutationIsActive;
	}

	@Override
	public String toString() {
		return "Salutation [id_salutation=" + id_salutation + ", salutationName=" + salutationName
				+ ", salutationComments=" + salutationComments + ", salutationInsertionTimestamp="
				+ salutationInsertionTimestamp + ", salutationModificationTimestamp=" + salutationModificationTimestamp
				+ ", salutationDeletionTimestamp=" + salutationDeletionTimestamp + ", salutationIsActive="
				+ salutationIsActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_salutation == null) ? 0 : id_salutation.hashCode());
		result = prime * result + ((salutationComments == null) ? 0 : salutationComments.hashCode());
		result = prime * result + ((salutationDeletionTimestamp == null) ? 0 : salutationDeletionTimestamp.hashCode());
		result = prime * result
				+ ((salutationInsertionTimestamp == null) ? 0 : salutationInsertionTimestamp.hashCode());
		result = prime * result + ((salutationIsActive == null) ? 0 : salutationIsActive.hashCode());
		result = prime * result
				+ ((salutationModificationTimestamp == null) ? 0 : salutationModificationTimestamp.hashCode());
		result = prime * result + ((salutationName == null) ? 0 : salutationName.hashCode());
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
		Salutation other = (Salutation) obj;
		if (id_salutation == null) {
			if (other.id_salutation != null)
				return false;
		} else if (!id_salutation.equals(other.id_salutation))
			return false;
		if (salutationComments == null) {
			if (other.salutationComments != null)
				return false;
		} else if (!salutationComments.equals(other.salutationComments))
			return false;
		if (salutationDeletionTimestamp == null) {
			if (other.salutationDeletionTimestamp != null)
				return false;
		} else if (!salutationDeletionTimestamp.equals(other.salutationDeletionTimestamp))
			return false;
		if (salutationInsertionTimestamp == null) {
			if (other.salutationInsertionTimestamp != null)
				return false;
		} else if (!salutationInsertionTimestamp.equals(other.salutationInsertionTimestamp))
			return false;
		if (salutationIsActive == null) {
			if (other.salutationIsActive != null)
				return false;
		} else if (!salutationIsActive.equals(other.salutationIsActive))
			return false;
		if (salutationModificationTimestamp == null) {
			if (other.salutationModificationTimestamp != null)
				return false;
		} else if (!salutationModificationTimestamp.equals(other.salutationModificationTimestamp))
			return false;
		if (salutationName == null) {
			if (other.salutationName != null)
				return false;
		} else if (!salutationName.equals(other.salutationName))
			return false;
		return true;
	}

	public Timestamp timestampManager() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		return timeStamp;
	}
}
