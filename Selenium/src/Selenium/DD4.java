package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD4
{
		public static void main(String[] args)
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com/r.php");
					WebElement ele=driver.findElement(By.id("year"));
					Select s=new Select(ele);
					List<WebElement>opt=s.getOptions();
					int count=opt.size();
					System.out.println(count);
					for(WebElement w:opt)
					{
						String t=w.getText();
						System.out.println(t);
					}
					
				}
}
				
				


