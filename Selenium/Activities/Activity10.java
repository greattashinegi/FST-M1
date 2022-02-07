package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Activity10 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page is"+driver.getTitle());
        WebElement areaToclick= driver.findElement(By.id("wrapD3Cube"));
        System.out.println("class name"+areaToclick.getText());
        Actions builder=new Actions(driver);
        //leftclick
        builder.click(areaToclick);
        WebElement value= driver.findElement(By.className("active"));
        System.out.println("class name leftclick"+value.getText());
        //DoubleClick
        builder.doubleClick(areaToclick).perform();
        value= driver.findElement(By.className("active"));
        System.out.println("class name DoubleClick"+value.getText());
        //right click
        builder.contextClick(areaToclick).perform();
        value= driver.findElement(By.className("active"));
        System.out.println("class name right click"+value.getText());

        //name initial
        WebElement initial=driver.findElement(By.id("keyPressed"));
         Action nameseq= builder.sendKeys("T").build();
        nameseq.perform();
        System.out.println("Pressed key is: " + initial.getText());

        //ctrla+ctrl c
        Action seq2=builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        seq2.perform();
        System.out.println("2222Pressed key is: " + initial.getText());

        driver.close();


    }
}
