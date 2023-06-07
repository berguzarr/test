package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
/*
        webElement.getTagName( ); Web elementin tag ismini getirir.
                Bir HTML koduna inspect ile baktik. Tag name'nin input oldugunu gorduk. getTagName() bize
        input'u verir.


        webElement.getAttribute("Att.ismi" ); Ismi girilen attribute'un degerini getirir.
        Ayni HTML koduna baktik ve id olan attribute'u gorduk. Bu id attribute'i getAttribute() parantezi
        icine yazarsak bize value'su olan twotabsearchtextbox'i verir.

 */

        //Amazon.comsayfasina gidelim(https://www.amazon.com
        driver.get("https://www.amazon.com");

        //Arama kutusunu locate ediniz
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName =aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //arama kutusunun  name attribute'nun degerinin "field-keywords" oldugunu test edin
        String actualAttribute =aramaKutusu.getAttribute("name");
        String expectedAttribute ="field-keywords";
        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //sayfayi kapatin
        driver.close();
    }

}