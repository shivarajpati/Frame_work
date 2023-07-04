package Generic_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Generic1 extends BasePage {
	@FindBy(id="email")
	private WebElement unField;
	@FindBy(id="pass")
	private WebElement PwdField;
	@FindBy(name="Login")
	private WebElement LoginBtn;
	public Generic1(WebDriver driver)
	{
		super(driver);
	}
	public void PassUN(String un)
	{
	unField.sendKeys(un);	
	}
	public void PassPwd(String Pwd)
	{
		unField.sendKeys(Pwd);
	}
	public void btn()
	{
			LoginBtn.click();
		}
}
