package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title--->"+driver.getTitle());
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        WebElement checkboxToggle=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        checkboxToggle.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        Boolean checkboxDisplayed;
        checkboxDisplayed= checkbox.isDisplayed();
        System.out.println("Displayed????"+checkboxDisplayed);
        checkboxToggle.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        System.out.println("Displayed????2222"+checkboxDisplayed);
        driver.close();
    }
}
