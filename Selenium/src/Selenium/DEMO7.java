package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO7
{
	public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				String title=driver.getTitle();
				System.out.println(title);
				if(title.equals("facebook"))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
				String url=driver.getCurrentUrl();
				System.out.println(url);
				if(url.equals("https://www.facebook.com/"))
				{
					System.out.println("url is matching");
				}
				else
				{
					System.out.println("url is not matching");
				}
			}
}

	
