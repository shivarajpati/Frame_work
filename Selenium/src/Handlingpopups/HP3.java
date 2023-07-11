package Handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HP3
{

	public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/hp/Desktop/n.html");
				Thread.sleep(2000);
				WebElement ele=driver.findElement(By.name("upload file"));
				ele.sendKeys("C:\\Users\\hp\\Desktop\\passsbook.jpeg");
				
			}
	}
