package mobiletest;

import org.automationtesting.excelreport.Xl;

public class ExcelReport {

	public static void main(String[] args) throws Exception {
		Xl.generateReport("excel-report.xlsx");
       // Xl.generateReport(folderLocation, xlFileName);
	}

}

