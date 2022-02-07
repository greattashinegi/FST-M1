package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page is"+driver.getTitle());
        String parentWindow=driver.getWindowHandle();
        System.out.println("parent Window:" +parentWindow);
        WebElement newTab=driver.findElement(By.id("launcher"));
        newTab.click();
        Set<String> allwindowhandles =driver.getWindowHandles();
        System.out.println("All window handles"+allwindowhandles);

        for(String handle :driver.getWindowHandles()){
            driver.switchTo().window(handle);

            System.out.println("11111parent window"+driver.getWindowHandle());
           // wait.until(ExpectedConditions.titleIs("Newtab2"));
            driver.switchTo().window(handle);
            System.out.println("2nd New Tab Title is: " + driver.getTitle());
            String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
            System.out.println("New tab heading is: " + newTabText);
        }
    }
}
