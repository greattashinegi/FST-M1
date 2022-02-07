package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page is"+driver.getTitle());
        driver.findElement(By.cssSelector("button#simple")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.cssSelector("button#confirm")).click();
        alert=driver.switchTo().alert();
        System.out.println("text in alert"+alert.getText());
        alert.accept();
        driver.findElement(By.cssSelector("button#confirm")).click();
        alert=driver.switchTo().alert();
        alert.dismiss();
        driver.findElement(By.cssSelector("button#prompt")).click();
        alert=driver.switchTo().alert();
        alert.sendKeys("yes");
        alert.accept();
        driver.close();


    }
}
