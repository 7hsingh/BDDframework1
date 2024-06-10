package stepdefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefinations {
	
	LoginPage lp = new LoginPage();
	
	
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		lp.openBrowser();
	   lp.openLoginPage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
		String ExpectedTitle = title;
		String actualTitle  = lp.Verifytitle();
		System.out.println(actualTitle);
	  Assert.assertEquals(ExpectedTitle, actualTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String pass) throws Throwable {
	 lp.enterUserNamePassword(email, pass);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	 lp.ClickOnLoginbutton();;
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
	    String ExpectedErr = "Epic sadface: Username and password do not match any user in this service";
	    String actualErr = lp.readErr();
	    Assert.assertEquals(ExpectedErr, actualErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
	    lp.closeBrowser();
	}


	
	


}
