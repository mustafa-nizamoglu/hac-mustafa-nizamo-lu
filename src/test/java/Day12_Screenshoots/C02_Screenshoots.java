package Day12_Screenshoots;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import utilities.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_Screenshoots extends BaseTest {

    @Test
    public void getPageScreenshot() throws IOException {
        driver.get("https://www.n11.com/");

        File kaynak=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(kaynak,new File("test-output\\Screenshots\\n11Screenshot.png"));

    }

    @Test
    public void getElementScreenshot() throws IOException {
        /*
        Go to URL: https://opensource-demo.orangehrmlive.com/
        Saving the image to  the path.
        Getting screenshot of Orange HRM Logo.
        Getting screenshot of  Orange HRM Page Section
         */
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo=driver.findElement(By.className("orangehrm-login-branding"));

        File logoScreenshot=logo.getScreenshotAs(OutputType.FILE);

       String date=new SimpleDateFormat("yyyy-MM-dd/hh-mm-ss").format(new Date());

       String path="test-output\\Screenshots\\logoScreenshot"+date+".png";

        System.out.println(path);

        FileUtils.copyFile(logoScreenshot,new File(path));


    }
}
