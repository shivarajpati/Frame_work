package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4
{
		public static void main(String[] args) 
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://facebook.com/");
					WebElement ele=driver.findElement(By.xpath("//a[@ title='Marathi']"));
					org.openqa.selenium.Point locn=ele.getLocation();
					System.out.println(locn);
					int x=locn.getX();
					System.out.println(x);
					int y=locn.getY();
					System.out.println(y);
				}
}


