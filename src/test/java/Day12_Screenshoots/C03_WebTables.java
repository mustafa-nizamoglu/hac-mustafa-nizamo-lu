package Day12_Screenshoots;

import org.apache.poi.ss.usermodel.Row;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C03_WebTables extends BaseTest {
    @Test
    public void WebTablesExamples() {
        /*
        Go to URL: http://demo.guru99.com/test/web-table-element.php
To find third row of table
To get 3rd row's 3nd column data
Get all the values of a Dynamic Table
         */
        driver.get(" http://demo.guru99.com/test/web-table-element.php");

        //Tablomuzu locate ettik
        WebElement table=driver.findElement(By.className("dataTable")).findElement(By.tagName("tbody"));

        //3. satır locate edildi
        WebElement row3=table.findElement(By.xpath(".//tr[3]"));

        //3 stır 3 sutun locate edildi
        WebElement row3cell3=row3.findElement(By.xpath(".//td[3]"));

        System.out.println(row3cell3.getText());

        // Satir sayimizi bulduk
        int stırsayısı=table.findElements(By.xpath(".//tr")).size();

        System.out.println(stırsayısı);

        //sutun sayimizi bulduk
        int sütünsayısı=row3.findElements(By.xpath(".//td")).size();
        System.out.println("sütünsayısı = " + sütünsayısı);

        // For donguleri ile tum hucreleri geziyoruz
        for (int i=1; i<=stırsayısı;i++){
            //her bir satir

            for (int j=1;j<=sütünsayısı;j++){
                // her satirin sutunu

                By locator=By.xpath(".//tr["+i+"]//td["+j+"]");
                WebElement tableData=table.findElement(locator);

                System.out.print(tableData.getText()+" ");
            }
            System.out.println();
        }


    }
}
