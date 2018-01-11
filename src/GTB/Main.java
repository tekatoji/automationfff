package GTB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Main {
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/Users/Dang/Documents/geckodriver");
//		FirefoxProfile customProfile = new FirefoxProfile();
		
//		customProfile.setPreference("dom.disable_beforeunload", true);
		
		System.setProperty("webdriver.chrome.driver","/Users/Dang/Documents/chromedriver234");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		Seasonal runpage1 = new Seasonal();
		runpage1.GTBseasonal(driver);
		
		Shipping runpage2 = new Shipping();
		runpage2.GTBShipping(driver);
		
		Addons runpage3 = new Addons();
		runpage3.GTBaddons(driver);
		
//		Survey1 2 3 4 5 6
		Survey1 runpage4 = new Survey1();
		runpage4.GTBSurvey1(driver);
		
		Survey2 runpage5 = new Survey2();
		runpage5.GTBSurvey2(driver);
		
		Survey3 runpage6 = new Survey3();
		runpage6.GTBSurvey3(driver);
		
		Survey4 runpage7 = new Survey4();
		runpage7.GTBSurvey4(driver);
		
		Survey5 runpage8 = new Survey5();
		runpage8.GTBSurvey5(driver);
		
		Survey6 runpage9 = new Survey6();
		runpage9.GTBSurvey6(driver);
		
	}

}
