package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD1
{
		public static void main(String[] args) throws InterruptedException
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("file:///C:/Users/hp/Desktop/f.html");
					Thread.sleep(2000);
					WebElement ele=driver.findElement(By.id("marruti hotel"));
					Select s=new Select(ele);
					s.selectByIndex(1);
					Thread.sleep(2000);
					s.selectByValue("b");
					Thread.sleep(2000);
					s.selectByVisibleText("chicken kabab");
					Thread.sleep(2000);
					s.deselectAll();
					
					
				}
				
				}


