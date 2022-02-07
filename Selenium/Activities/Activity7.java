package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title--->" + driver.getTitle());
        driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String confirmationText;
        confirmationText=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("confirmation message"+confirmationText);
        //signup
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("Tashi");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");
        //driver.findElement(By.xpath("//label[@text='Confirm Password']/following::input")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("password");
       // driver.findElement(By.xpath("//label[contains(@text,'mail')]/following::input")).sendKeys("tashi@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'email-')]")).sendKeys("tashi@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        String confirmationSignup;
        confirmationSignup=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("confirmation sign up message"+confirmationSignup);

        driver.close();

    }
}
