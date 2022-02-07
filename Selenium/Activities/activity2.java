package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the page is"+driver.getTitle());
        WebElement ele=driver.findElement(By.id("about-link"));
        System.out.println("id text"+ele.getText());
        WebElement elecname=driver.findElement(By.className("green"));
        System.out.println("class name"+elecname.getText());
        WebElement elelinktext=driver.findElement(By.linkText("About Us"));
        System.out.println("link name"+elelinktext.getText());
        WebElement elecssSelector=driver.findElement(By.cssSelector(".green"));
        System.out.println("cssselector name"+elecssSelector.getText());
        driver.close();
    }
}
