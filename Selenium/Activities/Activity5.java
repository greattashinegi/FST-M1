package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title--->"+driver.getTitle());
        boolean checkbox;
        checkbox=driver.findElement(By.xpath("//input[@class = 'willDisappear']")).isDisplayed();
        System.out.println("Checkbox is displayed-->"+checkbox);
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Checkbox is displayed22-->"+checkbox);
        driver.findElement(By.id("toggleCheckbox")).click();
        boolean selectedCheckbox;
        selectedCheckbox=driver.findElement(By.xpath("//input[@class = 'willDisappear']")).isSelected();
        System.out.println("checkbox is selected????"+selectedCheckbox);
        driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
        System.out.println("checkbox is selected now????"+selectedCheckbox);

Boolean textenabled;
        textenabled= driver.findElement(By.id("dynamicText")).isEnabled();
        System.out.println("text field is enabled???"+textenabled);
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("text field is enabled???2222"+textenabled);
        driver.close();

    }
}
