package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHomePage 
{

	@FindBy(id="user-dropdown-toggle")
	private WebElement profilesettings;
	
	@FindBy(xpath="//span[@class='DashUserDropdown-linkIcon Icon Icon--medium Icon--analytics']")
	private WebElement profile;
	
	public AccountHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Profile1()
	{
		profilesettings.click();
	}
	public void profile() 
	{
		profile.click();	
	}
	

}






	


