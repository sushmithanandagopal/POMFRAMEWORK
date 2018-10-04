package script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_Consant;
import generics.Excel;
import pom1.LoginPage;
import pom1.TwitterAdsPage;



public class TwitterAds implements Auto_Consant
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

public static void main(String[] args) throws Exception 
	{
	String us = Excel.Details(excelpath,"Sheet1",1,0);
	String pass = Excel.Details(excelpath,"Sheet1",0,1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login/");
		LoginPage l=new LoginPage(driver);
		TwitterAdsPage p=new TwitterAdsPage(driver);
		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		p.Profile1();
		p.profile();
		driver.close();
		
	}
}
