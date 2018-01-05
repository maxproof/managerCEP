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

import ch.mmi.cep.model.MemberMob;
import ch.mmi.cep.service.MemberMobService;


@Controller
@RequestMapping(value="/membermob")
public class MemberMobController {
	
	//private Logger logger = Logger.getLogger(MemberMobController.class);

	@Autowired
	private MemberMobService memberMobService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addMemberMobPage() {
		ModelAndView modelAndView = new ModelAndView("add-membermob-form");
		modelAndView.addObject("memberMob", new MemberMob());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addingMemberMob(@ModelAttribute("memberMob") @Valid MemberMob memberMob, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("add-membermob-form");
			modelAndView.addObject("memberMob", memberMob);
			return "add-membermob-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-membersmob");
		memberMobService.addMemberMob(memberMob);
		String message = "Membre Mobile enregistré avec succès!";//"MemberMob was successfully added.";
		List<MemberMob> membersMob = memberMobService.getMembersMob();
		modelAndView.addObject("membersMob", membersMob);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Membre Mobile enregistré avec succès!");
		return "redirect:/membermob/list";
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfMembersMob() {
		ModelAndView modelAndView = new ModelAndView("list-of-membersmob");
		List<MemberMob> membersMob = memberMobService.getMembersMob();
		modelAndView.addObject("membersMob", membersMob);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id_memberMob}", method=RequestMethod.GET)
	public ModelAndView editCategoryPage(@PathVariable Integer id_memberMob) {
		ModelAndView modelAndView = new ModelAndView("edit-membermob-form");
		MemberMob memberMob = memberMobService.getMemberMob(id_memberMob);
		modelAndView.addObject("memberMob", memberMob);
		return modelAndView;
	} 
	
	@RequestMapping(value="/edit/{id_memberMob}", method=RequestMethod.POST)
	public String editingMemberMob(@ModelAttribute("memberMob") @Valid MemberMob memberMob, BindingResult bindingResult, @PathVariable Integer id_memberMob, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView("edit-membermob-form");
			modelAndView.addObject("memberMob", memberMob);
			return "edit-membermob-form";
		}
		ModelAndView modelAndView = new ModelAndView("list-of-membersmob");
		memberMobService.updateMemberMob(memberMob);
		String message = "Membre Mobile édité avec succès!";//"MemberMob was successfully edited.";
		List<MemberMob> membersMob = memberMobService.getMembersMob();
		modelAndView.addObject("membersMob", membersMob);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Membre Mobile édité avec succès!");
		return "redirect:/membermob/list";
	}
	
	//delete = inactive = insert false 
	@RequestMapping(value="/delete/{id_memberMob}", method=RequestMethod.GET)
	public String deleteMemberMob(@ModelAttribute MemberMob memberMob, @PathVariable Integer id_memberMob, RedirectAttributes redirectAttributes) {
		ModelAndView modelAndView = new ModelAndView("list-of-membersmob");
		memberMobService.deleteMemberMob(memberMob);
		String message = "Membre Mobile supprimé avec succès!";//"MemberMob was successfully deleted.";
		List<MemberMob> membersMob = memberMobService.getMembersMob();
		modelAndView.addObject("membersMob", membersMob);
		modelAndView.addObject("message", message);
		redirectAttributes.addFlashAttribute("message", "Membre Mobile supprimé avec succès!");
		return "redirect:/membermob/list";
	}
	
	@RequestMapping(value="/view/{id_memberMob}", method=RequestMethod.GET)
	public ModelAndView viewMemberMobPage(@PathVariable Integer id_memberMob) {
		ModelAndView modelAndView = new ModelAndView("view-membermob");
		MemberMob memberMob = memberMobService.getMemberMob(id_memberMob);
		modelAndView.addObject("memberMob", memberMob);
		return modelAndView;
	}
}
