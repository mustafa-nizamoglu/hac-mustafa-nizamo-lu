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

public class C05_homework1 {
    //    Go to URL: https://demoqa.com/
     //    Click on Elements.
     //    Click on Checkbox.
     //    Verify if Home checkbox is selected.
     //    Verify that "You have selected" is visible.
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
    public void Checkboxes() throws InterruptedException {

        //    Go to  https://demoqa.com/
        driver.get(" https://demoqa.com/");



        //    Click on Elements.
        WebElement elements = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
        elements.click();
        Thread.sleep(2000);

        //    Click on Checkbox.
        WebElement checkbox1 = driver.findElement(By.xpath("(//span[text()='Check Box']"));
        checkbox1.click();

        //    Verify if Home checkbox is selected.
        WebElement homecheckbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        if (!homecheckbox.isSelected()) {
            homecheckbox.click();
            Assert.assertTrue(homecheckbox.isDisplayed());

            //    Verify that "You have selected" is visible.
            WebElement selectedBox = driver.findElement(By.xpath("//span[text()='You have selected :']"));
            Thread.sleep(2000);


        }

    }
}
