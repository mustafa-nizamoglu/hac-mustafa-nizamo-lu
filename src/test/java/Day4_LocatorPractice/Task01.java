package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task01 {
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.


    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {

        //https://id.heroku.com/login sayfasına gidiniz.
        driver.get("https://id.heroku.com/login");

        //browser imizi maksimum yaptık
        driver.manage().window().maximize();

        //Bir mail adresi giriniz.
        driver.findElement(By.xpath("//input[@autofocus=\"true\"]"))
                .sendKeys("mustafaclarusway@gmail.com");

        //Bir password giriniz.
        driver.findElement(By.xpath("//*[@id=\"password\"]"))
                .sendKeys("Agam ne yapıyorsun  :) ");

        //Login butonuna tıklayınız.
        WebElement forgotPwd=driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));
        forgotPwd.click();

        //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
        //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.

        String messaj= driver.findElement(By.xpath("//div[@role='alert']")).getText();
        if (messaj.equals("There was a problem with your login.")) {
            System.out.println("Kayıt Yapılamadı");

        } else {
            System.out.println("Kayıt yapıldı");
        }







        //Thread.sleep(3000);


    }
}
