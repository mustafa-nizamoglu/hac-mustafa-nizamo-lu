package Day13_Log4j_SeleniumExceptions_ExtentsRe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTestReport;

public class C03_ExtentReport extends BaseTestReport {
    @Test
    public void test() {
        //testi yapacak olan
        extentTest=extentReports.createTest("My Test","Bu bir açıklamadır");

        extentTest.info("Amazon a gidiliyor ");
        driver.get("http://www.amazon.com.tr/");

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        extentTest.info("Arama kısmına log4j yazdırılıyor");

        searchBox.sendKeys("log4j");

        extentTest.pass("Testimiz gecerli");

        extentTest.fail("Testimiz gecersiz");

        extentTest.skip("Testimiz skip edildi");

    }

}
