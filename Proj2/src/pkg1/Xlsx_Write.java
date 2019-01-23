package pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx_Write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Mohit_Shobhit\\Music\\My.xlsx");
		FileOutputStream fo= new FileOutputStream(f);
	XSSFWorkbook xr= new XSSFWorkbook(); //Why not passing? fo
	XSSFSheet xs=xr.createSheet("Sheet1");   // Creating that is why createSheet used	
	//	int r=xt.getPhysicalNumberOfRows();  //We are making write operation can't fetch rows
		for(int i=0;i<=3;i++)
		{
			XSSFRow xr1=xs.createRow(i); //creatRow instead of getRow
			for(int j=0;j<3;j++) 
			{
				XSSFCell xc=xr1.createCell(j);
			xc.setCellValue("Mohit");
			}
			}
	xr.write(fo);
	fo.flush();
	fo.close();
	}
		
	}

