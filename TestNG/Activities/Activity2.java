package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
      public void title() {
        String title = driver.getTitle();
        System.out.println("Title of the page is" + driver.getTitle());
        Assert.assertEquals("Target Practice", title);
    }
@Test
public void blackButton(){
    WebElement bbutton=driver.findElement(By.xpath("//button[contains(@class,'black')]"));
    Assert.assertEquals("blue",bbutton.getText());
}
@Test(enabled = false)
        public void skipped(){
    System.out.println("Skipped");
}
    @Test
    public void skipClass() throws SkipException
    {
         throw new SkipException("Not ready for testing");
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
