package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Form
{
	@FindBy(id="name")
	private WebElement unFirstField;
	@FindBy(id="name")
	private WebElement unLastField;
	@FindBy(id="email")
	private WebElement unField;
	@FindBy(id="Gender")
	private WebElement radiobutton;
	@FindBy(id="number")
	private WebElement MobileNumber;
	@FindBy(id="DOB")
	private WebElement DOBradiobtn;
	@FindBy(id="subject")
	private WebElement subfield;
	@FindBy(id="name")
	private WebElement radiobutton1;
	@FindBy(id="picture")
	private WebElement picturetab;
	@FindBy(id="current address")
	private WebElement currentaddressfield ;
	@FindBy(id="name")
	private WebElement statedropdown1;
	@FindBy(id="name")
	private WebElement citydropdown;
	@FindBy(name="Submit")
	private WebElement SubmitBtn;
	public Register_Form(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void PassunFirst(String unFirst)
	{
		unFirstField.sendKeys(unFirst);	
	}
	public void PassunLastField1(String unLast)
	{
		 unLastField.sendKeys( unLast);
	}
	public void Passun(String un)
	{
		unField.sendKeys(un);	
	}
	public void Passradiobutton(String radio)
	{
		 radiobutton.sendKeys(radio);
	}
	public void Passnumber(String MobileNumber1)
	{
		MobileNumber.sendKeys(MobileNumber1);	
	}
	public void PassDOB1(String DOB)
	{
		 DOBradiobtn.sendKeys(DOB);
	}
	public void Passsubfield(String subfield)
	{
		unFirstField.sendKeys(subfield);	
	}

	public void btn()
	{
			SubmitBtn.click();
		}
}
