 package Reporting_Tools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log1 {
	@Test
	public void test1()
	{
		BasicConfigurator.configure();
		Logger Log=Logger.getLogger(this.getClass().getName());
		Log.error("error");
		Log.fatal("fatal");
		Log.info("info");
	}

}
