package my_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
      // https://techproeducation.com/ sayfasina gidelim
       // driver.get("https://techproeducation.com/");
        driver.navigate().to("https://techproeducation.com/");
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

       //Amazon sayfasinin basligini yazdiralim
        System.out.println("Amazon Sayfa Basligi : " +driver.getTitle());

        //Url'in https://www.amazon.com olduğunu test edelim
        System.out.println("Amazon linki:"+ driver.getCurrentUrl());

        //Sayfayı kapatalım
    }
}
