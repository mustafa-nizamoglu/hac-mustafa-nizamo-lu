package Day4_LocatorPractice;
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


        //Navigate to website  https://testpages.herokuapp.com/styled/index.html
        // Under the ORIGINAL CONTENTS
        // Click on Alerts
        // Print the URL
        // Navigate back
        // Print the URL
        // Click on Basic Ajax
        // Print the URL
        // Enter value  20 and Enter
        // And then verify Submitted Values is displayed open page
        // Close driver.

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
        public void test(){
            driver.get("https://testpages.herokuapp.com/styled/index.html");

            //Alerts linki locate edildi ve tiklandi
            WebElement alertsLink = driver.findElement(By.xpath("//a[@id='alerts']"));
            alertsLink.click();

            //Current URL yazdirildi
            String alertsUrl = driver.getCurrentUrl();
            System.out.println(alertsUrl);

            // back = geri -> bir sayfa geri gelindi
            driver.navigate().back();

            // Current URL print edildi
            String homeUrl = driver.getCurrentUrl();
            System.out.println(homeUrl);

            // Basic Ajax linki locate edildi ve tiklandi
            WebElement basicAjaxLink = driver.findElement(By.id("basicajax"));
            basicAjaxLink.click();

            // Basic Ajax URL print edildi
            String basicAjaxUrl = driver.getCurrentUrl();
            System.out.println(basicAjaxUrl);

            //Text alanina 20 yazilip ENTER a basildi
            driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);

            //Submitted Values yazisinin goruntulendigini dogrula
            WebElement submittedValuesText = driver.findElement(By.xpath("//p[text()='Submitted Values']"));
            Assert.assertTrue(submittedValuesText.isDisplayed());


        }

    }

