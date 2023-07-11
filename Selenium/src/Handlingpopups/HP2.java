package Handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HP2
{

	public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.redbus.com/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@ id = 'onward_cal']")).click();
				driver.findElement(By.xpath("(//td[.='3']")).click();
				
			}
	}
