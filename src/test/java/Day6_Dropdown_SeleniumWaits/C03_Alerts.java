package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Alerts {
//    driver.switchTo().alert().accept();//ok demek
//driver.switchTo().alert().dismiss();//cancel demek
//driver.switchTo().alert().getText();//metni getirir
//driver.switchTo().alert().sendKeys("");//metin kutusu doldurulur
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
    public void Alerts() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement idInput=driver.findElement(By.name("cusid"));
        idInput.sendKeys("123");

        driver.findElement(By.name("submit")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        driver.switchTo().alert().accept();


    }
}
