package Day07_IframeWindowshandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Iframeexample {
    //        Go to URL: https://the-internet.herokuapp.com/iframe
    //        Verify the Bolded text contains "Editor"
    //        Locate the text box
    //        Delete the text in the text box
    //        Type "Hi everyone"
    //        Verify the text Elemental Selenium text is displayed on the page.

    WebDriver driver;

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
@Test
    public void Iframeexample() throws InterruptedException {

    //        Go to URL: https://the-internet.herokuapp.com/iframe
    driver.get(" https://the-internet.herokuapp.com/iframe");

    //        Verify the Bolded text contains "Editor"
    WebElement boldedText=driver.findElement(By.tagName("h3"));

    String text=boldedText.getText();

    Assert.assertTrue(text.contains("Editor"));

    //        Locate the text box
    driver.switchTo().frame(0);
    WebElement textbox=driver.findElement(By.id("tinymce"));

    //        Delete the text in the text box
    Thread.sleep(2000);
    textbox.clear();

    //        Type "Hi everyone"
    textbox.sendKeys("Hi everyone");


    ////        Verify the text Elemental Selenium text is displayed on the page.

  driver.switchTo().defaultContent();

    Assert.assertTrue(driver.findElement(By.partialLinkText("Elemental")).isDisplayed());













}
}
