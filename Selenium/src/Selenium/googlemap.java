package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googlemap.com");
		driver.findElement(By.xpath("//im[@ class='eYqqWd']")).click();
		driver.findElement(By.xpath("//input[@ class='tactile-searchbox-input']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@ class='tactile-searchbox-input']")).sendKeys("mysore");
	}

}
