package ödevler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class upload extends BaseTest {
    /*
    Go to URL: https://www.monsterindia.com/seeker/registration
Upload file.
     */
    @Test
    public void fileUpload() {


        driver.get("https://www.monsterindia.com/seeker/registration");

        //upload edilecek dosya seciyoruz
        WebElement dosyasec=driver.findElement(By.id("file-upload"));

       String dosyapath="C:\\Users\\lenovo\\Desktop\\Yeni Microsoft Word Belgesi.docx";


        WebElement uploaddosya= driver.findElement(By.xpath("//input[@id='file-upload']"));
        uploaddosya.sendKeys(dosyapath);


        Assert.assertTrue(Files.exists(Paths.get(dosyapath)));
    }
}
