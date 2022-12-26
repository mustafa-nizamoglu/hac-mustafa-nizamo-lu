package Day5_LocatorPractice;

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

public class C02_Task {
    //https://www.teknosa.com/ adresine gidiniz.
    // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
    // Sonuç sayısını yazdırınız.
    // Çıkan ilk ürüne tıklayınız.
    // Sepete ekleyiniz.
    // Sepetime gite tıklayınız.
    // Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
    // Alışverişi tamamlayınız.
    // Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
    // Driver'ı kapatınız.

    WebDriver driver;

    @Before
    public void setup(){
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

    @Test
    public void teknosaTest(){
        //https://www.teknosa.com/ adresine gidiniz.
        driver.get("https://www.teknosa.com/");

        // Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
        WebElement aramaAlani=driver.findElement(By.name("s"));
        aramaAlani.sendKeys("oppo"+ Keys.ENTER);

        // Sonuç sayısını yazdırınız.
        WebElement sonucsayisi=driver.findElement(By.className("plp-info"));
        System.out.println(sonucsayisi.getText());

        // Çıkan ilk ürüne tıklayınız.
        WebElement ilürün=driver.findElement(By.className("prd-link"));
        ilürün.click();



        // Sepete ekleyiniz.
        WebElement sepeteekle=driver.findElement(By.xpath("(//button[@id='addToCartButton'])[1]"));
        sepeteekle.click();

        // Sepetime gite tıklayınız.
        WebElement sepetegit=driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        sepetegit.click();

        // Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
        WebElement siparişözeti=driver.findElement(By.xpath("//div[@class='cart-sum-body']"));
        System.out.println(siparişözeti.getText());

        // Alışverişi tamamlayınız.
       WebElement siparisitamala=driver.findElement(By.partialLinkText("Alışverişi Tamamla"));    //1. yol
        //WebElement siparisitamala=driver.findElement(By.xpath("//a[@title='Alışverişi Tamamla']")); //2. yol

        siparisitamala.click();

        // Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
        WebElement hosgeldiniz=driver.findElement(By.xpath("//div[@class='lrp-title']"));
        System.out.println(hosgeldiniz.getText());
















    }

}
