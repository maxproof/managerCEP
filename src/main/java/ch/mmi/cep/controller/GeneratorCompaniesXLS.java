package ch.mmi.cep.controller;

/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import ch.mmi.cep.model.Category;
import ch.mmi.cep.model.Company;*/

public class GeneratorCompaniesXLS {
    //public static void main(String[] args) throws FileNotFoundException, IOException {
        //writeIntoExcel("entreprises.xls");
        //readFromExcel("entreprises.xls");
    //}
    
    /**
     * Java method to read dates from Excel file in Java.
     * This method read value from .XLS file, which is an OLE
     * format. 
     * 
     * @param file
     * @throws IOException 
     */
    /*public static void readFromExcel(String file) throws IOException{
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
        HSSFSheet myExcelSheet = myExcelBook.getSheet("Birthdays");
        HSSFRow row = myExcelSheet.getRow(0);  
        if(row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING){
            String name = row.getCell(0).getStringCellValue();
            System.out.println("name : " + name);
        } 
        if(row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
            Date birthdate = row.getCell(1).getDateCellValue();
            System.out.println("birthdate :" + birthdate);
        }      
        myExcelBook.close();      
    }*/
    
    /**
     * Java method to write dates from Excel file in Java.
     * This method write value into .XLS file in Java.
     * @param file, name of excel file to write.
     * @throws IOException 
     * @throws FileNotFoundException 
     */
   /* @SuppressWarnings("deprecation")
    public static void downloadCompaniesXLS(String file) throws FileNotFoundException, IOException{
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
        
        // Now, its time to write content of Excel into File
        book.write(new FileOutputStream("/home/max/Desktop/" + file));
        book.close();
    }*/
}
