package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C01_scrollActions extends BaseTest {

    @Test
    public void scrollPageUpDown() throws InterruptedException {
        driver.get("https://amazon.com/");
        Actions act=new Actions(driver);
        Thread.sleep(2000);

        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_UP).perform();


    }
    @Test
    public void scrollArrowUpDown() throws InterruptedException {
        driver.get("https://amazon.com/");
        Actions act=new Actions(driver);
        Thread.sleep(2000);

        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
    }
}
