package tests.exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E05 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


      //  3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
       // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        // 5. Sayfa basliginin “Amazon” icerdigini test edin


        if (driver.getTitle().contains("Amazon")) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")) {
            System.out.println("passed");
        }else {
            System.out.println("Failed");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedKelime="alisveris";
        String actualKelime= driver.getPageSource();

        if (actualKelime.contains(expectedKelime)){
            System.out.println("passed");
        }else {
            System.out.println("Failed");
        }

        //10. Sayfayi kapatin.

            Thread.sleep(3000);
            driver.close();


    }
}
