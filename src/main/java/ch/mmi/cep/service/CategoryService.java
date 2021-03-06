package ch.mmi.cep.service;

import java.util.List;

import ch.mmi.cep.model.Category;

public interface CategoryService {
	
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public Category getCategory(int id_category);
	public void deleteCategory(int id_category);
	public void deleteCategory(Category category);
	public List<Category> getCategories();

}
