package Register_form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script 
{
	@FindBy(id="firstName")
	private WebElement first;
	
	@FindBy(id="lastName")
	private WebElement last;
	
	@FindBy(id="usermail")
	private WebElement email;
	
	@FindBy(id="gender-radio-1")
	private WebElement gender;
	
	@FindBy(id="userNumber")
	private WebElement number;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement doB;
	
	@FindBy(id="subjectsWrapper")
	private WebElement subjects;
	
	@FindBy(id="hobbiesWrapper")
	private WebElement hobby;
	
	@FindBy(id="uploadPicture")
	private WebElement picture;
	
	@FindBy(id="currentAddress-wrapper")
	private WebElement address;
	
	public  Pom_script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void first1(String un)
	{
		first.sendKeys(un);	
	}
	public void last1(String mn)
	{
		last.sendKeys(mn);	
	}
	
	public void email1(String em)
	{
		 email.sendKeys(em);
	}
	public void gender1()
	{
		gender.click();
	}
	public void number1(String no)
	{
		number.sendKeys(no);
	}
	public void subject1(String nm)
	{
		subjects.sendKeys(nm);
	}
	public void hobby1()
	{
		hobby.click();
	}
	public void picture1(String pc)
	{
		picture.click();
	}
	public void address1(String ad)
	{
		address.sendKeys(ad);
	}
	}