package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {
    //Go to URL: https://demoqa.com/radio-button
//Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
//Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

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
    public void test() throws InterruptedException {

    //Go to URL: https://demoqa.com/radio-button
    driver.get("https://demoqa.com/radio-button");

    Thread.sleep(2000);

    //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    WebElement yes= driver.findElement(By.xpath("//label[@for='yesRadio']"));
    yes.click();
    WebElement Impressive= driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
    Impressive.click();
    WebElement no= driver.findElement(By.xpath("//label[@class='custom-control-label disabled']"));
    no.click();
    Thread.sleep(2000);

    //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
    System.out.println("You have selected Impressive");

}
}
