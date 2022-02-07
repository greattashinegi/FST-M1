package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertTestSteps extends baseClass{
    Alert alert;
    WebDriver driver=new FirefoxDriver();
    @Given("^User is on the page$")
    public void Userisonthepage() throws Throwable {
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @When("^User clicks the Simple Alert button")
    public void UserclickstheSimpleAlertbutton() throws Throwable{
        driver.findElement(By.id("simple")).click();
    }

    @Then("^Alert opens$")
    public void SimpleAlertopens()throws Throwable{
        alert= driver.switchTo().alert();

    }
    @When("^User clicks the Confirm Alert button$")
    public void UserclickstheConfirmAlertbutton() throws Throwable{
        driver.findElement(By.id("confirm")).click();
}

    @When("^User clicks the Prompt Alert button$")
    public void UserclicksthePromptAlertbutton() throws Throwable{
        driver.findElement(By.id("prompt")).click();
    }

    @And("^Read the text from it and print it$")
    public void readAlert() {
        System.out.println("Alert says: " + alert.getText());
    }
    @And("^Write a custom message in it$")
    public void writeToPrompt() {
        alert.sendKeys("Custom Message");
    }
    @And("^Close the alert$")
    public void closeAlert() {
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closeAlertWithCAncel() {
        alert.dismiss();
    }
}
