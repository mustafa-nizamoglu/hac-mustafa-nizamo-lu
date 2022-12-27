package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C11_AssertElemetTrick extends BaseTest {
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

        //Yeniden implement edecegiz

        // Upload edilme mesajinin goruntulendigini dogruluyoruz    "File Uploaded!"
       List<WebElement>  uploadMassageList=driver.findElements(By.tagName("h9"));//locator bilerek yanlış yazıldı hata mesajının nasıl handle edildiği görmek için

        Assert.assertEquals("Element locate edilemedi",1,uploadMassageList.size());

        WebElement uploadMessage=uploadMassageList.get(0);

        Assert.assertTrue(uploadMessage.isDisplayed());
        Assert.assertEquals("Mesajın text i istenilen gibi görüntülenemiyor","File Uploaded!",uploadMessage.getText());


    }
}
