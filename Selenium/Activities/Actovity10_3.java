package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actovity10_3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/drag-drop");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ballposition=driver.findElement(By.id("draggable"));
        WebElement dropZone1=driver.findElement(By.id("droppable"));
        WebElement dropZone2=driver.findElement(By.id("dropzone2"));
        Actions action=new Actions(driver);
        action.dragAndDrop(ballposition,dropZone1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone1,"background-color"));
        System.out.println("dropzone1");

        action.dragAndDrop(ballposition,dropZone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropZone2,"background-color"));
        System.out.println("dropzone2");
        driver.close();
    }
}
