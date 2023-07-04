package Generic_Scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_Script.Login_page;

public class Test_Script extends Base_Test 
{
@Test(dataProvider="testdata")
public void test1(String d1,String d2)throws InterruptedException
{
	Login_page l=new Login_page(driver);
	l.PassUN(d1);
	l.PassPwd(d2);
	Thread.sleep(3000);
	l.clickbtn();
	Assert.fail();
}
@DataProvider(name="testdata")
public Object[][]createData1(){
	return new Object[][] {
		{"Shivaraj","1992"},
		{"Rachayya","2023"}
	};
}
}