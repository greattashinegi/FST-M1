package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/selenium/tables");
        System.out.println("Title--->" + driver.getTitle());
        List<WebElement> numofRows=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println("Rows:"+numofRows.size());
        List<WebElement> numofCols=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println("Columns:"+numofCols.size());

        List<WebElement> thirdRow=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        for(WebElement ele:thirdRow)
            System.out.println("Cell value"+ele.getText());

       WebElement secondRowSCol=driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
             System.out.println("Second Row Second Col"+secondRowSCol.getText());

        List<WebElement> numofRows1=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Rows1:"+numofRows1.size());
        List<WebElement> numofCols1=driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("Columns1:"+numofCols1.size());
        WebElement secondRowSCol1=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second Row Second Col:"+secondRowSCol1.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        WebElement secondRowSCol1after=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second Row Second Col:"+secondRowSCol1after.getText());

        WebElement tfoot=driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("tfoot"+tfoot.getText());
             driver.close();
        }

    }

