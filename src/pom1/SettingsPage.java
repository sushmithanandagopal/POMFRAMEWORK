package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage 
{////li[@class='current-user']//a[@class='js-nav']
	//li[@class='active']//a[@class='list-link js-nav']
	@FindBy(xpath="//li[@class='current-user']")
	private WebElement profile1;
	
	@FindBy(xpath="//a[contains(text(),'Settings and privacy')]")
	private WebElement Set;
	
	@FindBy(xpath="//li[contains(@class,'active')]")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='user_screen_name']")
	private WebElement usn;
	
	
	public SettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Profile1()
	{
		profile1.click();
	}
	public void Set()
	{
		Set.click();
	}
	public void mobile()
	{
	mobile.click();	
	}
	public void usn(String name)
	{
	usn.clear();
	usn.sendKeys(name);
	}
}

