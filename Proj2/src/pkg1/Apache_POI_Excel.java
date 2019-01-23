/*
package pkg1;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Apache_POI_Excel 
{

	
	
//public class ExcelUtils {

		private static XSSFSheet ExcelWSheet;

		private static XSSFWorkbook ExcelWBook;

		private static XSSFCell Cell;

		private static XSSFRow Row;

	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path,String SheetName) throws Exception {

			try {

   			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			} catch (Exception e){

				throw (e);

			}

	}

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

    public static String getCellData(int RowNum, int ColNum) throws Exception{

			try{

  			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

  			String CellData = Cell.getStringCellValue();

  			return CellData;

  			}catch (Exception e){

				return"";

  			}

    }

	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

  			Row  = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}

  // Constant variables Test Data path and Test Data file name

  				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

  				ExcelWBook.write(fileOut);

  				fileOut.flush();

					fileOut.close();

				}catch(Exception e){

					throw (e);

			}

		}

}
6) Once we are done with writing Excel functions we can go ahead and modify the SignIn_Action module to accept the test data from excel file.


package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {

public static void Execute(WebDriver driver) throws Exception{

	//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

	String sUserName = ExcelUtils.getCellData(1, 1);

	String sPassword = ExcelUtils.getCellData(1, 2);

	Home_Page.lnk_MyAccount(driver).click();

	LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

	LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

	LogIn_Page.btn_LogIn(driver).click();

}

}
1
2
3
4
5
6
	
	
}
*/