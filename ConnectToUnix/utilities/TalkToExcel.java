package utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jcraft.jsch.JSchException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.Number;

public class TalkToExcel {
	
	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
   
    
    public void setExcelFile(File fileName, String SheetName) {               
    	
    	FileInputStream ExcelFile=null;
   try {
       ExcelFile = new FileInputStream(fileName);
       ExcelWBook = new XSSFWorkbook(ExcelFile);
       ExcelWSheet = ExcelWBook.getSheet(SheetName);
       //ExcelWSheet.
       //ExcelWBook.close();
   } catch (Exception e) {
       throw new utilities.customException("The file /Sheet does not exist");
   }
   


}


     public static String getCellData(int RowNum, int ColNum) throws Exception {

   try {
       Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
       String CellData = Cell.getStringCellValue();
       return CellData;
   } catch (Exception e) {
	   throw new utilities.customException("The Row/Column does not exist");
     //  return "";

   }
	
     }
     public static void setCellData(String value, int RowNum, int ColNum, File fileName) throws utilities.customException {

         try {
             Row = ExcelWSheet.createRow(RowNum - 1);
             Cell = Row.createCell(ColNum - 1);
             Cell.setCellValue(value);
             FileOutputStream fileOut = new FileOutputStream(fileName);
             ExcelWBook.write(fileOut);
             //ExcelWBook.write(fileOut);
             fileOut.flush();
             fileOut.close();
             //ExcelWBook.close();
         } catch (Exception e) {
        	 throw new utilities.customException("The possible causes are \n The Result value could be empty \n Row value or Column value is empty \n the excel file does not exist");
           // e.printStackTrace();

         }
         
     }  
         public static void mysetCellData(FileOutputStream fileOut,String value, int RowNum, int ColNum) throws utilities.customException {

             try {
                 Row = ExcelWSheet.createRow(RowNum - 1);
                 Cell = Row.createCell(ColNum - 1);
                 Cell.setCellValue(value);
                 //FileOutputStream fileOut = new FileOutputStream(fileName);
                 ExcelWBook.write(fileOut);
                 //ExcelWBook.write(fileOut);
                 fileOut.flush();
                 fileOut.close();
                 //ExcelWBook.close();
             } catch (Exception e) {
            	 throw new utilities.customException("The possible causes are \n The Result value could be empty \n Row value or Column value is empty \n the excel file does not exist");
               // e.printStackTrace();

             }

     }
     
     public void writeToExcel(String EXCEL_FILE_LOCATION,int RowNumber,int ColumnNumber,String excelValue,String sheetname ) {
    	 Workbook myFirstWbook = null;
         try {

             try {
				myFirstWbook = Workbook.getWorkbook(new File(EXCEL_FILE_LOCATION));
			} catch (BiffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
             WritableWorkbook copy = Workbook.createWorkbook(new File("temp.xls"), myFirstWbook);
             // create an Excel sheet
             WritableSheet excelSheet = copy.getSheet("Data");
             //WritableSheet 
             // add something into the Excel sheet
             Label label = new Label(0, 0, "Result");
             excelSheet.addCell(label); 
             
             label = new Label(0, 1, "Pass");
             excelSheet.addCell(label);  

             copy.write();
             copy.close();

         } catch (IOException e) {
             e.printStackTrace();
         } catch (WriteException e) {
             e.printStackTrace();
         } finally {

             if (myFirstWbook != null) {
                 myFirstWbook.close();
             }


         }

     }

    
}
