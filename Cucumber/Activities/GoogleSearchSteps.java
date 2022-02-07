package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.SQLOutput;

public class GoogleSearchSteps extends baseClass{
    @Given("^User is on Google Homepage$")
    public void userinGooglePage() throws Throwable {
        driver.get("https://www.google.com/");
    }
@When("^User types in Cheese and hits ENTER$")
public void userTypesCheeseAndhitsEnter() throws Throwable{
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
    }

    @Then("^Show how many search results were shown$")
    public void Showhowmanysearchresultswereshown()throws Throwable{
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats=driver.findElement(By.id("result-stats")).getText();
        System.out.println("The text---->"+resultStats);
    }
}
