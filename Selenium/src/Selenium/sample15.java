package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample15 
{
		public static void main(String[] args) throws InterruptedException
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("file:///C:/Users/hp/Desktop/w.html");
					WebElement ele=driver.findElement(By.id("a1"));
					Thread.sleep(3000);
					ele.sendKeys(Keys.CONTROL+"a");
					Thread.sleep(1500);
					ele.sendKeys(Keys.ENTER);
					
					
				}
}
