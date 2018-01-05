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

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.mmi.cep.model.Category;
import ch.mmi.cep.model.Company;
import ch.mmi.cep.service.CompanyService;
import ch.mmi.cep.service.CategoryService;

@Controller
public class CreateExportCompaniesXLS {

	@Autowired
	private CompanyService companyService;

	@Autowired
	private CategoryService categoryService;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH.mm");

	@RequestMapping(value = "/export-companies-xls")
	public void downloadXLS(HttpServletResponse response) {
		try {
			response.setContentType("application/vnd.ms-excel");
			// response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			//String currentDate = LocalDate.now().toString();
			Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
			String reportName = "Entreprises_" + sdf.format(currentTimestamp) + ".xls";
			// String reportName = "Entreprises_"+currentDate+".xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + reportName);
			ArrayList<String> rows = new ArrayList<String>();
			rows.add("Catégorie");
			rows.add("\t");
			rows.add("Nom");
			rows.add("\t");
			rows.add("Adresse");
			rows.add("\t");
			rows.add("CP");
			rows.add("\t");
			rows.add("Localité");
			rows.add("\t");
			rows.add("Téléphone");
			rows.add("\t");
			//
			//rows.add("Téléphone 2");
			//rows.add("\t");
			//
			rows.add("Email");
			rows.add("\t");
			//
			//rows.add("Email 2");
			//rows.add("\t");
			//rows.add("Site web");
			//rows.add("\t");
			//
			rows.add("Commentaires");
			rows.add("\t");
			rows.add("Date enregistrement");
			rows.add("\t");
			/*
			 * rows.add("Dernière date modification"); rows.add("\t");
			 * rows.add("Date élimination"); rows.add("\t");
			 */
			rows.add("Statut");
			rows.add("\t");
			rows.add("ID Entreprise");
			rows.add("\n");
			ArrayList<Category> categoriesList = (ArrayList<Category>) categoryService.getCategories();
			List<Company> companies = companyService.getCompanies();
			if (!companies.isEmpty()) {
				for (Company transactionCompany : companies) {
					Integer categoryID = Integer.parseInt(transactionCompany.getCompanyCategory());
					String companyCategoryName = categoriesList.stream()
							.filter(p -> p.getId_category().equals(categoryID)).collect(Collectors.toList()).iterator()
							.next().getCategoryName();
					rows.add(companyCategoryName);
					rows.add("\t");
					rows.add(transactionCompany.getCompanyName());
					rows.add("\t");
					rows.add(transactionCompany.getCompanyStreet());
					rows.add("\t");
					rows.add(transactionCompany.getCompanyPostCode());
					rows.add("\t");
					rows.add(transactionCompany.getCompanyCity());
					rows.add("\t");
					// rows.add("+41"+transactionCompany.getCompanyPhoneNumber());
					rows.add("'".concat(transactionCompany.getCompanyPhoneNumber()));// http://www.windowsadvisor.co.uk/?p=18191
					rows.add("\t");
					//
					//rows.add("'".concat(transactionCompany.getCompanyMobileNumber()));
					//rows.add("\t");
					//
					rows.add(transactionCompany.getCompanyEmail());
					rows.add("\t");
					//
					//rows.add(transactionCompany.getCompanyEmail2());
					//rows.add("\t");
					//rows.add(transactionCompany.getCompanyWebsite());
					//rows.add("\t");
					//
					rows.add(transactionCompany.getCompanyComments());
					rows.add("\t");
					rows.add(transactionCompany.getCompanyInsertionTimestamp().toString());
					rows.add("\t");
					/*
					 * if
					 * (!transactionCompany.getCompanyModificationTimestamp().
					 * equals(null)) { rows.add(transactionCompany.
					 * getCompanyModificationTimestamp().toString()); } else {
					 * rows.add(""); } rows.add("\t"); if
					 * (!transactionCompany.getCompanyDeletionTimestamp().equals
					 * (null)) {
					 * rows.add(transactionCompany.getCompanyDeletionTimestamp()
					 * .toString()); } else { rows.add(""); } rows.add("\t");
					 */
					if (transactionCompany.getCompanyIsActive().equals(true)) {
						rows.add("Active");
					} else {
						rows.add("Désactivée");
					}
					rows.add("\t");
					rows.add(transactionCompany.getId_company().toString());
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
				//
				//rows.add("Ø"); 
				//rows.add("\t");
				//rows.add("Ø"); 
				//rows.add("\t");
				//rows.add("Ø"); 
				//rows.add("\t");
				//
				//rows.add("Ø");
				//rows.add("\t");
				//rows.add("Ø");
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
	
	/*@RequestMapping(value = "/export-companies-xls")
	public void downloadXLS(HttpServletResponse response) {
			response.setContentType("application/vnd.ms-excel");
			// response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			//String currentDate = LocalDate.now().toString();
			Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
			String reportName = "Entreprises_" + sdf.format(currentTimestamp) + ".xls";
			// String reportName = "Entreprises_"+currentDate+".xlsx";
			response.setHeader("Content-disposition", "attachment; filename=" + reportName);
	        Workbook book = new HSSFWorkbook();
	        Sheet sheet = book.createSheet("Entreprises");
	        Row row = sheet.createRow(0); 
	        Cell category = row.createCell(0);
	        category.setCellValue("Catégorie"); 
	        Cell name = row.createCell(1);
	        name.setCellValue("Nom"); 
	        Cell address = row.createCell(2);
	        address.setCellValue("Adresse"); 
	        Cell city = row.createCell(3);
	        city.setCellValue("Localité");
	        
			ArrayList<Category> categoriesList = (ArrayList<Category>) categoryService.getCategories();
			List<Company> companies = companyService.getCompanies();
			if (!companies.isEmpty()) {
				for (Company transactionCompany : companies) {
					Integer categoryID = Integer.parseInt(transactionCompany.getCompanyCategory());
					String companyCategoryName = categoriesList.stream()
							.filter(p -> p.getId_category().equals(categoryID)).collect(Collectors.toList()).iterator()
							.next().getCategoryName();
					for(int i = 1; i < companies.size()-1; i++) {
						Row rowi = sheet.createRow(i); 
				        Cell categoryi = row.createCell(i);
				        categoryi.setCellValue(companyCategoryName); 
				        Cell namei = row.createCell(i+1);
				        namei.setCellValue(transactionCompany.getCompanyName()); 
				        Cell addressi = row.createCell(i+2);
				        addressi.setCellValue(transactionCompany.getCompanyStreet()); 
				        Cell cityi = row.createCell(i+3);
				        cityi.setCellValue(transactionCompany.getCompanyCity());
					}
				}
			}
	}*/
}
