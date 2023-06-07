package Practices.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//Amazon sayfasina gidelim

        driver.get("https://www.amazon.com");  //1.yol

                //driver.navigate().to("https://www.amazon.com");//2. yol

                //String amazonUrl="https://www.amazon.com";//3.yol
                //driver.get(amazonUrl);

                //Sayfa basligini(title) yazdirin
                System.out.println("Amazon Sayfa Basligi: "+driver.getTitle());
                Thread.sleep(3000);

                //Sayfa basliginin "Amazon" icerdigini test edin
                String actualTitle=driver.getTitle();
                String expectedTitle="Amazon";
                if(actualTitle.contains(expectedTitle)){
                    System.out.println("Test PASSED");
                }else
                    System.out.println("Test FAILED");

                //Sayfa adresini(url) yazdirin
                System.out.println("Amazon Sayfa Url: "+driver.getCurrentUrl());

                //Sayfa url'inin "amazon" icerdigini test edin.
                String actualUrl=driver.getCurrentUrl();
                String expectedUrl="https://www.amazon.com";
                if(actualUrl.contains(expectedUrl)){
                    System.out.println("Test Passed");
                }else System.out.println("Test Failed");

                //Sayfa handle degerini yazdirin
                driver.getWindowHandle();

                //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
                driver.getPageSource();
                String actualWord=driver.getPageSource();
                String expectedWord="Gateway";
                if(actualWord.contains(expectedWord)){
                    System.out.println("Test PASS");
                }else System.out.println("Test FAIL");

                //Sayfayi kapatin
                driver.close();

            }
        }
