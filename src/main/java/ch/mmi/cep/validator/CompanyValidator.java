package ch.mmi.cep.validator;

import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ch.mmi.cep.model.Company;

public class CompanyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		//just validate the Company instances
		return Company.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		/*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required.password", "Field name is required.");*/	
		Company company = (Company)target;
		/*if(!(company.getPassword().equals(company.getConfirmPassword()))){
			errors.rejectValue("password", "notmatch.password");
		}*/
		if("NONE".equals(company.getCompanyCategory())){
			errors.rejectValue("companyCategory", "required.companyCategory");
		}	
	}
	
}

