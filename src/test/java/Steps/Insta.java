package Steps;


import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.*;

public class Insta {
    static WebDriver driver;
//    @BeforeAll
//    public static void before(){
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=C:/Users/iamra/AppData/Local/Google/Chrome/User Data");
//        //options.addArguments("--headless=new");
//        driver= new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        driver.get("https://www.instagram.com/i_am_rajveer_/");
//        WebElement element= driver.findElement(By.xpath("//a[contains(text(),' following')]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", element);
//
//    }
    @Given("Search username {string}")
    public void search_username(String string) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@aria-label='Search input']")).clear();
        driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys(string);
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("(//div[text()='Following'])[2]")).click();
            driver.findElement(By.xpath("//button[text()='Unfollow']")).click();
            Thread.sleep(1000);
            System.out.println(string);

        }
        catch (Exception e){
            System.out.println("********************"+string);
        }

        List list=new ArrayList();



    }
}
