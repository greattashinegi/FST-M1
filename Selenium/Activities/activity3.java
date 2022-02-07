package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class activity3 {
    public static void main(String[] args)throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://training-support.net/selenium/simple-form");
            System.out.println("Title of the page is" + driver.getTitle());
        WebElement uname=driver.findElement(By.id("firstName"));
                uname.sendKeys("Tashi");

        WebElement lname = driver.findElement(By.id("lastName"));
        lname.sendKeys("Rautela");
        driver.findElement(By.id("email")).sendKeys("negi.tashi@gmail.com");;
        driver.findElement(By.id("number")).sendKeys("9989998909");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        Thread.sleep(1000);
        driver.close();
        }
    }

