package Reporting_Tools;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log2 {
	@Test
	public void test2() throws IOException
	{
		Layout lay=new PatternLayout("%d %c %m %n");
		Appender App=new FileAppender(lay,"./reports/l1.log");
		BasicConfigurator.configure(App);
		Logger Log=Logger.getLogger(this.getClass().getName());
		Log.error("error");
		Log.fatal("fatal");
		Log.info("info");
	}

}

