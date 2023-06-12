package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class OdevEksik {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //iphone aratınız
        WebElement ara = driver.findElement(By.id("twotabsearchtextbox"));
        ara.sendKeys("iphone");
        ara.submit();
        //çıkan sonuç yazısını konsola yazdırınız
         List<WebElement>  results =  driver.findElements(By.className("sg-col-inner"));
         WebElement sonuc =results.get(0);
         System.out.println(sonuc.getText());

        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
    }
}
