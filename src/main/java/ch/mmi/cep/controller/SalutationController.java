package ch.mmi.cep.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ch.mmi.cep.model.Salutation;
import ch.mmi.cep.service.SalutationService;

@Controller
@RequestMapping(value = "/salutation")
public class SalutationController {

	@Autowired
	private SalutationService salutationService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addSalutationPage() {
		ModelAndView modelAndView = new ModelAndView("add-salutation-form");
		modelAndView.addObject("salutation", new Salutation());
		return modelAndView;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addingSalutation(@ModelAttribute("salutation") @Valid Salutation salutation,
			BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-salutation-form");
			modelAndView.addObject("salutation", salutation);
			return "add-salutation-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-salutations");
		salutationService.addSalutation(salutation);
		String message = "Formule de politesse enregistrée avec succès!";// "Salutation
																		// was
																		// successfully
																		// added.";
		List<Salutation> salutations = salutationService.getSalutations();
		modelAndView.addObject("salutations", salutations);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Formule de politesse enregistrée avec succès!");
		return "redirect:/salutation/list";
	}

	@RequestMapping(value = "/list")
	public ModelAndView listOfSalutations() {
		ModelAndView modelAndView = new ModelAndView("list-of-salutations");
		List<Salutation> salutations = salutationService.getSalutations();
		modelAndView.addObject("salutations", salutations);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_salutation}", method = RequestMethod.GET)
	public ModelAndView editSalutationPage(@PathVariable Integer id_salutation) {
		ModelAndView modelAndView = new ModelAndView("edit-salutation-form");
		Salutation salutation = salutationService.getSalutation(id_salutation);
		modelAndView.addObject("salutation", salutation);
		return modelAndView;
	}

	@RequestMapping(value = "/edit/{id_salutation}", method = RequestMethod.POST)
	public String editingSalutation(@ModelAttribute("salutation") @Valid Salutation salutation,
			BindingResult bindingResult, @PathVariable Integer id_salutation, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("edit-salutation-form");
			modelAndView.addObject("salutation", salutation);
			return "edit-salutation-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-salutations");
		salutationService.updateSalutation(salutation);
		String message = "Formule de politesse éditée avec succès!";// "Salutation
																	// was
																	// successfully
																	// edited.";
		List<Salutation> salutations = salutationService.getSalutations();
		modelAndView.addObject("salutations", salutations);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Formule de politesse éditée avec succès!");
		return "redirect:/salutation/list";
	}

	// complete delete
	@RequestMapping(value = "/delete/{id_salutation}", method = RequestMethod.GET)
	public String deleteSalutation(@PathVariable Integer id_salutation, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-salutations");
		salutationService.deleteSalutation(id_salutation);
		String message = "Formule de politesse supprimée avec succès!";// "Salutation
																		// was
																		// successfully
																		// deleted.";
		List<Salutation> salutations = salutationService.getSalutations();
		modelAndView.addObject("salutations", salutations);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Formule de politesse supprimée avec succès!");
		return "redirect:/salutation/list";
	}

	@RequestMapping(value = "/view/{id_salutation}", method = RequestMethod.GET)
	public ModelAndView viewSalutationPage(@PathVariable Integer id_salutation) {
		ModelAndView modelAndView = new ModelAndView("view-salutation");
		Salutation salutation = salutationService.getSalutation(id_salutation);
		modelAndView.addObject("salutation", salutation);
		return modelAndView;
	}
}
