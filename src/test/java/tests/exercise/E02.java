package tests.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();


        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@*='addElement()']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu=driver.findElement(By.xpath("//button[@*='addElement()']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED");
        }
        //4- Delete tusuna basin
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.xpath("h3"));

        if (addRemoveElement.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");

        }
        Thread.sleep(3000);
        driver.close();
    }
}
