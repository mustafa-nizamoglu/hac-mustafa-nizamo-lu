package ödevler;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class Task02 extends BaseTest {
  /*  - https://demoqa.com/select-menu sitesine gidin
            - Multiple select yapabileceginiz <select> elementini locate edin
- Birden fazla secim yapip secimlerinizi DOGRULAyin

   */

    @Test
    public void Task02() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement dropdown = driver.findElement(By.id("cars"));
        Select select =new Select(dropdown);

        System.out.println(select.isMultiple());

        select.selectByVisibleText("Opel");

        select.selectByIndex(3);
        select.selectByValue("audi");
        select.selectByValue("volvo");

        Thread.sleep(3000);


    }
}
