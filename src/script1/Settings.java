package script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_Consant;
import generics.Excel;
import pom1.HomePage;
import pom1.LoginPage;
//import pom1.ProfilePage;
import pom1.SettingsPage;
public class Settings implements Auto_Consant {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		String us = Excel.Details(excelpath,"Sheet1",1,0);
		String pass = Excel.Details(excelpath,"Sheet1",0,1);
		//String name=Excel.Details(excelpath,"Sheet4",0,0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login/");
		LoginPage l=new LoginPage(driver);
		HomePage h= new HomePage(driver);
		SettingsPage s= new SettingsPage(driver);
		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		h.profile();
		s.Set();
		driver.close();
		
		

}
}
