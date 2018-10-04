package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTweetPage 
{
	@FindBy(xpath="//div[@id='tweet-box-home-timeline']")
	private WebElement Tweet;
	
	@FindBy(xpath="//span[@class='button-text tweeting-text']")
	private WebElement Enter;
	////form[@id='swift_tweetbox_1538314578895']//div[@class='TweetBoxToolbar-tweetButton tweet-button']//button[@type='button']
	
	public NewTweetPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void Tweet(String name)
	{
		Tweet.click();
		Tweet.sendKeys(name);
		
	}
	public void Enter()
	{
		Enter.click();
	}
	

}
