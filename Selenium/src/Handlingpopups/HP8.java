package Handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HP8 
{
	
				public static void main(String[] args) throws AWTException
						{
							System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
							WebDriver driver = new ChromeDriver();
							driver.get("http://www.google.com/");
							WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
							Actions act=new Actions(driver);
							act.contextClick(ele).perform();
							Robot r=new Robot();
							r.keyPress(KeyEvent.VK_T);
							r.keyRelease(KeyEvent.VK_T);
							Set<String>allwh=driver.getWindowHandles();
							for(String wh:allwh)
							{
								driver.switchTo().window(wh);
							}
		}
						
						






}
