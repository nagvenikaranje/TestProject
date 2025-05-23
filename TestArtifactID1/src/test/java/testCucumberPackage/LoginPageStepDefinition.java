package testCucumberPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {
	
	WebDriver driver;
	
    @Given("I am the user of facebook application")
    public void i_am_the_user_of_facebook_application()
    {
        System.setProperty("webdriver.chrome.driver","C:\\java\\javaworkspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
    }
    
    @When("I enter username as {string}")
    public void i_enter_username_as(String username)
    {
    	driver.findElement(By.id("email")).sendKeys(username);
    }
    
    @When("I enter password as {string}")
    public void i_enter_password_as(String password)
    {
    	driver.findElement(By.id("pass")).sendKeys(password);
    }
    
    @Then("I should be able to login successfully")
    public void I_should_be_able_to_login_successfully()
    {
    	System.out.println("User logged in successfully");
    }
    
    @Then("I should not be able to login successfully")
    public void I_should_not_be_able_to_login_successfully()
    {
    	System.out.println("User did not logged in successfully");
    }
    
    @When("I enter the user credUsername {string}")
    public void i_enter_the_user_cred_username(String username)
    {
    	driver.findElement(By.id("email")).sendKeys(username);
     }
    
    @When("I enter the user credPassword {string}")
    public void i_enter_the_user_cred_password(String password)
    {
    	driver.findElement(By.id("pass")).sendKeys(password);
     }
    
    
}

