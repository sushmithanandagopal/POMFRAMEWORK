package pom1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MomentsPage {
	@FindBy(xpath="//a[@title='Sports']")
	private WebElement createMoment;

	public MomentsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void news()
	{
	createMoment.click();
	}
	
}


