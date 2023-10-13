package tests.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) {
  /*
1) Browser açın
2) “http://practice.automationtesting.in/” adresine gidin
3) Sitenin başlığını alıp yazdırın
4) Sitenin url adresini alıp yazdırın
5) Başlığın Practice ve Url'in  ise practice içerip içermediğini test edin
6) Pencereyi kapatın
*/

// Mahşerin 4 Atlısı
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://practice.automationtesting.in/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        if (driver.getTitle().contains("Practice")) {
            System.out.println("Başlık içerisinde Practice kelimesi vardır.\nTest Passed");
        } else {
            System.out.println("Title Test Failed");

        }
        if (driver.getCurrentUrl().contains("practice")) {
            System.out.println("URL practice kelimesi içermektedir.\nTest Passed");
        } else {
            System.out.println("URL Test Failed");

        }
        System.out.println("============ 2. YÖNTEM ============");

        if (driver.getTitle().contains("Practice") && driver.getCurrentUrl().contains("practice")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }
}
