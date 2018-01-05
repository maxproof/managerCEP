package ch.mmi.cep.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.mmi.cep.model.UserCep;
import ch.mmi.cep.model.UserProfile;
import ch.mmi.cep.service.UserCepService;
import ch.mmi.cep.service.UserProfileService;

@Controller
@RequestMapping(value = "/usercep")
public class UserCepController {

	@Autowired
	private UserCepService userCepService;

	@Autowired
	private UserProfileService userProfileService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addUserCepPage() {
		ModelAndView modelAndView = new ModelAndView("add-usercep-form");
		modelAndView.addObject("userCep", new UserCep());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addingUserCep(@ModelAttribute("userCep") @Valid UserCep userCep, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-usercep-form");
			modelAndView.addObject("userCep", userCep);
			return "add-usercep-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-userscep");
		userCepService.addUserCep(userCep);
		String message = "Utilisateur enregistré avec succès!";// "User was
															// successfully
															// added // added.";
		List<UserCep> usersCep = userCepService.getUsersCep();
		modelAndView.addObject("usersCep", usersCep);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Utilisateur enregistré avec succès!");
		return "redirect:/usercep/list";
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfUsersCep() {
		ModelAndView modelAndView = new ModelAndView("list-of-userscep");
		List<UserCep> usersCep = userCepService.getUsersCep();
		modelAndView.addObject("usersCep", usersCep);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_userCep}", method = RequestMethod.GET)
	public ModelAndView editUserCepPage(@PathVariable Integer id_userCep) {
		ModelAndView modelAndView = new ModelAndView("edit-usercep-form");
		UserCep userCep = userCepService.getUserCep(id_userCep);
		modelAndView.addObject("userCep", userCep);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_userCep}", method = RequestMethod.POST)
	public String editingUserCep(@ModelAttribute UserCep userCep, @PathVariable Integer id_userCep, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-userscep");
		Integer userCep_id = id_userCep;
		userCep.setUserCep_id(userCep_id);
		userCepService.updateUserCep(userCep);
		String message = "Utilisateur édité avec succès!";// "User was
															// successfully
															// edited.";
		List<UserCep> usersCep = userCepService.getUsersCep();
		modelAndView.addObject("usersCep", usersCep);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Utilisateur édité avec succès!");
		return "redirect:/usercep/list";
	}

	// delete = inactive = insert false
	@RequestMapping(value = "/delete/{id_userCep}", method = RequestMethod.GET)
	public String deleteUserCep(@ModelAttribute UserCep userCep, @PathVariable Integer id_userCep, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-userscep");
		Integer userCep_id = id_userCep;
		userCep.setUserCep_id(userCep_id);
		userCepService.deleteUserCep(userCep);
		String message = "Utilisateur désactivé (supprimé) avec succès!";// "User
																			// was
																			// successfully
																			// edited.";
		List<UserCep> usersCep = userCepService.getUsersCep();
		modelAndView.addObject("usersCep", usersCep);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Utilisateur désactivé (supprimé) avec succès!");
		return "redirect:/usercep/list";
	}

	@RequestMapping(value = "/view/{id_userCep}", method = RequestMethod.GET)
	public ModelAndView viewUserCepPage(@PathVariable Integer id_userCep) {
		ModelAndView modelAndView = new ModelAndView("view-usercep");
		UserCep userCep = userCepService.getUserCep(id_userCep);
		modelAndView.addObject("userCep", userCep);
		return modelAndView;
	}

	@ModelAttribute("userCepRolesList")
	public Map<Integer, String> populateUserCepRolesList() {
		// Data referencing for roles' user list boxes
		Map<Integer, String> userCepRolesList = new LinkedHashMap<Integer, String>();
		userCepRolesList.put(1, "ADMIN");
		userCepRolesList.put(2, "MODERATOR");
		userCepRolesList.put(3, "USER");
		return userCepRolesList;
	}

	@RequestMapping(value = { "/", "/list-of-userscep" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		List<UserCep> usersCep = userCepService.findAllUsers();
		model.addAttribute("usersCep", usersCep);
		return "usersCeplist";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		UserCep userCep = new UserCep();
		model.addAttribute("userCep", userCep);
		model.addAttribute("edit", false);
		return "add-usercep-form";
	}

	@RequestMapping(value = { "/add-usercep-form" }, method = RequestMethod.POST)
	public String saveUser(UserCep userCep, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "add-usercep-form";
		}
		userCepService.saveUser(userCep);
		model.addAttribute("success", "UserCep " + userCep.getUserCepLastName() + " registered successfully");
		return "list-of-userscep";
	}

	// provide UserProfile list to views
	@ModelAttribute("roles")
	public List<UserProfile> initializeProfiles() {
		return userProfileService.findAll();
	}
}