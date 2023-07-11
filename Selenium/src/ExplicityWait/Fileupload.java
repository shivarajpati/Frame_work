package ExplicityWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileupload {
public static void main(String[] args)throws InterruptedException
{
	//ChromeOptions options=new ChromeOptions();
	//options.addArguments("disabled-notification");
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://easymytrip.com/");
	
	
}
}

