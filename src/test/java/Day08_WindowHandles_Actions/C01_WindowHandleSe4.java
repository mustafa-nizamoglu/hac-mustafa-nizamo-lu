package Day08_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {
    @Override
    public void tearDown() {

    }

    //// https://testproject.io/
//
//// https://blog.testproject.io/
    @Test
    public void newWindow(){

        //ana sekmemize url i ziyaret ediyoruz
        driver.get("https://testproject.io/");

        //yeni pencere olusturup o pencereye switch ediyoruz
        driver.switchTo().newWindow(WindowType.WINDOW);

        //yeni penceremizde url imizi ziyaret ediyoruz
        driver.get("https://blog.testproject.io/");

    }
    @Test
    public  void newTab(){
        //"https://www.amazon.com/"
        driver.get("https://blog.testproject.io/");

        WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://www.amazon.com/");

        //Aktif tab in title i yazdırıldı
        System.out.println(driver.getTitle());
    }

    @Test
    public void handleWindows(){

        driver.get("https://www.amazon.com/");

        String homePageHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);

        //yeni sekmemizde amazon tr yi actık
        driver.get("https://www.amazon.com.tr/");

        //yeni pencere oluşturduk
        driver.switchTo().newWindow(WindowType.WINDOW);

        //yeni pencerede google gittik
        driver.get("https://www.google.com/");


        Set<String> handles=driver.getWindowHandles();
        Iterator<String> i=handles.iterator();

      while (i.hasNext()){
          String currentTab=i.next();

          driver.switchTo().window(currentTab);

          System.out.println(driver.getTitle());



 // 1. yol
           // if (!driver.getWindowHandle().equals(homePageHandle)){
           //     driver.close();
           //  }




        //    2. yol


          if (!driver.getTitle().contains("Spend")){
              driver.close();
          }

      }

    }

}
