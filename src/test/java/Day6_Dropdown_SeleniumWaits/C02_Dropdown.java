package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_Dropdown {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //sayfanın yüklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        driver.quit();
    }

    @Test
    public void selectByIndex() {

        //    Go to  https://demo.guru99.com/test/newtours/register.php
        driver.get(" https://demo.guru99.com/test/newtours/register.php");

        //Dropdown locate edildi
        WebElement drpdown = driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine donusturuldu
        Select select = new Select(drpdown);

        select.selectByIndex(1);//Allgeria

        //selectByIndex() metodu 0 ile baslar.


    }

    @Test
    public void selectByValue() throws InterruptedException {

        //    Go to  https://demo.guru99.com/test/newtours/register.php
        driver.get(" https://demo.guru99.com/test/newtours/register.php");

        //Dropdown locate edildi
        WebElement drpdown = driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine donusturuldu
        Select select = new Select(drpdown);
        select.selectByValue("TURKEY");

        Thread.sleep(2000);

    }

    @Test
    public void selectByValue1() throws InterruptedException {

        //    Go to  https://demo.guru99.com/test/newtours/register.php
        driver.get(" https://demo.guru99.com/test/newtours/register.php");

        //Dropdown locate edildi
        WebElement drpdown = driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine donusturuldu
        Select select = new Select(drpdown);
        select.selectByValue("ANGOLA");

        Thread.sleep(2000);

    }

    @Test
    public void multipleselect() throws InterruptedException {

        //    Go to  https://output.jsbin.com/osebed/2
        driver.get("https://output.jsbin.com/osebed/2");


        //Locate edilen dropdown select objesine donusturuldu
        Select select = new Select(driver.findElement(By.id("fruits")));
        System.out.println(select.isMultiple());
        select.selectByValue("apple");
        select.selectByIndex(3);
        Thread.sleep(2000);
    }

    @Test
    public void getOptions(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select select=new Select(driver.findElement(By.name("country")));
        //getOptions()
        List<WebElement> options=select.getOptions();

        for (WebElement option:options){
            System.out.println(option.getText());
        }
    }

    @Test
    public void getFirstSelectectedOption(){

        driver.get("https://output.jsbin.com/osebed/2");

        Select select = new Select(driver.findElement(By.id("fruits")));

        select.selectByIndex(3);//grape
        select.selectByIndex(2);//orange

       // System.out.println(select.getFirstSelectedOption());
        WebElement selectedOption=select.getFirstSelectedOption();

        System.out.println(selectedOption.getText());

       // selectedOption.forEach(x-> System.out.println(x.getText()));

        //getFirstSelectedOption(); metodu secili olan ilk option elementi bize verir (sectiğimiz ilk option değil)


    }

}