package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbloginusingXpath
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("shivarajp224@gmail.com");
		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("Shivu@1992");
		driver.findElement(By.xpath("//button[@ name='login']")).click();
	}
	

}
