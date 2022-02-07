package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title--->"+driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tashi");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Rautela");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("negi.tashi@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9704968692");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println("text in alert---->"+alert.getText());
        driver.close();
    }
}
