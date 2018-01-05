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
@Table(name="categories")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_category;
	@NotBlank(message="Doit être renseigné.")
	private String categoryName;
	private String categoryComments;
	private Timestamp categoryInsertionTimestamp = timestampManager();
	private Timestamp categoryModificationTimestamp = timestampManager();	
	private Timestamp categoryDeletionTimestamp = timestampManager();
	private Boolean categoryIsActive;
	
	public Integer getId_category() {
		return id_category;
	}
	
	public void setId_category(Integer id_category) {
		this.id_category = id_category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryComments() {
		return categoryComments;
	}

	public void setCategoryComments(String categoryComments) {
		this.categoryComments = categoryComments;
	}

	public Timestamp getCategoryInsertionTimestamp() {
		return categoryInsertionTimestamp;
	}

	public void setCategoryInsertionTimestamp(Timestamp categoryInsertionTimestamp) {
		this.categoryInsertionTimestamp = categoryInsertionTimestamp;
	}

	public Timestamp getCategoryModificationTimestamp() {
		return categoryModificationTimestamp;
	}

	public void setCategoryModificationTimestamp(Timestamp categoryModificationTimestamp) {
		this.categoryModificationTimestamp = categoryModificationTimestamp;
	}

	public Timestamp getCategoryDeletionTimestamp() {
		return categoryDeletionTimestamp;
	}

	public void setCategoryDeletionTimestamp(Timestamp categoryDeletionTimestamp) {
		this.categoryDeletionTimestamp = categoryDeletionTimestamp;
	}

	public Boolean getCategoryIsActive() {
		return categoryIsActive;
	}

	public void setCategoryIsActive(Boolean categoryIsActive) {
		this.categoryIsActive = categoryIsActive;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", categoryName=" + categoryName + ", categoryComments="
				+ categoryComments + ", categoryInsertionTimestamp=" + categoryInsertionTimestamp
				+ ", categoryModificationTimestamp=" + categoryModificationTimestamp + ", categoryDeletionTimestamp="
				+ categoryDeletionTimestamp + ", categoryIsActive=" + categoryIsActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryComments == null) ? 0 : categoryComments.hashCode());
		result = prime * result + ((categoryDeletionTimestamp == null) ? 0 : categoryDeletionTimestamp.hashCode());
		result = prime * result + ((categoryInsertionTimestamp == null) ? 0 : categoryInsertionTimestamp.hashCode());
		result = prime * result + ((categoryIsActive == null) ? 0 : categoryIsActive.hashCode());
		result = prime * result
				+ ((categoryModificationTimestamp == null) ? 0 : categoryModificationTimestamp.hashCode());
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((id_category == null) ? 0 : id_category.hashCode());
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
		Category other = (Category) obj;
		if (categoryComments == null) {
			if (other.categoryComments != null)
				return false;
		} else if (!categoryComments.equals(other.categoryComments))
			return false;
		if (categoryDeletionTimestamp == null) {
			if (other.categoryDeletionTimestamp != null)
				return false;
		} else if (!categoryDeletionTimestamp.equals(other.categoryDeletionTimestamp))
			return false;
		if (categoryInsertionTimestamp == null) {
			if (other.categoryInsertionTimestamp != null)
				return false;
		} else if (!categoryInsertionTimestamp.equals(other.categoryInsertionTimestamp))
			return false;
		if (categoryIsActive == null) {
			if (other.categoryIsActive != null)
				return false;
		} else if (!categoryIsActive.equals(other.categoryIsActive))
			return false;
		if (categoryModificationTimestamp == null) {
			if (other.categoryModificationTimestamp != null)
				return false;
		} else if (!categoryModificationTimestamp.equals(other.categoryModificationTimestamp))
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (id_category == null) {
			if (other.id_category != null)
				return false;
		} else if (!id_category.equals(other.id_category))
			return false;
		return true;
	}

	public Timestamp timestampManager() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		return timeStamp;
	}
}
