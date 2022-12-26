package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C3_RobotClass extends BaseTest {

    //https://demo.guru99.com/test/upload/
    @Test

    public void robotTest() throws AWTException, InterruptedException {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\lenovo\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\robot.txt");


        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(3000);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);




    }
}
