package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD2
{
		public static void main(String[] args)
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("file:///C:/Users/hp/Desktop/f.html");
					WebElement ele=driver.findElement(By.id("marruti hotel"));
					Select s=new Select(ele);
					boolean b=s.isMultiple();
					if(b)
					{
						System.out.println("multiselect DD");
					}
					else
					{
						System.out.println("not a multiselect DD");
					}	
					}
					
					
				}
				
				


