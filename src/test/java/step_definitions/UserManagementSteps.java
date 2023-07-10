package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogInPage;
import utilities.DataReader;
import utilities.Driver;

public class UserManagementSteps {
	
	LogInPage loginPage = new LogInPage();
	
	@Given("AS a user, i am on the login page")
	public void as_a_user_i_am_on_the_login_page() {
	    Driver.getDriver().get(DataReader.getProperty("appUrl"));
	}
	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		loginPage.emailField.sendKeys("username");
		loginPage.passField.sendKeys("password");
	    }
	@When("i click on the login button")
	public void i_click_on_the_login_button() {
	    loginPage.loginBtn.click();
	}
	@Then("i should be on user profile page")
	public void i_should_be_on_user_profile_page() {
		Assert.assertTrue(loginPage.NameVerification.isDisplayed());
	    loginPage.NameVerification.isDisplayed();
	}
}
