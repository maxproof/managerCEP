package ch.mmi.cep.controller;

import java.util.List;

import javax.validation.Valid;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.mmi.cep.model.Category;
import ch.mmi.cep.service.CategoryService;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {

	// private Logger logger = Logger.getLogger(CategoryController.class);

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addCategoryPage() {
		ModelAndView modelAndView = new ModelAndView("add-category-form");
		modelAndView.addObject("category", new Category());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addingCategory(@ModelAttribute("category") @Valid Category category,
			BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-category-form");
			modelAndView.addObject("category", category);
			return "add-category-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-categories");
		// logger.info("ADD Category : " + category);
		categoryService.addCategory(category);
		// logger.info("ADDED Category : " + category);
		String message = "Catégorie enregistrée avec succès!";// "Category was
															// successfully
															// added.";
		List<Category> categories = categoryService.getCategories();
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Catégorie enregistrée avec succès!");
		return "redirect:/category/list";
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfCategories() {
		ModelAndView modelAndView = new ModelAndView("list-of-categories");
		List<Category> categories = categoryService.getCategories();
		modelAndView.addObject("categories", categories);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_category}", method = RequestMethod.GET)
	public ModelAndView editCategoryPage(@PathVariable Integer id_category) {
		ModelAndView modelAndView = new ModelAndView("edit-category-form");
		Category category = categoryService.getCategory(id_category);
		modelAndView.addObject("category", category);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_category}", method = RequestMethod.POST)
	public String editingCategory(@ModelAttribute("category") @Valid Category category,
			BindingResult bindingResult, @PathVariable Integer id_category, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("edit-category-form");
			modelAndView.addObject("category", category);
			return "edit-category-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-categories");
		// logger.info("EDIT Category : " + category);
		categoryService.updateCategory(category);
		// logger.info("EDITED Category : " + category);
		String message = "Catégorie éditée avec succès!";// "Category was
															// successfully
															// edited.";
		List<Category> categories = categoryService.getCategories();
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Catégorie éditée avec succès!");
		return "redirect:/category/list";
	}

	// complete delete
	@RequestMapping(value = "/delete/{id_category}", method = RequestMethod.GET)
	public String deleteCategory(@PathVariable Integer id_category, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-categories");
		// logger.info("DELETE Category with ID=" + id_category);
		categoryService.deleteCategory(id_category);
		// logger.info("DELETED Category with ID=" + id_category);
		String message = "Catégorie supprimée avec succès!";// "Category was
															// successfully
															// deleted.";
		List<Category> categories = categoryService.getCategories();
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Catégorie supprimée avec succès!");
		return "redirect:/category/list";
	}

	@RequestMapping(value = "/view/{id_category}", method = RequestMethod.GET)
	public ModelAndView viewCategoryPage(@PathVariable Integer id_category) {
		ModelAndView modelAndView = new ModelAndView("view-category");
		// logger.info("VIEW Category with ID=" + id_category);
		Category category = categoryService.getCategory(id_category);
		// logger.info("VIEWED Category with ID=" + id_category);
		modelAndView.addObject("category", category);
		return modelAndView;
	}
}
