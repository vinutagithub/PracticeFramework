package org.wbl.Util;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelHelper {

    public static Object[][] getExcelData(String filename, String sheetname){
        Object[][] data =null;
        XSSFWorkbook wb = null;

        try {
            wb = new XSSFWorkbook(Constants.RESOURCES_PATH+"/TestData/"+filename);// open workbook
            XSSFSheet ws = wb.getSheet(sheetname); // access the sheet from workbook
            int rowIndex = ws.getLastRowNum(); // get the last row index - index starts from 0
            data = new Object[rowIndex][];
            for(int i=1;i<= rowIndex;i++){
                XSSFRow row = ws.getRow(i);
                int col = row.getLastCellNum();
                Object[] colData = new Object[col];
                for(int j=0;j<col;j++){
                    colData[j] =row.getCell(j).toString();
                }
                data[i-1]=colData;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;

    }
}
