package Day3_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Practice {
    //    Go to https://www.linkedin.com/
//    When we write an e-mail without the @ sign in the e-mail box and press enter.
//    Let's test the "Invalid email address" warning.

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



    }

    @After
    public void tearDown(){
        driver.quit();

    }
    @Test
    public void xpathPractice() throws InterruptedException {

        //1. Adım-->linkedin sitesine gidildi
        driver.get("https://www.linkedin.com/");

        //browser imizi maksimum yaptık
        driver.manage().window().maximize();

        //2. adım -->@ olmadan mail adresi girme

        driver.findElement(By.xpath("//input[@id='session_key']"))
                .sendKeys("mustafaclarusway.com"+ Keys.ENTER);

        //3 adım-->hata mesajının göründüğünü doğrula
        WebElement alertMessage=driver.findElement(By.xpath("//p[@class='alert-content']"));

        Assert.assertTrue(alertMessage.isDisplayed());


       // Assert.assertEquals(true,alertMessage.isDisplayed());
       // Assert.assertFalse(!alertMessage.isDisplayed());







    }





}
