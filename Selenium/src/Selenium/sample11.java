package Selenium;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample11
{
		public static void main(String[] args) 
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.navigate().to("https://facebook.com/");
					driver.manage().deleteAllCookies();
					
					
}
}