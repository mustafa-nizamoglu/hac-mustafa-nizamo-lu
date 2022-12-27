package ödevler;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ElementScreenshot extends BaseTest {
    @Test
public void getElementScreenshot() throws IOException {
        /*
        Go to URL: https://opensource-demo.orangehrmlive.com/
        Saving the image to  the path.
        Getting screenshot of Orange HRM Logo.
        Getting screenshot of  Orange HRM Page Section
         */

    driver.get("https://opensource-demo.orangehrmlive.com/");

    WebElement logo=driver.findElement(By.className("orangehrm-login-logo"));

    File logoScreenshot=logo.getScreenshotAs(OutputType.FILE);

    String date=new SimpleDateFormat("yyyy-MM-dd/hh-mm-ss").format(new Date());

    String path="test-output\\Screenshots\\logoScreenshot1"+date+".png";

    System.out.println(path);

    FileUtils.copyFile(logoScreenshot,new File(path));


}
}
