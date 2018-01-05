package ch.mmi.cep.converter;

import java.beans.PropertyEditorSupport;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import ch.mmi.cep.model.Company;
import ch.mmi.cep.service.CompanyService;

@Component
public class CompanyToContactConverter implements Converter<Object, Company> {

	@Autowired
	CompanyService companyService;

	public Company convert(Object element) {
		Integer id_company = Integer.parseInt((String) element);
		Company company = companyService.findById(id_company);
		System.out.println("Company : " + company);
		return company;
	}

	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Company.class, "companies", new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				Company company = companyService.findById(Integer.parseInt(text));
				setValue(company);
			}
		});
	}

}