package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Punter3
{
		public static void main(String[] args) throws InterruptedException
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.amazon.com/");
					Thread.sleep(1000);
					List<WebElement>links=driver.findElements(By.xpath("//a"));
					int count =links.size();
					System.out.println(count);
					for(int i=0; i<count;i++)
					{
					WebElement w=links.get(i);
					String y=w.getAttribute("href");
					
				}
				
				}
}

