package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2
{
	public static void main(String[] args)
		{
			String key="webdriver.chrome.driver";
			String value="./software/chromedriver.exe";
			System.setProperty(key,value);
			ChromeDriver driver = new ChromeDriver();	
			String key1="webdriver.gecko.driver";
			String value1="./software/geckoedriver.exe";
			System.setProperty(key1,value1);
			FirefoxDriver driver1 = new FirefoxDriver();
					}

				}


			
			
			
