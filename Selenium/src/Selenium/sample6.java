package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6
{
		public static void main(String[] args) 
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://facebook.com/");
					WebElement ele=driver.findElement(By.id("pass"));
					int h=ele.getSize().getHeight();
					System.out.println(h);
					int w=ele.getSize().getWidth();
					System.out.println(w);
}
}
