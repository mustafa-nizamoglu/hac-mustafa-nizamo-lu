package Day3_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Parctice {
    //    Create the driver with BeforeClass and make it static inside the class.
//    Go to http://www.google.com
//    Type "Green Mile" in the search box and print the number of results.
//    Type "Premonition" in the search box and print the number of results.
//    Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
//    Close with AfterClass.

    static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Before
    public void beforeEach(){
        driver.get("http://www.google.com");


    }

    @AfterClass
    public static void closeDriver(){
        driver.quit();
    }

    @Test
    public void test01(){
        WebElement serach=driver.findElement(By.name("q"));

        serach.sendKeys("Green Mile"+Keys.ENTER);

        WebElement result=driver.findElement(By.id("result-starts"));
        System.out.println(result.getText());
    }
}
