package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{////li[@class='current-user']//a[@class='js-nav']
	@FindBy(xpath="//li[@class='current-user']")
	private WebElement profile1;
	
	@FindBy(xpath="//span[contains(text(),'Edit profile')]")
	private WebElement Edit;
	
	@FindBy(xpath="//span[contains(@class,'ProfileNav-value')][contains(text(),'5')]")
	private WebElement Follow;
	
	@FindBy(xpath="//button[contains(text(),'Keyboard shortcuts')]")
	private WebElement Keys;
	
	@FindBy(xpath="//div[@id='doc']")
	private WebElement Help;
	
	@FindBy(xpath="//li[@class='current-user nightmode-toggle']")
	private WebElement mode;
	
	@FindBy(xpath="//a[@class='user-dropdown-analytics']")
	private WebElement On;
	
	////body[contains(@class,'three-col logged-in user-style-vijay0323 ms-windows enhanced-mini-profile ProfilePage ProfilePage--withWarning supports-drag-and-drop')]/div[@id='doc']/div[@id='page-outer']/div[@id='page-container']/div[contains(@class,'AppContainer')]/div[contains(@class,'AppContent-main content-main u-cf')]/div[contains(@class,'Grid Grid--withGutter')]/div[contains(@class,'Grid-cell u-size2of3 u-lg-size3of4')]/div[contains(@class,'Grid Grid--withGutter')]/div[contains(@class,'')]/div[contains(@class,'Grid Grid--withGutter js-empty-timeline')]/div[contains(@class,'Grid-cell')]/div[contains(@class,'ProfileEmptyTimeline')]/div[3]/div[2]/button[1]
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Profile1()
	{
		profile1.click();
	}
	public void Edit()
	{
		Edit.click();
	}
	public void Follow()
	{
		Follow.click();
	}
	public void Keys()
	{
		Keys.click();
	}
	public void Help()
	{
		Help.click();
	}
	public void mode()
	{
		mode.click();
	}
	public void On()
	{
		On.click();
	}
}
