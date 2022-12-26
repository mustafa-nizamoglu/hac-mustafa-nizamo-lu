package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task02 {
    //Navigate to https://testpages.herokuapp.com/styled/index.html
    // Click on Calculate under Micro Apps.
    // Type any number in the first input.
    // Type any number in the second input.
    // Click on Calculate.
    // Get the result.
    // Print the result.

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

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

        //https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        //browser imizi maksimum yaptık
        driver.manage().window().maximize();

        WebElement calculate = driver.findElement(By.xpath("//a[@href='calculate test']"));
        calculate.click();

        WebElement numara1 = driver.findElement(By.xpath("//input[@name='numara1']"));
        numara1.sendKeys("10");

        WebElement numara2 = driver.findElement(By.xpath("//input[@name='numara2']"));
        numara2.sendKeys("50");

        WebElement calculator = driver.findElement(By.xpath("//input[@class='styled-click-button']"));
        calculator.click();

        WebElement result = driver.findElement(By.xpath("//p[text()='Answer : ']"));

        System.out.println(result.getText());

        Thread.sleep(3000);

    }
}


