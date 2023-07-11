package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample16

{
		public static void main(String[] args) throws InterruptedException
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("file:///C:/Users/hp/Desktop/b.html");
					Thread.sleep(2000);
					List<WebElement>cbox=driver.findElements(By.xpath("//input"));
					int count =cbox.size();
					System.out.println(count);
					for(int i=0; i<count;i++)
					{
						WebElement w=cbox.get(i);
						w.click();
						Thread.sleep(1000);
					}
					
				}
						
}
					
					
					
					
					
					
