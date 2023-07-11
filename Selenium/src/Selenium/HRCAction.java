package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HRCAction
{
			public static void main(String[] args)
					{
						System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						driver.get("http://demo.guru99.com/test/simple_context_menu.html");
						WebElement ele=driver.findElement(By.xpath("//span[.='right click me']"));
						Actions act=new Actions(driver);
						act.contextClick(ele).perform();
						driver.close();
						}
	}
					
					





