package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaxpath 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@ name='username']")).sendKeys("shivarajp224@gmail.com");
		driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("Shivu@1992");
		driver.findElement(By.xpath("//button[@ type='submit']")).click();
	}
	

}
