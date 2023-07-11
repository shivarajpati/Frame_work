package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8
{
		public static void main(String[] args) throws InterruptedException 
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.navigate().to("https://facebook.com/");
					driver.navigate().to("https://google.com/");
					Thread.sleep(3000);
					driver.navigate().back();
					driver.navigate().forward();
					driver.navigate().refresh();
					
					
					
					
}
}