package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Scripts.BasePage;

public class Login_page extends BasePage
{
@FindBy(id="email")
private WebElement unField;
@FindBy(id="pass")
private WebElement PwdField;
@FindBy(name="Login")
private WebElement LoginBtn;

public Login_page (WebDriver driver)
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
public void clickbtn()
{
		LoginBtn.click();
	}
}


