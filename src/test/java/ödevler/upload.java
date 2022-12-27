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

        dosyasec.sendKeys("C:\\Users\\lenovo\\Desktop\\Yeni Microsoft Word Belgesi.docx");

        // Upload butonuna basiyoruz
        WebElement remove=driver.findElement(By.xpath("(//a[@href=\"javascript:void(0)\"][1])"));
        remove.click();

        // Upload edilme mesajinin goruntulendigini dogruluyoruz
        WebElement uploadMassage=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(uploadMassage.isDisplayed());

        Assert.assertEquals("File Uploaded!" ,uploadMassage.getText());

    }
}
