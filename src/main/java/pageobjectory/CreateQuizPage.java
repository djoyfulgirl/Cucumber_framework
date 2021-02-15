package pageobjectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateQuizPage {
	WebDriver driver;
	
	public CreateQuizPage(WebDriver driver){
	     this.driver = driver;
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//header/nav[1]/section[1]/ul[1]/li[3]/a[1]")
	private WebElement LibraryTab;
	
	public void LibraryTab(){
		LibraryTab.click();
	}
	
	@FindBy(xpath="//a[@id='dropdown-create']")
	private WebElement CreateNew;
	
	public void CreateNew(){
		CreateNew.click();
	}
	
	@FindBy(xpath="//ul[@id='drop1']/li[4]/a")
	private WebElement Quiz;
	
	public void Quiz(){
		Quiz.click();
	}
}
