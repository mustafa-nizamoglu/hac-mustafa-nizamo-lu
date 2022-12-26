package Day07_IframeWindowshandle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C02_IframeExample extends BaseTest {
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
// Web sitesini maximize yapınız.
// İkinci emojiye tıklayınız.
// Tüm ikinci emoji öğelerine tıklayınız.
// Parent iframe geri dönünüz.
// Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.

    @Test
    public void IframeExample(){

        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // İkinci emojiye tıklayınız.
        driver.switchTo().frame("emojis");


        WebElement secondEmojiTab=driver.findElement(By.xpath("//a[@contains(@href,'nature']"));

        secondEmojiTab.click();

        // Tüm ikinci emoji öğelerine tıklayınız.

        List<WebElement> emojilist=driver.findElements(By.xpath("//div[@id='nature']//img"));

        emojilist.forEach(WebElement::click);

        // Parent iframe geri dönünüz.
        driver.switchTo().defaultContent();

        //Form dolduruluyor
        WebElement text = driver.findElement(By.id("text"));
        text.sendKeys("Text");

        WebElement smiles = driver.findElement(By.id("smiles"));
        smiles.sendKeys("Smiles");

        WebElement nature = driver.findElement(By.id("nature"));
        nature.sendKeys("Nature");

        WebElement food = driver.findElement(By.id("food"));
        food.sendKeys("Food");

        WebElement activities = driver.findElement(By.id("activities"));
        activities.sendKeys("Activities");

        WebElement places = driver.findElement(By.id("places"));
        places.sendKeys("Places");

        WebElement objects = driver.findElement(By.id("objects"));
        objects.sendKeys("Objects");


        WebElement applyButton = driver.findElement(By.id("send"));
        applyButton.click();










    }
}
