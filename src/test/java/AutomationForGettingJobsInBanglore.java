import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class AutomationForGettingJobsInBanglore {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String str="";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("clarivate analytics");
        driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//a//h3)[1]")).click();

        driver.findElement(By.xpath("//div[@id=\"onetrust-close-btn-container\"]//button[@aria-label=\"Close\"]")).click();

        driver.findElement(By.xpath("//a[text()='Careers']")).click();
        Set<String> windows=driver.getWindowHandles();
        for(String win:windows){
            driver.switchTo().window(win);
        }
        driver.findElement(By.xpath("//input[@id=\"typehead\"]")).sendKeys("Bangalore");
        String num=driver.findElement(By.xpath("(//div[contains(text(),'Bangalore')]//span)[3]")).getText();
        num=num.trim();
        num=num.substring(1,num.length()-6);

        driver.findElement(By.xpath("//div[contains(text(),'Bangalore')]")).click();
        Thread.sleep(2000);
        List <WebElement> jobs=driver.findElements(By.xpath("//div//h2[text()='Nearby jobs']/..//div//div[@role='listitem']"));
        int jobCount=jobs.size();
        Assert.assertEquals(Integer.parseInt(num),jobCount);
        driver.quit();

    }
}
//
