package techproed.day05_XpathCssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //amazon sayfasına gidelim


        //city bike aratalım
        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        // sayfayı kapatın
    /*
    Relative Locators
    - above ==> Belirtilen elementin ustunde olan elementi secer
    - below ==> Belirtilen elementin altinda olan elementi secer
    - to_left_of ==> Belirtilen elementin solunda olan elementi secer
    - to_right_of ==> Belirtilen elementin saginda olan elementi secer
    - near ==> Belirtilen elementin yaninda yada yakininda olan elementi secer
      */


}
 }