package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@class='js-username-field email-input js-initial-focus']")
	private WebElement emailaddress;
	

	
	@FindBy(xpath="//input[@class='js-password-field']")
	private WebElement password;
	
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
public void emailaddtb(String email)
{
	emailaddress.sendKeys(email);
}
public void passwordtb(String pass )
{
	password.sendKeys(pass);
}
public void login()
{
	loginbtn.click();
}

}
