package ch.mmi.cep.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.mmi.cep.model.UserCep;

public class UserCepValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		//just validate the Contact instances
		return UserCep.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserCep userCep = (UserCep)target;
		if("NONE".equals(userCep.getUserCepLogin())){
			errors.rejectValue("userCepLogin", "required.userCepLogin");
		}
	}

}
