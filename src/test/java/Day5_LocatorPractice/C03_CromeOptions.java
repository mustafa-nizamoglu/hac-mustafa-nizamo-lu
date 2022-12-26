package Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_CromeOptions {

    @Test
    public void cromeOptions(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();

        //gizli modda açtı
        //options.addArguments("headless");

        //maxsimum yaptı
        options.addArguments("start-maximized");


        //versiyon yazdırır
       // options.addArguments("version");



        WebDriver driver=new ChromeDriver(options);




    }
}
