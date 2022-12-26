package Day08_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C04_Actions extends BaseTest {

    @Test
    public void dragAndDropOsset(){
        driver.get("https://rangeslider.js.org/");

        WebElement slider=driver.findElement(By.xpath("//*[@id=\"js-rangeslider-0\"]/div[2]"));//(//div[@class='rangleslider__handle'])[1]

        Actions actions=new Actions(driver);

        actions.dragAndDropBy(slider,100,0).perform();

    }
}
