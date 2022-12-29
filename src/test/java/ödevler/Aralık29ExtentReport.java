package ödevler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTestReport;

public class Aralık29ExtentReport extends BaseTestReport {
    /*
    Tasktaki her bir step icin lutfen log mesajlarini yazdirarak ilerleyiniz :)
Go to URL: https://healthunify.com/bmicalculator/
Entring weight
Selecting kilograms
Selecting height in feet
Selecting height in inchs
Clicking on calculate
Getting SIUnit value
Getting USUnit value
Getting UKUnit value
Getting overall description
     */
    @Test
    public void test() throws InterruptedException {
        //testi yapacak olan
        extentTest=extentReports.createTest("My Test","Bu bir açıklamadır");

        extentTest.info("Siteye gidiliyor ");
        driver.get("https://healthunify.com/bmicalculator/");
        WebElement weight = driver.findElement(By.name("wg"));
        weight.sendKeys("72");
        Thread.sleep(2000);
        WebElement drpDown = driver.findElement(By.name("opt1"));
        Select select = new Select(drpDown);
        select.selectByValue("kilograms");
        WebElement drpDown2 = driver.findElement(By.name("opt2"));
        Select select2 = new Select(drpDown2);
        select2.selectByVisibleText("2′");
        Thread.sleep(2000);
        WebElement drpDown3 = driver.findElement(By.name("opt3"));
        Select select3 = new Select(drpDown3);
        select3.selectByIndex(2);
        WebElement calculate= driver.findElement(By.name("cc"));
        calculate.click();
        WebElement SIUnit= driver.findElement(By.name("si"));
        System.out.println(SIUnit.getText());
        WebElement USUnit = driver.findElement(By.name("us"));
        System.out.println(USUnit.getText());
        WebElement UKUnit= driver.findElement(By.name("uk"));
        System.out.println(UKUnit.getText());
        WebElement explanation= driver.findElement(By.name("desc"));
        System.out.println(explanation.getText());

    }
}
