package Day11_ApachePOI_WriteExcel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;

public class C02_WriteExcelExample02 {

    @Test
    public void changeExcelData() throws IOException {
        //Dosyamizin pathini belirttik
        String filePath="src/test/java/resources/excelData.xlsx";


        File file=new File(filePath);

        // Dosyamizi aciyoruz
        FileInputStream fis=new FileInputStream(file);

        //Dosyamizi bir workbook haline getiriyoruz
        Workbook workbook= WorkbookFactory.create(fis);

        //sheet imizi olusturduk
        Sheet informationData=workbook.getSheet("informationData");

        int totalRowUsed=informationData.getLastRowNum()-informationData.getFirstRowNum();
        System.out.println("Total rows= "+totalRowUsed);


        Row row5=informationData.createRow(4);

        row5.createCell(0).setCellValue("mustafa");
        row5.createCell(1).setCellValue("nizamoğlu");
        row5.createCell(2).setCellValue("hmn@cw.com");
        row5.createCell(3).setCellValue("Erkek");
        row5.createCell(4).setCellValue("2456897");
        row5.createCell(5).setCellValue("Adres");

        Row row6=informationData.createRow(5);

        row6.createCell(0).setCellValue("mustafa");
        row6.createCell(1).setCellValue("nizamoğlu");
        row6.createCell(2).setCellValue("hmn@cw.com");
        row6.createCell(3).setCellValue("Erkek");
        row6.createCell(4).setCellValue("2456897");
        row6.createCell(5).setCellValue("Adres");

        Row row7=informationData.createRow(6);

        row7.createCell(0).setCellValue("mustafa");
        row7.createCell(1).setCellValue("nizamoğlu");
        row7.createCell(2).setCellValue("hmn@cw.com");
        row7.createCell(3).setCellValue("Erkek");
        row7.createCell(4).setCellValue("2456897");
        row7.createCell(5).setCellValue("Adres");

        Row row8=informationData.createRow(7);

        row8.createCell(0).setCellValue("mustafa");
        row8.createCell(1).setCellValue("nizamoğlu");
        row8.createCell(2).setCellValue("hmn@cw.com");
        row8.createCell(3).setCellValue("Erkek");
        row8.createCell(4).setCellValue("2456897");
        row8.createCell(5).setCellValue("Adres");

        Row row9=informationData.createRow(8);

        row9.createCell(0).setCellValue("mustafa");
        row9.createCell(1).setCellValue("nizamoğlu");
        row9.createCell(2).setCellValue("hmn@cw.com");
        row9.createCell(3).setCellValue("Erkek");
        row9.createCell(4).setCellValue("2456897");
        row9.createCell(5).setCellValue("Adres");

        Row row10=informationData.createRow(9);

        row10.createCell(0).setCellValue("mustafa");
        row10.createCell(1).setCellValue("nizamoğlu");
        row10.createCell(2).setCellValue("hmn@cw.com");
        row10.createCell(3).setCellValue("Erkek");
        row10.createCell(4).setCellValue("2456897");
        row10.createCell(5).setCellValue("Adres");

        Row row11=informationData.createRow(10);

        row11.createCell(0).setCellValue("mustafa");
        row11.createCell(1).setCellValue("nizamoğlu");
        row11.createCell(2).setCellValue("hmn@cw.com");
        row11.createCell(3).setCellValue("Erkek");
        row11.createCell(4).setCellValue("2456897");
        row11.createCell(5).setCellValue("Adres");

        FileOutputStream fos=new FileOutputStream(file);
        workbook.write(fos);


        fos.close();
        fis.close();
        workbook.close();







    }
}
