package Handlingpopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HP10
{

	public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://skpatro.github.io/demo/links/");
				Thread.sleep(2000);
				driver.findElement(By.name("NewWindow")).click();
				String p_id=driver.getWindowHandle();
				Set<String>allwh=driver.getWindowHandles();
				int C1=allwh.size();
				System.out.println(C1);
				allwh.remove(p_id);
				int C2=allwh.size();
				System.out.println(C2);
				for(String wh:allwh)
				{
					driver.switchTo().window(wh);
					String title =driver.getTitle();
					System.out.println(title);
					if(title.equals("page not found qavalidation"))
					{
					driver.close();
				}
				
			}
			}

}