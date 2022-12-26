package Day07_IframeWindowshandle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C03_WindowHandles extends BaseTest {
       //    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
       //    Print the existing windowHandles ids by clicking all the links on the page.
       //    Click on the links that open a new page.
       //    Close other pages other than the home page.
       //    Set the driver back to the main page.

    @Test
    public void windowHandle(){
        //    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        //Daha sonra kullanabilmek adina ana sayfa id mizi sakliyoruz
        String homePage=driver.getWindowHandle();

        //    Print the existing windowHandles ids by clicking all the links on the page.
        // Yeni sekmeler olusturmak adina target = _blank olan linklerden 2 tanesine tikliyoruz

        List<WebElement> links=driver.findElements(By.xpath("//a[@target='_blank']"));

        links.get(0).click();

        links.get(1).click();

        //Iterate etmek icin (gezinmek icin) tum tab ve window id lerini bir set icinde sakliyoruz
        Set<String> windows=driver.getWindowHandles();

        //gezinme için ıterator objesini olusturuyoruz
        Iterator<String> iterator=windows.iterator();

        //    Close other pages other than the home page.

        //gezinme işlemi
        while (iterator.hasNext()){

            //herbir gezinilen id kullanarak o anki sekmeye switch ediyoruz
            driver.switchTo().window(iterator.next());

            //Switch ettigimiz sayfanin ana sayfa olup olamdigini kontrol ediyoruz. Ana sayfa ise sekmeyi kapatmiyoruz degilse kapatiyoruz
            if( driver.getWindowHandles().equals(homePage)){

                //driver close yi es geçiyoruz
                continue;
            }
            //sekmeyi kapatıyoruz
            driver.close();
        }







    }
}
