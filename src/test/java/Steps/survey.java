package Steps;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import utility.excel;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class survey {
    static WebDriver driver;
    excel obj=new excel("src/test/java/utility/New response4.xlsx");

    @BeforeAll
    public static void before(){
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://docs.google.com/forms/d/e/1FAIpQLSdENHTjy552D1Cv1qKfvJ_zSMZXnRZWXcUBQRzw1E3x192fxQ/viewform");
    }

    @Given("survey {int}")
    public void survey(int row) throws InterruptedException {
        String que1 = obj.getCellValue(row,0);
        String que2 = obj.getCellValue(row,1);
        String que3 = obj.getCellValue(row,2);
        String que4 = obj.getCellValue(row,3);
        String que5 = obj.getCellValue(row,4);
        String que6 = obj.getCellValue(row,5);
        String que7 = obj.getCellValue(row,6);
        String que8 = obj.getCellValue(row,7);
        String que9 = obj.getCellValue(row,8);
        String que10= obj.getCellValue(row,9);
        String que11= obj.getCellValue(row,10);
        String que12= obj.getCellValue(row,11);
        String que13= obj.getCellValue(row,12);
        String que14= obj.getCellValue(row,13);
        String que15= obj.getCellValue(row,14);
        String que16= obj.getCellValue(row,15);
        String que17= obj.getCellValue(row,16);

        System.out.println(que1);
        System.out.println(que2);
        System.out.println(que3);
        System.out.println(que4);
        System.out.println(que5);
        System.out.println(que6);
        System.out.println(que7);
        System.out.println(que8);
        System.out.println(que9);
        System.out.println(que10);
        System.out.println(que11);
        System.out.println(que12);
        System.out.println(que13);
        System.out.println(que14);
        System.out.println(que15);
        System.out.println(que16);
        System.out.println(que17);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Q1) How would you summarise your')]/../../..//input")).sendKeys(que1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'How could your lecturers/tutors')]/../../../..//input")).sendKeys(que2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'In what ways, if any, have your tutors demonstrated commitment to')]/../../../../..//input")).sendKeys(que3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'How could your academic tutors')]/../../../..//input")).sendKeys(que4);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Q5')]/../../../..//input")).sendKeys(que5);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Q6')]/../../../..//input")).sendKeys(que6);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Q7')]/../../../..//input")).sendKeys(que7);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Q8')]/../../../..//input")).sendKeys(que8);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Q9')]/../../../..//input")).sendKeys(que9);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Q10')]/../../../..//input")).sendKeys(que10);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Q11')]/../../../../..//input")).sendKeys(que11);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[contains(text(),'Q12')]/../../../../..//input")).sendKeys(que12);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Choose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option']//span[text()='"+que13+"']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Q14')]/../../../..//span[text()='Choose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option']//span[text()='"+que14+"']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Q15')]/../../../..//span[text()='Choose']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role='option']//span[text()='"+que15+"']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Q16')]/../../../..//span[text()='"+que16+"']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'})", driver.findElement(By.xpath("//span[contains(text(),'Q17')]/../../../..//span[text()='"+que17+"']")));
        driver.findElement(By.xpath("//span[contains(text(),'Q17')]/../../../..//span[text()='"+que17+"']")).click();
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        driver.navigate().to("https://docs.google.com/forms/d/e/1FAIpQLSdENHTjy552D1Cv1qKfvJ_zSMZXnRZWXcUBQRzw1E3x192fxQ/viewform");
        Thread.sleep(100000);
    }
}
