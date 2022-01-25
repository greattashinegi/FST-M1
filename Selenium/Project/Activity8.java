package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;
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
    public void contactAdmin() {
        driver.findElement(By.linkText("Contact")).click();
        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Tashi");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("Tashi@gmail.com");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Message comments");

        driver.findElement(By.id("wpforms-submit-8")).click();
        String confirmationText=driver.findElement(By.id("wpforms-confirmation-8")).getText();
        System.out.println("confirmationText--->" + confirmationText);
        Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.", confirmationText);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
