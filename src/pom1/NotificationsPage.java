package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationsPage {
	
	@FindBy(xpath="//span[contains(@class,'Icon Icon--notifications Icon--large')]")
	private WebElement Notifications;
	
	
	public NotificationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void notificationsb()
	{
		Notifications.click();	
	}

}
