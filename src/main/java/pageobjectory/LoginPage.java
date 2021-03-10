package pageobjectory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	String filepath = System.getProperty("user.dir")+ "\\config\\file.properties";
	File file;
	FileInputStream fileInput;
	Properties prop;
	
	public LoginPage(WebDriver driver){
	     this.driver = driver;
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'sign in')]")
	private WebElement SignButton;
	
	@FindBy(xpath="//body/div[@id='sign-in-modal']/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	private WebElement UserName;
	
	@FindBy(xpath="//body/div[@id='sign-in-modal']/div[1]/div[3]/div[1]/div[1]/div[1]/input[2]")
	private WebElement Password;
	
	@FindBy(xpath="//body/div[@id='sign-in-modal']/div[1]/div[3]/div[1]/div[1]/div[1]/input[4]")
	private WebElement LoginButton;
	
	public void getSignButton(){
		SignButton.click();
	}
	
	public void SetUserName(String username){
		UserName.sendKeys(username);
	}
	
	public void SetPassword(String password){
		Password.sendKeys(password);
	}
	
	public void getLoginButton(){
		LoginButton.click();
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/a[1]")
	private WebElement ToastButton;
	
	public void getToastButton(){
		ToastButton.click();
	}

	public void loginToPage() throws IOException, InterruptedException{
		fileInput = new FileInputStream(filepath);
        prop = new Properties();
		prop.load(fileInput);
		getSignButton();
		Thread.sleep(2000);
		SetUserName(prop.getProperty("UserName"));
		Thread.sleep(2000);
		SetPassword(prop.getProperty("Password"));
		Thread.sleep(2000);
		getLoginButton();
		Thread.sleep(2000);
	}

	public void pause(Integer milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
