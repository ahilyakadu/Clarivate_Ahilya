import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AutomationForGettingTitles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String str="";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        List<WebElement> titles = driver.findElements(By.xpath("//*[@title]"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result_titles.txt"))) {
        for (WebElement title : titles) {
str=title.getAttribute("title");
                writer.write(str);
                writer.newLine();
            }
                    driver.quit();
        } catch (IOException e) {
        e.printStackTrace();
}

    }
}
