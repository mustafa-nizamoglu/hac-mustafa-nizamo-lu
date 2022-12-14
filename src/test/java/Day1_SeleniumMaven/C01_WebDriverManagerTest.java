package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {
    // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.
    public static void main(String[] args) {

        //Webdriver manager clasını kullanarak chromedriver binary lerimizi indirdik
        WebDriverManager.chromedriver().setup();

        //driver objemizi olusturduk
        WebDriver driver=new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");


        // Verify that you are Google in the title.
        //title mizi alıyoruz
        String title=driver.getTitle();

        //title mizi doğruluyoruz
        if (title.equals("Google")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //driver imizi kapattık
        driver.quit();





    }

}
