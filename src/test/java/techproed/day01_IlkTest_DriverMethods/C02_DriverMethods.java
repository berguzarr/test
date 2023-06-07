package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        //getTitle() Sayfa Basligini verir

        System.out.println("Amazon Actual Title :" +driver.getTitle());
        System.out.println("Amazon Actual Url :" +driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title :" +driver.getTitle());
                         //getTitle()methodu sayfa basligini verir

        //getCurrentUrl() Gidilen sayfanin URL' ini verir
        System.out.println("Techproed Actual Url :" +driver.getCurrentUrl());

        //getPageSource() acilan sayfanin kaynak kodlarini verir
        //System.out.println(driver.getPageSource()); bilerek yoruma aldik. her seferind ekaynak kodunu vermesin diye

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir.
        // Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri :"+ driver.getWindowHandle());//156B7B83BB29C993FACBBE3CBBFDFD5F
    }

}
