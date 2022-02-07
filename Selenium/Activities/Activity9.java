package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Title--->" + driver.getTitle());
        WebElement selectele=driver.findElement(By.id("single-select"));
        Select select = new Select(selectele);
        List<WebElement> options=select.getOptions();
        select.selectByVisibleText(("Option 2"));
        WebElement selectedValue=driver.findElement(By.id("single-value"));
        System.out.println(("visibleText"+selectedValue.getText()));
        select.selectByIndex(3);
        System.out.println(("selectByIndex--->"+selectedValue.getText()));
        select.selectByValue("4");
        System.out.println(("selectByValue---->"+selectedValue.getText()));
        //Activity9.1
        WebElement multiSelect=driver.findElement(By.id("multi-select"));
        Select multiSel =new Select(multiSelect);
        List<WebElement> optionsmulti =multiSel.getOptions();

        WebElement SelectedValuemulti=driver.findElement(By.id("multi-value"));
        multiSel.selectByVisibleText("Javascript");
        System.out.println("selectByVisibleText"+SelectedValuemulti.getText());
        multiSel.selectByValue("node");
        System.out.println("selectByValue"+SelectedValuemulti.getText());
        for(int i=3;i<=6;i++)
             multiSel.selectByIndex(i);
        System.out.println("selectByIndex"+SelectedValuemulti.getText());
        multiSel.deselectByIndex(3);
        multiSel.deselectByValue("node");
        System.out.println("selectByIndex"+SelectedValuemulti.getText());
        driver.close();
    }
}
