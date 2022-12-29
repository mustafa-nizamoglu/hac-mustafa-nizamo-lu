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
       Go to https://the-internet.herokuapp.com/download
       Download sample.png file
       Then verify if the file downloaded successfully
     */
    @Test
    public void fileDownLoad() throws InterruptedException {


        driver.get("https://the-internet.herokuapp.com/download");

        // Sisteme giris yapiyoruz
        WebElement samplepng= driver.findElement(By.xpath("//a[@href=\"download/sample.png\"]"));
        samplepng.click();
        Thread.sleep(4000);


        // Indirilen dosyamizin path i
        String downloadPath = "C:\\Users\\lenovo\\Downloads\\sample.png";

        // Dosyanin indirildigini kontrol ediyoruz
        Assert.assertTrue("Indirilen dosya bulunamadi", Files.exists(Paths.get(downloadPath)));
    }
}
