package pom1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="search-query")
	private WebElement Search;
	@FindBy(xpath="//a[@class='fullname ProfileNameTruncated-link u-textInheritColor js-nav']")
	private WebElement context;
	
	@FindBy(xpath="//button[@class='Icon Icon--medium Icon--search nav-search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//span[@class='text'][contains(text(),'Moments')]")
	private WebElement Mom;
	
	@FindBy(xpath="//input[@class='fullname ProfileNameTruncated-link u-TextInheritColr js-nav']")
	private WebElement name;

	@FindBy(xpath="//span[@class='Icon Icon--dm Icon--large']")
	private WebElement msg;
	
	@FindBy(xpath="//span[@class='text'][contains(text(),'Tweet')]")
	private WebElement Tweet1;
	
	@FindBy(xpath="//div[@name='tweet']")
	private WebElement Entertx;
	
	@FindBy(xpath="//a[@id='user-dropdown-toggle']")
	private WebElement profile;
	
	@FindBy(xpath="//button[contains(text(),'Log out')]")
	private WebElement logout1;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Search(String name)
	{
		Search.sendKeys(name);
	}
	public void Searchb()
	{
		searchbtn.click();
	}
	
	public void Mom()
	{
		Mom.click();
	}
	public void msg()
	{
		msg.click();
	}
	public void profile()
	{
		profile.click();
	}
	public void logout()
	{
		logout1.click();
	}
	
	public void Tweet1()
	{
		Tweet1.click();
	}
	
	
}


