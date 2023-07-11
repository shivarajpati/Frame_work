package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3
	{
		public static void main(String[] args) throws InterruptedException
		{
			String key="webdriver.gecko.driver";
			String value="./software/geckoedriver.exe";
			System.setProperty(key,value);
			FirefoxDriver driver = new FirefoxDriver();
			Thread.sleep(2000);
			driver.quit();
			driver.close();
		}

	}

