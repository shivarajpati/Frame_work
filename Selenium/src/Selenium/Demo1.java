package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1
	{
		public static void main(String[] args)
		{
			String key="webdriver.gecko.driver";
			String value="./software/geckoedriver.exe";
			System.setProperty(key,value);
			FirefoxDriver driver = new FirefoxDriver();
		}

	}

