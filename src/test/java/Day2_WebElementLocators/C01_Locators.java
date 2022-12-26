package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {

    WebDriver driver;



    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //linkedin sitesine gidildi
         driver.get("https://www.linkedin.com/");

         //browser imizi maksimum yaptık
         driver.manage().window().maximize();


    }
    @After
    public void tearDown(){
        //browser kapatıldı
        driver.quit();

    }


    @Test
    public void idLocator() throws InterruptedException {
        //id Localator-> "session_key"

        driver.findElement(By.id("session_key"));

        WebElement email=driver.findElement(By.id("session_key"));

        email.sendKeys("Clarusway selenium dersinden selemlar :)");

        //Thread.sleep(3000);  //tread ları yoruma almayı unutma



    }

    @Test
    public void nameLocator() throws InterruptedException {
        //name Locator-->"session_password"

        WebElement pasapot=driver.findElement(By.name("session_password"));

        pasapot.sendKeys("Agam ne yapıyorsun  :) ");

        //Thread.sleep(3000);  //tread ları yoruma almayı unutma



    }

    @Test
    public void classLocator() throws InterruptedException {

        //clas locator-->"input_input"

        WebElement email=driver.findElement(By.className("input_input"));

        email.sendKeys("Class localtor test:)");

        //Thread.sleep(3000);  //tread ları yoruma almayı unutma


    }

    @Test
    public void tagLocator(){

        //tag locator-->"input"

        List<WebElement>  emailList=driver.findElements(By.tagName("input"));


        WebElement email=driver.findElement(By.className("input"));
        email.sendKeys("Tag locator test");

    }

    @Test

    public void LinkTextLocator(){

        //Şifrenizi mi unuttunuz?

        WebElement forgotPwd=driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        forgotPwd.click();



    }


    @Test

    public void partialLinkTextLocator(){

        //

        WebElement forgotPwd=driver.findElement(By.partialLinkText("Şifrenizi"));
        forgotPwd.click();


    }
    @Test
    public void absoluteXpath(){
        //html/body/main/section[1]/div/div/form/div[2]/div[1]/input
        WebElement email=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
        email.sendKeys("mustafa absolute xpath gayet basarılı ögrendi");


    }

    @Test
    public void relativeXpath(){

        //----//input[@name="session_key"]----
        WebElement email=driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
        email.sendKeys("mustafa relative xpath gayet basarılı ögrendi");

    }
    @Test
    public void multipleArttributeXpath(){

        //----//input[@name="session_key"]----
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input'][@name='session_password'] "));
        email.sendKeys("mustafa relative xpath gayet basarılı ögrendi");


    }
    @Test
    public void andOrXpath() throws InterruptedException {

        //----//input[@name="session_key"]----
        WebElement email=driver.findElement(By.xpath("//input[@class='input__input' and @name='session_password']"));
        email.sendKeys("mustafa relative xpath gayet basarılı ögrendi");
        Thread.sleep(3000);


    }
    @Test
    public void containsXpath(){

        //----//input[@name="session_key"]----
        WebElement email=driver.findElement(By.xpath("//input[contains(@name, 'key')]"))    ;
        email.sendKeys("mustafa relative xpath gayet basarılı ögrendi");


    }

    @Test
    public void textXpath(){

        //----//input[@name="session_key"]----
        WebElement email=driver.findElement(By.xpath("//button[contains(text(),'Oturum açın')]"))    ;
        email.sendKeys("mustafa relative xpath gayet basarılı ögrendi");


    }


}
