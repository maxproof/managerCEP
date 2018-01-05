package ch.mmi.cep.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.mmi.cep.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addCategory(Category category) {
		category.setCategoryIsActive(true);
		category.setCategoryDeletionTimestamp(null);
		category.setCategoryModificationTimestamp(null);
		getCurrentSession().save(category);
	}

	public void updateCategory(Category category) {
		Category categoryToUpdate = getCategory(category.getId_category());
		categoryToUpdate.setCategoryName((category.getCategoryName()));
		categoryToUpdate.setCategoryComments((category.getCategoryComments()));
		categoryToUpdate.setCategoryModificationTimestamp(category.getCategoryModificationTimestamp());
		getCurrentSession().update(categoryToUpdate);
	}

	public Category getCategory(int id_category) {
		Category category = (Category) getCurrentSession().get(Category.class, id_category);
		return category;
	}

	public void deleteCategory(int id_category) {
		Category category = getCategory(id_category);
		if (category != null)
			getCurrentSession().delete(category);
	}
	
	public void deleteCategory(Category category) {
		Category categoryToDelete = getCategory(category.getId_category());
		categoryToDelete.setCategoryDeletionTimestamp(category.getCategoryDeletionTimestamp());
		categoryToDelete.setCategoryIsActive(false);
		getCurrentSession().update(categoryToDelete);
	}

	@SuppressWarnings("unchecked")
	public List<Category> getCategories() {
		return getCurrentSession().createQuery("from Category").list();
	}
}
