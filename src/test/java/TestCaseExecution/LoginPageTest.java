package TestCaseExecution;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BaseClass.BrowserSetupOne;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjectory.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	String filepath = System.getProperty("user.dir")+ "\\config\\file.properties";
	File file;
	FileInputStream fileInput;
	Properties prop;
	LoginPage lp;
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		fileInput = new FileInputStream(filepath);
        prop = new Properties();
		prop.load(fileInput);
		 driver = BrowserSetupOne.StartBrowser(prop.getProperty("browserName"), prop.getProperty("url"));
		  lp= new LoginPage(driver);
		  lp.pause(5000);
	}

	@Then("^I click on log in button$")
	public void i_click_on_log_in_button() throws Throwable {
	   lp= new LoginPage(driver);
	   lp.getSignButton();
	   lp.pause(5000);
	}

	@Then("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String username) throws Throwable {
	    lp.SetUserName(username);
	    lp.pause(5000);
	}

	@Then("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
	   lp.SetPassword(password);
	   lp.pause(5000);
	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	  lp.getLoginButton();
	  lp.pause(5000);
	}

	@Then("^I verify the title of the page$")
	public void i_verify_the_title_of_the_page() throws Throwable {
		  lp.pause(10000);
	   String gettitle =  driver.getTitle();
	   System.out.println(gettitle);
	   lp.pause(5000);
	   Assert.assertEquals("Dashboard - Content | CK-12 Foundation", gettitle);
	   lp.pause(5000);
	   driver.close();
	}


}
