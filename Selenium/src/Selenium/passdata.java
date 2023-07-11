package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passdata 
{
	public static void main(String[] args) throws InterruptedException
						{
							System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
							WebDriver driver = new ChromeDriver();
							driver.get("file:///C:/Users/hp/Desktop/pass%20value.html");
							Thread.sleep(2000);
							//driver.findElement(By.tagName("input")).sendKeys("selenium");
							//driver.findElement(By.id("a1")).sendKeys("selenium");
							//driver.findElement(By.name("n1")).sendKeys("selenium");
							driver.findElement(By.className("c1")).sendKeys("selenium");
						}
		}




