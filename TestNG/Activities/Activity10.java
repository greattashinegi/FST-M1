package TestngActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity10 {
    WebDriver driver;
    Actions builder;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        builder=new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
    }
@Test
public void middleValueTest(){
    driver.findElement(By.id("slider")).click();
    String VolumeMidValue=driver.findElement(By.xpath("//span[@id='value']")).getText();
    Assert.assertEquals("50",VolumeMidValue);
}
@Test
public void maximumValueTest(){
    WebElement slide=driver.findElement(By.id("slider"));
    builder.clickAndHold(slide).moveByOffset(75,0).release().build().perform();
    String volumeLevel=driver.findElement(By.xpath("//span[@id='value']")).getText();
    Reporter.log("Max value: " + volumeLevel);
    Assert.assertEquals(volumeLevel, "100");
}
@Test
public void minimumValueTest(){
    WebElement slide=driver.findElement(By.id("slider"));
    builder.clickAndHold(slide).moveByOffset(-75,0).release().build().perform();
    String volumeLevel=driver.findElement(By.xpath("//span[@id='value']")).getText();
    Reporter.log("Max value: " + volumeLevel);
    Assert.assertEquals(volumeLevel, "0");

}
@Test
public void thirtyPercentTest(){
    WebElement slider = driver.findElement(By.id("slider"));
    //Drag the slider
    builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();

    String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
    Reporter.log("Min value: " + volumeLevel);

    Assert.assertEquals(volumeLevel, "30");
}
@Test
public void eightyPersentTest(){
    WebElement slider = driver.findElement(By.id("slider"));
    //Drag the slider
    builder.clickAndHold(slider).moveByOffset(44, 0).release().build().perform();

    String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
    Reporter.log("Min value: " + volumeLevel);

    Assert.assertEquals(volumeLevel, "80");
}
    @AfterClass
    public void teardown(){
        driver.close();
    }
}
