package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDCAction
{
			public static void main(String[] args)
					{
						System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						driver.get("http://demo.guru99.com/test/simple_context_menu.html");
						WebElement ele=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
						Actions act=new Actions(driver);
						act.doubleClick(ele).perform();				
						}
	}
					
					





