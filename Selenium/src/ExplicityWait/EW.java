package ExplicityWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EW
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/"); 
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
	driver.findElement(By.xpath("//a[@ class='desktop-submit']")).click();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleContains("Shoes"));
	driver.findElement(By.xpath("(//div[@ class='product-productMetaInfo'])[1]")).click();
	}
}
