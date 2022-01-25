package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void checkHeader() {
        String header = driver.findElement(By.xpath("//h1[contains(@class,'title')]")).getText();
        System.out.println("header of the page is" + header);
        Assert.assertEquals("Learn from Industry Experts", header);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
