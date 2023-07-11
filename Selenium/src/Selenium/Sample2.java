package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2
{
		public static void main(String[] args) 
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://facebook.com/");
					WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
					String att=ele.getAttribute("href");
					System.out.println(att);
				}
}
