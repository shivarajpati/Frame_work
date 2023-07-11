package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9
{
		public static void main(String[] args) 
				{
					System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.navigate().to("https://facebook.com/");
					Dimension d=new Dimension(300,400);
					driver.manage().window().setSize(d);
					
					
					
}
}