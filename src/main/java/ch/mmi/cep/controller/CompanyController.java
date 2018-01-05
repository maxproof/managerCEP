package ch.mmi.cep.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.mmi.cep.model.Category;
import ch.mmi.cep.model.Company;
import ch.mmi.cep.service.CategoryService;
import ch.mmi.cep.service.CompanyService;
import ch.mmi.cep.util.MimeTypeUtil;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addCompanyPage() {
		ModelAndView modelAndView = new ModelAndView("add-company-form");
		modelAndView.addObject("company", new Company());
		modelAndView.addObject("logoB64", "");
		modelAndView.addObject("companyCategoryNoLogo", true);
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addingCompany(@ModelAttribute("company") @Valid Company company, BindingResult bindingResult,
			@RequestParam("logo") MultipartFile file, @RequestParam("logob64") String logoBase64) throws IOException {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-company-form");
			modelAndView.addObject("company", company);
			String logoB64 = "";
			if (file != null && file.getBytes() != null && file.getBytes().length > 0) {
				logoB64 += "data:";
				logoB64 += MimeTypeUtil.getMimeType(file.getOriginalFilename());
				logoB64 += ";base64," + Base64.getEncoder().encodeToString(file.getBytes());
			} else if (logoBase64 != null && !logoBase64.isEmpty())
				logoB64 = logoBase64;
			modelAndView.addObject("logoB64", logoB64);
			modelAndView.addObject("companyCategoryNoLogo", logoB64.isEmpty());
			return modelAndView;
		}	
		if (file != null && file.getBytes() != null && file.getBytes().length > 0) {
			company.setCompanyLogo(file.getBytes());
			company.setCompanyLogoMimeType(MimeTypeUtil.getMimeType(file.getOriginalFilename()));
		} else if (logoBase64 != null && !logoBase64.isEmpty()) {
			//FIXME shortcut :P
			logoBase64 = logoBase64.substring(5);
			company.setCompanyLogoMimeType(logoBase64.substring(0, logoBase64.indexOf(";")));
			company.setCompanyLogo(Base64.getDecoder().decode(logoBase64.substring(logoBase64.indexOf(";") + 8)));
		}
		companyService.addCompany(company);
		ModelAndView modelAndView = new ModelAndView("list-of-companies");
		modelAndView.addObject("companies", companyService.getCompanies());
		modelAndView.addObject("message", "Entreprise enregistrée avec succès!");
		return modelAndView;
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfCompanies() {
		ModelAndView modelAndView = new ModelAndView("list-of-companies");
		List<Company> companies = companyService.getCompanies();
		modelAndView.addObject("companies", companies);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_company}", method = RequestMethod.GET)
	public ModelAndView editCompanyPage(@PathVariable Integer id_company) {
		ModelAndView modelAndView = new ModelAndView("add-company-form");
		Company company = companyService.getCompany(id_company);
		String logoB64 = "";
		if (company.getCompanyLogo() != null && company.getCompanyLogo().length > 0) {
			logoB64 += "data:";
			logoB64 += company.getCompanyLogoMimeType();
			logoB64 += ";base64," + Base64.getEncoder().encodeToString(company.getCompanyLogo());
		}
		// FIXME Shortcut to circumvent the lack of reference between entities @ManyToOne
		boolean noLogo = !this.populateCompanyCategoriesList().stream().filter(cat -> Integer.parseInt(company.getCompanyCategory()) == cat.getId_category().intValue()).findFirst().get().getCategoryName().equals("Club-Entreprises");
		modelAndView.addObject("company", company);
		modelAndView.addObject("logoB64", logoB64);
		modelAndView.addObject("companyCategoryNoLogo", noLogo);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_company}", method = RequestMethod.POST)
	public ModelAndView editingCompany(@ModelAttribute("company") @Valid Company company, BindingResult bindingResult,
			@RequestParam("logo") MultipartFile file, @RequestParam("logob64") String logoBase64,
			@PathVariable Integer id_company) throws IOException {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-company-form");
			modelAndView.addObject("company", company);		
			String logoB64 = "";
			if (file != null && file.getBytes() != null && file.getBytes().length > 0) {
				logoB64 += "data:";
				logoB64 += MimeTypeUtil.getMimeType(file.getOriginalFilename());
				logoB64 += ";base64," + Base64.getEncoder().encodeToString(file.getBytes());
			} else if (logoBase64 != null && !logoBase64.isEmpty())
				logoB64 = logoBase64;
			modelAndView.addObject("logoB64", logoB64);
			modelAndView.addObject("companyCategoryNoLogo", logoB64.isEmpty());
			return modelAndView;
		}
		if (file != null && file.getBytes() != null && file.getBytes().length > 0) {
			company.setCompanyLogo(file.getBytes());
			company.setCompanyLogoMimeType(MimeTypeUtil.getMimeType(file.getOriginalFilename()));
		} else if (logoBase64 != null && !logoBase64.isEmpty()) {
			//FIXME shortcut :P
			logoBase64 = logoBase64.substring(5);
			company.setCompanyLogoMimeType(logoBase64.substring(0, logoBase64.indexOf(";")));
			company.setCompanyLogo(Base64.getDecoder().decode(logoBase64.substring(logoBase64.indexOf(";") + 8)));
		} else {
			company.setCompanyLogo(null);
			company.setCompanyLogoMimeType(null);
		}	
		companyService.updateCompany(company);
		ModelAndView modelAndView = new ModelAndView("list-of-companies");
		modelAndView.addObject("companies", companyService.getCompanies());
		modelAndView.addObject("message", "Entreprise éditée avec succès!");
		return modelAndView;
	}

	// delete = inactive = insert false
	@RequestMapping(value = "/delete/{id_company}", method = RequestMethod.GET)
	public String deleteCompany(@ModelAttribute Company company, @PathVariable Integer id_company, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-companies");
		companyService.deleteCompany(company);
		String message = "Entreprise supprimée avec succès!";// "Company was
																// successfully
																// edited.";
		List<Company> companies = companyService.getCompanies();
		modelAndView.addObject("companies", companies);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Entreprise supprimée avec succès!");
		return "redirect:/company/list";
	}

	@RequestMapping(value = "/view/{id_company}", method = RequestMethod.GET)
	public ModelAndView viewCompanyPage(@PathVariable Integer id_company) {
		ModelAndView modelAndView = new ModelAndView("view-company");
		Company company = companyService.getCompany(id_company);
		//FIXME shortcut
		boolean noLogo = !this.populateCompanyCategoriesList().stream().filter(cat -> Integer.parseInt(company.getCompanyCategory()) == cat.getId_category().intValue()).findFirst().get().getCategoryName().equals("Club-Entreprises");
		modelAndView.addObject("company", company);
		if (noLogo == false && company.getCompanyLogo() != null) {
			String logoB64 = "data:";
			logoB64 += company.getCompanyLogoMimeType();
			logoB64 += ";base64," + Base64.getEncoder().encodeToString(company.getCompanyLogo());
			modelAndView.addObject("logoB64", logoB64);
		} else {
			modelAndView.addObject("companyCategoryNoLogo", noLogo);
		}
		return modelAndView;
	}

	@ModelAttribute("companyCategoriesList")
	public Collection<Category> populateCompanyCategoriesList() {
		//FIXME no suppressed category & alphabetically sorting
		return categoryService.getCategories().stream().filter(cat -> cat.getCategoryIsActive()).sorted((cat1, cat2) -> cat1.getCategoryName().compareTo(cat2.getCategoryName())).collect(Collectors.toList());
	}
	
	@ModelAttribute("companiesListCategoriesList")
	public Map<Integer, String> populateCompaniesListCategoriesList() {
		// Data referencing for Salutations list box
		ArrayList<Category> categoriesList = (ArrayList<Category>) categoryService.getCategories();
		Map<Integer, String> companyCategoriesList = new LinkedHashMap<Integer, String>();
		for (Category category : categoriesList) {
			companyCategoriesList.put(category.getId_category(), category.getCategoryName());
		}
		return companyCategoriesList;
	}

	@ModelAttribute("companyBooleansList")
	public Map<String, String> populateCompanyBooleansList() {
		// Data referencing for Booleans list boxes
		Map<String, String> companyBooleansList = new LinkedHashMap<String, String>();
		companyBooleansList.put("", "");//("NON", "NON")
		companyBooleansList.put("OUI", "OUI");
		return companyBooleansList;
	}
}
