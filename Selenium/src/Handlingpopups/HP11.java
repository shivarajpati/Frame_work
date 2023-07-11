package Handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HP11
{

	public static void main(String[] args) throws InterruptedException, AWTException
			{
				System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.selenium.dev/");
				WebElement ele1=driver.findElement(By.xpath("//span[.='Downloads']"));
				WebElement ele2=driver.findElement(By.xpath("//span[.='Documentation']"));
				WebElement ele3=driver.findElement(By.xpath("//span[.='Projects']"));
				WebElement ele4=driver.findElement(By.xpath("//span[.='Support']"));
				WebElement ele5=driver.findElement(By.xpath("//span[.='Blog']"));
				ArrayList<WebElement> l1=new ArrayList<WebElement>();
				l1.add(ele1);
				l1.add(ele2);
				l1.add(ele3);
				l1.add(ele4);
				l1.add(ele5);
				Actions act=new Actions(driver);
				Robot r=new Robot();
				for(Object l2:l1)
				{
					act.contextClick((WebElement)l2).perform();
					r.keyPress(KeyEvent.VK_T);
					r.keyRelease(KeyEvent.VK_T);
					}
}
			}

	