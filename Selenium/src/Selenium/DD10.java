package Selenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD10
{
		public static void main(String[] args)
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.facebook.com/r.php");
					WebElement ele=driver.findElement(By.id("month"));
					Select s=new Select(ele);
					ArrayList<String>l1=new ArrayList<String>();
					List<WebElement>opt=s.getOptions();
					int count=opt.size();
					System.out.println(count);
					for(WebElement w:opt)
					{
						String t=w.getText();
						l1.add(t);
						l1.remove("sep");
					}
					Collections.sort(l1);
					for(String l2:l1)
					{
						System.out.println(l2);
					}
					
				}
}
				
				


