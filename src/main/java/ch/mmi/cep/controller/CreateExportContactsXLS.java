package ch.mmi.cep.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.mmi.cep.model.Category;
import ch.mmi.cep.model.Company;
import ch.mmi.cep.model.Contact;
import ch.mmi.cep.model.Salutation;
import ch.mmi.cep.service.CategoryService;
import ch.mmi.cep.service.ContactService;
import ch.mmi.cep.service.SalutationService;

@Controller
public class CreateExportContactsXLS {

	@Autowired
	private ContactService contactService;

	@Autowired
	private SalutationService salutationService;

	@Autowired
	private CategoryService categoryService;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH.mm");

	@RequestMapping(value = "/export-contacts-xls")
	public void downloadXLS(HttpServletResponse response) {
		try {
			response.setContentType("application/vnd.ms-excel");
			// response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			//String currentDate = LocalDate.now().toString();
			Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
			String reportName = "Contacts_" + sdf.format(currentTimestamp) + ".xls";
			// String reportName = "Contacts_"+currentDate+".xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + reportName);
			ArrayList<String> rows = new ArrayList<String>();
			rows.add("Catégorie");
			rows.add("\t");
			rows.add("Entreprise");
			rows.add("\t");
			rows.add("Formule de politesse");
			rows.add("\t");
			rows.add("Nom");
			rows.add("\t");
			rows.add("Prénom");
			rows.add("\t");
			rows.add("Adresse");
			rows.add("\t");
			rows.add("CP");
			rows.add("\t");
			rows.add("Localité");
			rows.add("\t");
			rows.add("Email");
			rows.add("\t");
			//
			//rows.add("Email 2");
			//rows.add("\t");
			//
			rows.add("Téléphone");
			rows.add("\t");
			//
			//rows.add("Téléphone 2");
			//rows.add("\t");
			//
			rows.add("Facturation");
			rows.add("\t");
			rows.add("Commentaires");
			rows.add("\t");
			rows.add("Envoi revue");
			rows.add("\t");
			rows.add("Envoi invitations");
			rows.add("\t");
			rows.add("Invitations Club");
			rows.add("\t");
			rows.add("Microtechniques");
			rows.add("\t");
			rows.add("Pub revue");
			rows.add("\t");
			rows.add("Conseil de Direction");
			rows.add("\t");
			rows.add("Commission Stratégie");
			rows.add("\t");
			rows.add("Commission Services");
			rows.add("\t");
			rows.add("Commission Formation");
			rows.add("\t");
			rows.add("Commission Coaching");
			rows.add("\t");
			rows.add("Commission Industrie");
			rows.add("\t");
			rows.add("Commission Infrastructures");
			rows.add("\t");
			rows.add("Commission Club-Entreprises");
			rows.add("\t");
			rows.add("Date enregistrement");
			rows.add("\t");
			rows.add("Statut");
			rows.add("\t");
			rows.add("ID Contact");
			rows.add("\t");
			rows.add("ID Entreprise");
			rows.add("\n");
			ArrayList<Salutation> salutationsList = (ArrayList<Salutation>) salutationService.getSalutations();
			ArrayList<Category> categoriesList = (ArrayList<Category>) categoryService.getCategories();
			List<Contact> contacts = contactService.getContacts();
			if (!contacts.isEmpty()) {
				for (Contact transactionContact : contacts) {
					Company companySelected = transactionContact.getCompanies().stream()
							.skip(transactionContact.getCompanies().size() - 1).findFirst().get();
					// String companyName = companySelected.getCompanyName();
					Integer categoryID = Integer.parseInt(companySelected.getCompanyCategory());
					String categoryName = categoriesList.stream().filter(p -> p.getId_category().equals(categoryID))
							.collect(Collectors.toList()).iterator().next().getCategoryName();
					String salutationName = salutationsList.stream()
							.filter(p -> p.getId_salutation()
									.equals(Integer.parseInt(transactionContact.getSalutations())))
							.collect(Collectors.toList()).iterator().next().getSalutationName();
					rows.add(categoryName);// category
					rows.add("\t");
					rows.add(transactionContact.getContactCompanyName());
					rows.add("\t");
					rows.add(salutationName);
					rows.add("\t");
					rows.add(transactionContact.getContactLastName());
					rows.add("\t");
					rows.add(transactionContact.getContactFirstName());
					rows.add("\t");
					rows.add(transactionContact.getContactStreet());
					rows.add("\t");
					rows.add(transactionContact.getContactPostCode());
					rows.add("\t");
					rows.add(transactionContact.getContactCity());
					rows.add("\t");
					rows.add(transactionContact.getContactEmail());
					rows.add("\t");
					//
					//rows.add(transactionContact.getContactEmail2());
					//rows.add("\t");
					//
					rows.add("'".concat(transactionContact.getContactPhoneNumber()));
					rows.add("\t");
					//
					//rows.add("'".concat(transactionContact.getContactMobileNumber()));
					//rows.add("\t");
					//
					rows.add(transactionContact.getBilling());
					rows.add("\t");
					rows.add(transactionContact.getComments());
					rows.add("\t");
					if (transactionContact.getSendMagazine().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getSendInvitation().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getSendClubInvitation().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getMicrotechnics().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getMagazinePublication().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getExecutiveBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getStrategyBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getServicesBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getTrainingBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getCoachingBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getIndustryBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getFacilitiesBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					if (transactionContact.getClubCompaniesBoard().equals("OUI")) {
						rows.add("X");
					} else {
						rows.add("");
					}
					rows.add("\t");
					rows.add(transactionContact.getContactInsertionTimestamp().toString());
					rows.add("\t");
					if (transactionContact.getContactIsActive().equals(true)) {
						rows.add("Actif");
					} else {
						rows.add("Désactivé");
					}
					rows.add("\t");
					rows.add(transactionContact.getId_contact().toString());
					rows.add("\t");
					rows.add(transactionContact.getCompany_id().toString());
					rows.add("\n");
				}
			} else {
				rows.add("Pas de données dans le DB!");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				rows.add("Ø");
				rows.add("\t");
				//
				//rows.add("Ø");
				//rows.add("\t");
				//rows.add("Ø");
				//rows.add("\t");
				//
				rows.add("Ø");
				rows.add("\n");
			}
			Iterator<String> iter = rows.iterator();
			while (iter.hasNext()) {
				String outputString = (String) iter.next();
				response.getOutputStream().print(outputString);
			}
			response.getOutputStream().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
