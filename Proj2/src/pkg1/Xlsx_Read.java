package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx_Read {

	public static void main(String[] args) throws NullPointerException, Exception {
		// TODO Auto-generated method stub
File f = new File("C:\\Users\\Mohit_Shobhit\\Music\\Book2xlsx.xlsx");
	FileInputStream fi= new FileInputStream(f);
XSSFWorkbook xs= new XSSFWorkbook(fi);
XSSFSheet xt=xs.getSheet("Sheet1");
	int r=xt.getPhysicalNumberOfRows();
	for(int i=0;i<=r;i++)
	{
		XSSFRow xr=xt.getRow(i);
		for(int j=0;j<xr.getPhysicalNumberOfCells();j++) 
		{
			XSSFCell x=xr.getCell(j);
			System.out.println(x.getStringCellValue());
		}
	}
	}

}
