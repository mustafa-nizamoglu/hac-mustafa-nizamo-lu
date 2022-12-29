package ödevler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class RovCellÖdev extends BaseTest {
    /*
    Go to URL: https://the-internet.herokuapp.com/tables
    Print the entire table
    Print All Rows
    Print Last row data only
    Print column 5 data in the table body
    Write a method that accepts 2 parameters
    parameter 1 = row number
    parameter 2 = column number
    printData(3,4); => prints
    parameter 3 = table id
    printData(3,4,"table1") => prints data in 3rd row 4th Column with table id

     */


    @Test

    public void test(){
        //Go to URL: https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));

        // Print the entire table
        System.out.println("Taablo 1"+table1.getText());

        //Print All Rows
        int rowTotal = table1.findElements(By.xpath(".//tr")).size();
        System.out.println(rowTotal);

        for(int i = 1; i < rowTotal; i++){
            System.out.println(""+i+".satır: "+table1.findElement(By.xpath(".//tr["+i+"]")).getText());
        }

        WebElement lastRow = table1.findElement(By.xpath(".//tr["+(rowTotal-1)+"]"));
        System.out.println("The last row: "+lastRow.getText());

        for(int i = 1; i < rowTotal; i++){
            System.out.println(""+i+".satır-5.sütun: "+table1.findElement(By.xpath(".//tr["+i+"]//td[5]")).getText());
        }

        // printData(3,4); => prints
        printData(3,4, table1);
    }

    private void printData(int rowNum, int columnNum, WebElement table1) {
        String data= table1.findElement(By.xpath(".//tr[" + rowNum + "]//td[" + columnNum + "]")).getText();
        System.out.println(""+rowNum+".satır "+columnNum+".sütundaki data: "+data);
    }
}
