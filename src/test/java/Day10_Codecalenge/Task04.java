package Day10_Codecalenge;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;

import java.util.Set;

public class Task04 extends BaseTest {
    /*
    ● https://the-internet.herokuapp.com/windows adresine gidin.
    ● Sayfadaki textin "Opening a new window" olduğunu doğrulayın.
    ● Sayfa başlığının (title) "The Internet" olduğunu doğrulayın.
    ● Click Here butonuna basın.
    ● Açılan yeni pencerenin sayfa başlığının (title) "New Window" olduğunu doğrulayın.
    ● Sayfadaki textin "New Window" olduğunu doğrulayın.
    ● Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın.
*/

    @Test
    public void Task04() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");


        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"Opening a new window");
        Assert.assertTrue("1. sayfadaki title istenen değerden farklı.", driver.getTitle().contains("The Internet"));

        String firstPageHandle = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();



        Set<String> allWindowHandles = driver.getWindowHandles();

        String secondWindowHandle = "";

        for (String each : allWindowHandles) {
            if (!each.equals(firstPageHandle)) {
                secondWindowHandle = each;
            }
        }

        driver.switchTo().window(secondWindowHandle);

        Assert.assertEquals(driver.getTitle(), "New Window", "2. sayfadaki title istenen değerden farklı.");
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "New Window");

        driver.switchTo().window(firstPageHandle);
        Assert.assertTrue("1. sayfadaki title istenen değerden bambaşka.", driver.getTitle().contains("The Internet"));
    }
}