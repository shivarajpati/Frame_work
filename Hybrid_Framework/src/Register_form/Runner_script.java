package Register_form;

import org.testng.annotations.Test;

public class Runner_script extends Generic_script
{
@Test
public void Runn()
{
	Pom_script p=new Pom_script(driver);
	p.first1("SHIVU");
	p.last1("Patil");
	p.email1("shivarajmkk@gmail.com");
	p.number1("9916869850");
	p.subject1("Electrical");
	p.hobby1();
	p.picture1("C:\\Users\\hp\\Pictures\\Screenshots");
	p.address1("Raichur");
}
}