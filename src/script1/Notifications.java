package script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_Consant;
import generics.Excel;
import pom1.LoginPage;
import pom1.NotificationsPage;

public class Notifications implements Auto_Consant {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public Notifications(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		String us = Excel.Details(excelpath,"Sheet1",1,0);
		String pass = Excel.Details(excelpath,"Sheet1",0,1);
		//String name=Excel.Details(excelpath,"Sheet2",0,0);
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login/");
		LoginPage l=new LoginPage(driver);
		NotificationsPage n = new NotificationsPage(driver);
		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		n.notificationsb();
		driver.close();

}
}
