package ödevler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class Task01 extends BaseTest {
    /*
    - https://demoqa.com/select-menu sitesine gidin

            - <select> elementini locate edin
- <select> elementinin seceneklerini yazdirin
- Sirasiyla selectByIndex, selectByValue, selectByVisibleText methodlarini kullanarak;
    * Yellow (index)
    * Purple (value)
    * Black  (text)
    seceneklerini secin
             */

    @Test
    public  void test() throws InterruptedException {
        driver.get(" https://demoqa.com/select-menu");

        WebElement options=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));

        Select select=new Select(options);

        List<WebElement> secenekler=select.getOptions();

        for(WebElement option:secenekler) {
            System.out.println(option.getText());
        }
        select.selectByIndex(4);


        select.selectByValue("4");


        select.selectByVisibleText("Black");


    }
}
