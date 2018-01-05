package ch.mmi.cep.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.mmi.cep.model.Category;

public class CategoryValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		//just validate the Contact instances
		return Category.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Category category = (Category)target;
		if("NONE".equals(category.getCategoryName())){
			errors.rejectValue("categoryName", "required.categoryName");
		}
	}
}
