package Runner_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_Script.Register_Form;

public class runnerscript {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Register_Form r=new Register_Form(driver);
		r.PassunFirst("shivaraj");
		r.PassunLastField1("manager");
		r.Passun("shivaraj@gmail.com");
		r.Passradiobutton("Male");
		r.Passnumber("9916869850");
		r.PassDOB1("ddmmyyyy");
		r.Passsubfield("admin");
		r.btn();
	}
	
}

