package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C10_FileUpload extends BaseTest {
    @Test
    public void fileUpload() {
        /*
        Go to URL: https://the-internet.herokuapp.com/upload
Find the path of the file that you want to upload.
Click on Upload button.
Verify the upload message.
         */

        driver.get("https://the-internet.herokuapp.com/upload");

        //upload edilecek dosya seciyoruz
        WebElement dosyasec=driver.findElement(By.id("file-upload"));

        dosyasec.sendKeys("C:\\Users\\lenovo\\Desktop\\fileExist.png");

        // Upload butonuna basiyoruz
        WebElement uploadFile=driver.findElement(By.id("file-submit"));
        uploadFile.click();

        // Upload edilme mesajinin goruntulendigini dogruluyoruz
        WebElement uploadMassage=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(uploadMassage.isDisplayed());

        Assert.assertEquals("File Uploaded!" ,uploadMassage.getText());

    }
}
