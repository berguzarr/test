package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        /*
    implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
    maximum 20 saniye bekler. Eger 2 saniyede olusursa 2 saniye bekler ve alt satira gecer . Fakat belirttigimiz
    sure boyunca internetten ya da sayfadan kaynakli webElementler olusmazsa testimiz "FAIL" verir
    Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
    30 saniye bekler ve alt satira gecer .

            *implicitlyWait sayfa açılır açılmaz alt satıra geçiyor belirlediğimiz süreyi beklemiyor
            *Thread.sleep Belirttiğimiz sürenin bitmesini bekler.

 */
        //SORU

        String techproedUrl ="https://techproeducation.com";
        String amazonUrl = "https://amazon.com";
        //techproed sayfasina gidelim
        driver.get("https://techproeducation.com");
        //amazona gidelim
        driver.get(amazonUrl);
        //techpro sayfasina geri donelim
        driver.navigate().back();
        // sayfa basligini techpro icerdigini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle ="techpro";  //t buyuk oldugunda "test PASSED" olur.
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }
        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //sayfa basligini Amazon icerdigini test edelim
        if(driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //String'e asign ederek veye tek seferde de yazabiliriz.
    }
}
