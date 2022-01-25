package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleMyAccount() {
        driver.findElement(By.linkText("My Account")).click();
        String title=driver.getTitle();
        System.out.println("header of the page is" + title);
        Assert.assertEquals("My Account – Alchemy LMS", title);
    }
    @Test
    public void login() {
        //driver.findElement(By.cssSelector("a[href='#login']")).click();
       // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@href,'#login')]")));
        WebElement ele=driver.findElement(By.xpath("//a[contains(@href,'#login')]"));
        ele.click();
        //driver.findElement(By.xpath("//div[contains(@class,'learndash')]/a")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@href='#login']")));
        //driver.findElement(By.xpath("//a[@href='#login']")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd\n");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String myAccountpage=driver.findElement(By.xpath("//a[contains(@class,'profile-edit'])")).getText();
        System.out.println("header of the page is" + myAccountpage);
        Assert.assertEquals("Edit profile", myAccountpage);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
