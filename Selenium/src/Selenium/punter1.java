package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class punter1
{
		public static void main(String[] args) throws InterruptedException
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("file:///C:/Users/hp/Desktop/h.html");
					Thread.sleep(1000);
					List<WebElement>textfield=driver.findElements(By.xpath("//input"));
					int count =textfield.size();
					System.out.println(count);
					for(WebElement we: textfield)
					{
						we.sendKeys("hello");
					}

						for(int i=count-1; i>=0;i--)
					{
						WebElement w=textfield.get(i);
						w.clear();
						Thread.sleep(2000);
					}
				}
				
				}

