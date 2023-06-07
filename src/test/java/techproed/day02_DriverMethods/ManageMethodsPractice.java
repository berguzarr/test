package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ManageMethodsPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanin konumu:" + driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanin boyutlari:"+ driver.manage().window().getSize());

        //Browser'i maximize yapalim
       driver.manage().window().maximize();

        //Techpro sayfasina gidelim
        driver.get("https://techproeducation.com");

        // Browser'in konumunu yazdiralim
        System.out.println("Browser'in Konumu:"+ driver.manage().window().getPosition());

        // Browser'in boyutlarini yazdiralim
        System.out.println("Browser'in Boyutlari:"+driver.manage().window().getSize());

        //Sayfayı minimize yapalım
       driver.manage().window().minimize();

       //Sayfayı fullscreen yapalım
       driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir


      //sayfayi kapatalim
        driver.close();

    }
}
