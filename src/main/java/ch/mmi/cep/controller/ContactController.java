package ch.mmi.cep.controller;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.mmi.cep.model.Category;
import ch.mmi.cep.model.Company;
import ch.mmi.cep.model.Contact;
import ch.mmi.cep.model.Salutation;
import ch.mmi.cep.service.CategoryService;
import ch.mmi.cep.service.CompanyService;
import ch.mmi.cep.service.ContactService;
import ch.mmi.cep.service.SalutationService;

@Controller
@RequestMapping(value = "/contact")
@SessionAttributes("companies")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@Autowired
	private SalutationService salutationService;

	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private CategoryService categoryService;


	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addContactPage() {
		ModelAndView modelAndView = new ModelAndView("add-contact-form");
		modelAndView.addObject("contact", new Contact());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addingContact(@ModelAttribute("contact") @Valid Contact contact, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			// Company company =
			// contact.getCompanies().stream().skip(contact.getCompanies().size()-1).findFirst().get();
			return "add-contact-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-contacts");
		contactService.addContact(contact);
		String message = "Contact enregistré avec succès!";// "Contact was
														// successfully added.";
		List<Contact> contacts = contactService.getContacts();
		modelAndView.addObject("contacts", contacts);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Contact enregistré avec succès!");
		return "redirect:/contact/list";
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfContacts() {
		ModelAndView modelAndView = new ModelAndView("list-of-contacts");
		List<Contact> contacts = contactService.getContacts();
		modelAndView.addObject("contacts", contacts);
		return modelAndView;
	}
	
	@RequestMapping(value = "/edit/{id_contact}", method = RequestMethod.GET)
	public ModelAndView editContactPage(@PathVariable Integer id_contact) {
		ModelAndView modelAndView = new ModelAndView("add-contact-form");
		Contact contact = contactService.getContact(id_contact);
		modelAndView.addObject("contact", contact);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_contact}", method = RequestMethod.POST)
	public String editingContact(@ModelAttribute("contact") @Valid Contact contact, BindingResult bindingResult,
			@PathVariable Integer id_contact, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-contact-form");
			modelAndView.addObject("contact", contact);
			return "edit-contact-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-contacts");
		contactService.updateContact(contact);
		String message = "Contact édité avec succès!";// "Contact was
														// successfully
														// edited.";
		List<Contact> contacts = contactService.getContacts();
		modelAndView.addObject("contacts", contacts);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Contact édité avec succès!");
		return "redirect:/contact/list";
	}

	// delete = inactive = insert false
	@RequestMapping(value = "/delete/{id_contact}", method = RequestMethod.GET)
	public String deleteContact(@ModelAttribute Contact contact, @PathVariable Integer id_contact, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-contacts");
		// contactService.deleteContactById(id_contact);//complete deletion
		contactService.deleteContact(contact);// set FALSE without deletion
		String message = "Contact supprimé avec succès!";// "Contact was
															// successfully
															// deleted.";
		List<Contact> contacts = contactService.getContacts();
		modelAndView.addObject("contacts", contacts);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Contact supprimé avec succès!");
		return "redirect:/contact/list";
	}

	@RequestMapping(value = "/view/{id_contact}", method = RequestMethod.GET)
	public ModelAndView viewContactPage(@PathVariable Integer id_contact) {
		ModelAndView modelAndView = new ModelAndView("view-contact");
		Contact contact = contactService.getContact(id_contact);
		Salutation salutation = new Salutation();
		modelAndView.addObject("salutationName", salutation.getSalutationName());
		modelAndView.addObject("contact", contact);
		return modelAndView;
	}

	@ModelAttribute("contactSalutationsList")
	public Map<Integer, String> populateContactSalutationsList() {
		// Data referencing for Salutations list box
		ArrayList<Salutation> salutationsList = (ArrayList<Salutation>) salutationService.getSalutations();
		Map<Integer, String> contactSalutationsList = new LinkedHashMap<Integer, String>();
		for (Salutation salutation : salutationsList) {
			contactSalutationsList.put(salutation.getId_salutation(), salutation.getSalutationName());
		}
		return contactSalutationsList;
	}

	@ModelAttribute("contactBooleansList")
	public Map<String, String> populateContactBooleansList() {
		// Data referencing for Booleans list boxes
		Map<String, String> contactBooleansList = new LinkedHashMap<String, String>();
		contactBooleansList.put("", "");//("NON", "NON")
		contactBooleansList.put("OUI", "OUI");
		return contactBooleansList;
	}

	@ModelAttribute("companies4ContactsList")
	public Collection<Company> populateCompanies4ContactsList() {
		// Data referencing for Companies list box
		//FIXME sorting by name
		return companyService.getCompanies().stream().filter(comp -> comp.getCompanyIsActive()).sorted((comp1, comp2) -> comp1.getCompanyName().compareTo(comp2.getCompanyName())).collect(Collectors.toList());
	}
	
	@ModelAttribute("categories4ContactsList")
	public Map<String, String> populateCompany4ContactList() {
		ArrayList<Category> categoriesList = (ArrayList<Category>) categoryService.getCategories();
		List<Contact> contacts = contactService.getContacts();
		Map<String, String> categories4ContactsList = new LinkedHashMap<String, String>();
		if (!contacts.isEmpty()) {
			for (Contact transactionContact : contacts) {
				Company companySelected = transactionContact.getCompanies().stream()
						.skip(transactionContact.getCompanies().size() - 1).findFirst().get();
				String companySelectedName = companySelected.getCompanyName();
				Integer categoryID = Integer.parseInt(companySelected.getCompanyCategory());
				String categoryName = categoriesList.stream().filter(p -> p.getId_category().equals(categoryID))
						.collect(Collectors.toList()).iterator().next().getCategoryName();
				categories4ContactsList.put(companySelectedName, categoryName);
			}
		}
		return categories4ContactsList;
	}

	@RequestMapping(value = { "/", "/list-of-contacts" }, method = RequestMethod.GET)
	public String listContacts(ModelMap model) {
		List<Contact> contacts = contactService.findAllContacts();
		model.addAttribute("contacts", contacts);
		return "userslist";
	}

	@RequestMapping(value = { "/newcontact" }, method = RequestMethod.GET)
	public String newContact(ModelMap model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		model.addAttribute("edit", false);
		return "add-contact-form";
	}

	@RequestMapping(value = { "/add-contact-form" }, method = RequestMethod.POST)
	public String saveUser(Contact contact, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "add-contact-form";
		}
		contactService.saveContact(contact);
		model.addAttribute("success", "Contact " + contact.getContactLastName() + " registered successfully");
		return "list-of-contacts";
	}

	@ModelAttribute("companies")
	public List<Company> initializeCompanies() {
		return companyService.findAll();
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
