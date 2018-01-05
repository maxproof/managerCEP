package ch.mmi.cep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.mmi.cep.dao.CategoryDAO;
import ch.mmi.cep.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDAO categoryDAO;

	public void addCategory(Category category) {
		categoryDAO.addCategory(category);		
	}

	public void updateCategory(Category category) {
		categoryDAO.updateCategory(category);
	}

	public Category getCategory(int id_category) {
		return categoryDAO.getCategory(id_category);
	}

	public void deleteCategory(int id_category) {
		categoryDAO.deleteCategory(id_category);
	}
	
	public void deleteCategory(Category category) {
		categoryDAO.deleteCategory(category);
	}
	
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}
}
