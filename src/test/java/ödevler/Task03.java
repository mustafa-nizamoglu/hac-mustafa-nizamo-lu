package ödevler;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

import java.util.List;

public class Task03 extends BaseTest {
 /*   - https://demoqa.com/select-menu sitesine gidin
            - multiple <select> elementini locate edin
- getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina:
            * Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin

  */

    @Test
    public void Task03() {
        driver.get("https://demoqa.com/select-menu");


        //    - multiple <select> elementini locate edin
        WebElement dropDown = driver.findElement(By.id("cars"));
        Select select = new Select(dropDown);

        //    - getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina
        //* Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin


        select.selectByValue("volvo");
        select.selectByIndex(2);
        select.selectByValue("audi");

        //getFirstSelectedOption() methodu
        System.out.println("getFirstSelectedOption(): " + select.getFirstSelectedOption().getText());

        Assert.assertTrue(select.getFirstSelectedOption().isSelected());
        System.out.println();


        //getOptions() methodu
        System.out.println("getOptions(): ");
        select.getOptions().forEach(t -> System.out.print(t.getText() + " "));

        List<WebElement> options = select.getOptions();

        Assert.assertTrue(options.get(0).isSelected());
        Assert.assertFalse(options.get(1).isSelected());
        Assert.assertTrue(options.get(2).isSelected());
        Assert.assertTrue(options.get(3).isSelected());
        System.out.println("\n");

        //getAllSelected() methodu

        select.selectByIndex(2);

        List<WebElement>allSelect=select.getAllSelectedOptions();

        System.out.println("getAllSelected(): ");
        allSelect.forEach(x-> System.out.print(x.getText() + " "));


    }

}
