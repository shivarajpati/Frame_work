package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.name("email")).sendKeys("shivarajp224@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Shivu@1992");
	driver.findElement(By.name("login")).click();
}
}
	