package stepDefinitions;

import io.cucumber.java.en.And;


public class closeBrowser extends baseClass{
    @And("^Close the browser$")
    public void closeTheBrowser(){
        System.out.println("closing----->");
        driver.close();
    }
}
