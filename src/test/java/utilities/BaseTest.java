package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;

    // Abstract yaparak TestBase Class'ından obje oluşturulmasının önüne geçeriz.
    // TestBase Class'ı sadece extends ile inherit ederek kullanacağız.
    // Dolayısıyla oluşturduğumuz driver variable'i için protected access modifier seçiyoruz.

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //browser imizi maksimum yaptık
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

}
