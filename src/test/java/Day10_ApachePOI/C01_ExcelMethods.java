package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExcelMethods {

    public static void main(String[] args) throws IOException {

        //
        String path="src\\test\\java\\resources\\excelfile.xlsx";

        //
        FileInputStream fileInputStream=new FileInputStream(path);

        //
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        //workbook umuzdan sheetimize(sayfa) geciş yaptık
        Sheet sheet1=workbook.getSheetAt(0);

        //ilk satır
        Row row1=sheet1.getRow(0);
        Row row2=sheet1.getRow(1);

        //ilk satır ilk hücre aldık
        Cell cell1= row1.getCell(0);
        Cell cell2= row1.getCell(1);
        Cell cell3= row2.getCell(0);


        //sayfa bir satır 1 ilk hucre yazdırdık
        System.out.println("Cell 1:"+cell1);
        System.out.println("Cell 2:"+cell2);
        System.out.println("Cell 3:"+cell3);


        //bununüzerinde işlem yaparken string e cevir yapabiliriz
        System.out.println("Cell 1:"+cell1.toString().toLowerCase());





    }
}
