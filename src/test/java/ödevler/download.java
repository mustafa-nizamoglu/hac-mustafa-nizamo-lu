package ödevler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class download extends BaseTest {
    /*
    // Go to https://the-internet.herokuapp.com/download
//  Download sample.png file
//  Then verify if the file downloaded successfully
     */
    @Test
    public void fileDownLoad() throws InterruptedException {


        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Sisteme giris yapiyoruz
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Indirilecek dosyaya gitmek icin gerekli adimlar
        WebElement PIM = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]"));
        PIM.click();

        WebElement configurationTab = driver.findElement(By.xpath("//span[text()='Configuration ']"));
        configurationTab.click();

        WebElement dataImport = driver.findElement(By.linkText("Data Import"));
        dataImport.click();

        WebElement downloadLink = driver.findElement(By.className("download-link"));
        downloadLink.click();

        Thread.sleep(5000); // Ne olur ne olmaz dosyanin inmesi icin bekliyoruz

        // Indirilen dosyamizin path i
        String downloadPath = "C:\\Users\\user\\Downloads\\importData.csv";

        // Dosyanin indirildigini kontrol ediyoruz
        Assert.assertTrue("Indirilen dosya bulunamadi", Files.exists(Paths.get(downloadPath)));









    }
}
