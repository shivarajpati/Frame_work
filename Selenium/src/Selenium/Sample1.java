package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
		public static void main(String[] args) throws InterruptedException
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("file:///C:/Users/hp/Desktop/a.html");
					WebElement ele=driver.findElement(By.id("a1"));
					boolean b=ele.isDisplayed();
					if(b)
					{
						System.out.println("element displyed");
					}
			
					else
					{
						System.out.println("element  not displyed");
					}
				}
}
