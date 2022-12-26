package Day10_Codecalenge;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C02_Facebook extends BaseTest {

    /*
    1. "https://facebook.com" adresine gidin.
    2. "Create New Account" butonuna basın.
    3. "firstName" giriş kutusuna bir isim yazın.
    4. "surname" giriş kutusuna bir soyisim yazın.
    5. "email" giriş kutusuna bir email yazın.
    6. "email" onay kutusuna emaili tekrar yazın.
    7. Bir şifre girin.
    8. Tarih için gün seçin.
    9. Tarih için ay seçin.
    10. Tarih için yıl seçin.
    11. Cinsiyeti seçin.
    12. İşaretlediğiniz cinsiyetin seçili, diğer cinsiyet kutularının seçili olmadığını doğrulayın.
    13. Sayfayı kapatın.
*/


    @Test
    public void facebook(){

        driver.get("https://facebook.com");

       // WebElement cookies = driver.findElement(By.xpath("//*[.='Temel ve isteğe bağlı çerezlere izin ver']"));
       // cookies.click();

        WebElement newAccount = driver.findElement(By.linkText("Yeni Hesap Oluştur"));
        newAccount.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

        Faker faker = new Faker();

        String email = faker.internet().emailAddress();
        Actions actions = new Actions(driver);

        actions.click(firstName)
                .sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1, 30))).sendKeys(Keys.TAB)
                .sendKeys("May").sendKeys(Keys.TAB)
                .sendKeys(String.valueOf(faker.number().numberBetween(1970, 2000))).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@value='2']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@value='1']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//input[@value='-1']")).isSelected());
    }
    }

