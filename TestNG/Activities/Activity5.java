package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void getTitle(){
        String title = driver.getTitle();
        System.out.println("Title of the page is" + driver.getTitle());
        Assert.assertEquals("Target Practice", title);
    }
    @Test(groups = {"HeaderTests"})
    public void thirdHeader(){
      String text;
     WebElement textele= driver.findElement(By.id("third-header"));
     text=textele.getText();
     Assert.assertEquals("Third header",text);
    }
    @Test(groups = {"HeaderTests"})
    public void colorFifthHeader(){
        WebElement header5=driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }
    @Test(groups ={"ButtonTests"})
    public void oliveButton(){
        String textOlive;
        WebElement textOliveele= driver.findElement(By.xpath("//button[contains(@class,'olive')]"));
        textOlive=textOliveele.getText();
        Assert.assertEquals("Olive",textOlive);
    }
    @Test(groups = {"ButtonTests"})
    public void firstButtonethirdRow(){
        WebElement header5=driver.findElement(By.xpath("//button[contains(@class,'brown')]"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(255, 255, 255)");
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
