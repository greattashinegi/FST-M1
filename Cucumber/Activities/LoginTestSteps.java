package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginTestSteps extends baseClass{
    @Given("^User is on Login page$")
    public void UserisonLoginpage(){
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("^User enters username and password$")
    public void Userentersusernameandpassword(){
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("password");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("username")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @When("^Read the page title and confirmation message$")
    public void Readthepagetitleandconfirmationmessage(){
    String title = driver.getTitle();
      System.out.println("title--->"+title);
      String confirmationmsg;
        confirmationmsg=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Confirmation Message--->"+confirmationmsg);
        Assert.assertEquals("Welcome Back, admin",confirmationmsg);
        Assert.assertEquals("Login Form",title);


    }

}
