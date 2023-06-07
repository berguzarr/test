package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.diver", "src/resources/drivers/chromedriver.exe");
        WebDriver diver = new ChromeDriver();

        //Amazon sayfasina gidelim
        diver.get("https://Amazon.com");

        //Sayfa basliginin amazon icerdigini test edelim
        String actualTitle = diver.getTitle();
        String expectedTitle = "amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test failed");

        //URL'in https://www.amazon.com/ olduğunu test edelim
        String actualUrl = diver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
      if(actualTitle.equals(expectedUrl)){
          System.out.println("Test PASSED");
      }else
          System.out.println("Test failed :" + actualUrl);
        //bir harfi kucuk yazdik ornek amazon yazinca TEST FAILED sonucu yazildi.
        //Sayfayı kapatalım
        diver.close(); //Browser'i kapatir
        //driver.quit(); ==> Birden fazla browser varsa hepsini kapatir
    }
 }
