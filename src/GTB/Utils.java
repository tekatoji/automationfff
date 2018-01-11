package GTB;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Utils {

	public static final String USERNAME = "dang.tran"+ThreadLocalRandom.current().nextInt(0,9999)+"@fabfitfun.com";
	
//	public static void randomusername() 
//	String root1="dang.tran"+ThreadLocalRandom.current().nextInt(0,9999)+"@fabfitfun.com";
	
	public static final String PASSWORD = "123456";

	public static void delayWebdriver10s (int timesencond) {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	try {
		Thread.sleep(timesencond);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
}
