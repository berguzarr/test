package techproed.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02Submit {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate edip iphone aratalim
        WebElement ara =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        ara.sendKeys("iphone");


        //Sayfayi kapatalim
        driver.close();




    }
}
