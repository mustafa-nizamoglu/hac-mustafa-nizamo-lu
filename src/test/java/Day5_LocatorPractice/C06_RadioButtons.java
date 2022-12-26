package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_RadioButtons {
    //    Go to URL:  https://www.facebook.com/
//    Click on Create an Account button.
    //click kadin
    //click erkek
    //validate kadın is not selected

//    Then click on the radio buttons.
    //

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

    @Test
    public void radioButtons(){

        //    Go to URL:  https://www.facebook.com/
        driver.get(" https://www.facebook.com/");
        WebElement registerButton=driver.findElement(By.xpath("//a[contains(@data-testid,'registration-form')]"));
        registerButton.click();

        WebElement kadinradio=driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
        WebElement erkekradio=driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));

        kadinradio.click();
        erkekradio.click();

        Assert.assertTrue(erkekradio.isSelected());
        Assert.assertTrue(!kadinradio.isSelected());


    }

}
