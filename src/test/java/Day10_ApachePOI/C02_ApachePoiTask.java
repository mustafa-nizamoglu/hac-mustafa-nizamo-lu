package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_ApachePoiTask {
    /*
    Add the excel file on the resources folder.
Open the file.
Open the workbook using file input stream.
Open the first worksheet.
Go to first row.
Go to first cell on that first row and print.
Go to second cell on that first row and print.
Go to 2nd row first cell and assert if the data equal to Russia.
Go to 3rd row 2nd cell-chain the row and cell.
Find the number of used row.
Print country, area key value pairs as map object.
     */

    @Test
    public void apacheTask() throws IOException {
        String path="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        Sheet sheet1=workbook.getSheetAt(0);

        Row row1=sheet1.getRow(0);

        Cell row1cell1= row1.getCell(0);

        System.out.println("row1cell1 = " + row1cell1);
        System.out.println("row1cell1 = " + row1cell1.toString().toLowerCase());

        Cell row1cell2= row1.getCell(1);
        System.out.println("row1cell2 = " + row1cell2);
        System.out.println("row1cell2 = " + row1cell2.toString().charAt(0));

        //Go to 2nd row first cell and assert if the data equal to Russia.
        Row row2=sheet1.getRow(1);
        Cell row2cell1= row2.getCell(0);
        System.out.println("row2cell1 = " + row2cell1);
        Assert.assertEquals("Rusya",row2cell1.toString());

        //Go to 3rd row 2nd cell-chain the row and cell.
        Cell row3cell2=sheet1.getRow(2).getCell(1);
        System.out.println("row3cell2 = " + row3cell2);

       // Find the number of used row.
        System.out.println(sheet1.getPhysicalNumberOfRows());
        System.out.println(sheet1.getLastRowNum());

        int totalRows=sheet1.getPhysicalNumberOfRows();

        //Print country, area key value pairs as map object.
        Map<String,String> countryAreas=new HashMap<>();
        for (int row=1;row<totalRows;row++){
            String country=sheet1.getRow(row).getCell(0).toString();

            System.out.println((row+1)+ ". satır "+"="+country);
            
            String area=sheet1.getRow(row).getCell(1).toString();

            System.out.println("Country ="+country+ "-Area ="+area);
            
            //her bir satırdaki yüz ölcümü ve ülke değerlerini yazdırmış olduk
            countryAreas.put(country,area);
            
            
        }
        //Map imizi yazdırıyoruz
        System.out.println("countryAreas = " + countryAreas);


    }



    }

