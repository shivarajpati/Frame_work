package Runner_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_Script.Login_page;

public class Runner_class {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Login_page p=new Login_page(driver);
		p.PassUN("admin");
		p.PassPwd("manager");
		p.clickbtn();
	}
	
}



