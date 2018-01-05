package ch.mmi.cep.validator;

import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ch.mmi.cep.model.Contact;

public class ContactValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		//just validate the Contact instances
		return Contact.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		/*ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required.password", "Field name is required.");*/	
		Contact contact = (Contact)target;
		if("NONE".equals(contact.getContactCompanyName())){
			errors.rejectValue("companies", "required.companies");
		}
	}
	
}