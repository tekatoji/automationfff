package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Seasonal {
	public void GTBseasonal(WebDriver driver) {
		driver.get("https://staging.fabfitfun.com");
		driver.findElement(By.xpath("//a[@href='/get-the-box?step=getbox']")).click();
			
		driver.manage().window().maximize(); 
		
//		Maximize
//			 Dimension size = new Dimension(1024, 768);
//			 driver.manage().window().setSize(size);
			
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//driver.findElement(By.xpath("/html/body/div[9]/div/form/div[1]/button[2]")).click();
	
		driver.findElement(By.xpath(".//*[@id='menu-item-586']/a")).click();
		driver.findElement(By.xpath(".//*[@id='recurly_form']/div[2]/div[1]/div[2]/div[1]")).click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(Utils.USERNAME);
		WebElement createpass = driver.findElement(By.id("password"));
		createpass.sendKeys(Utils.PASSWORD);
		
		driver.findElement(By.xpath(".//*[@id='ship_country']/option[1]")).click();
		driver.findElement(By.xpath(".//*[@id=\"ship_state\"]/option[2]")).click();
		
		WebElement billfirstname = driver.findElement(By.id("bill_first_name"));
		billfirstname.sendKeys("dang seasonal");
		WebElement billlastname = driver.findElement(By.id("bill_last_name"));
		billlastname.sendKeys("tran");
		

		
		WebElement creditcard = driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id=\"recurly-number\"]/div/iframe")))
			    .findElement(By.xpath(".//*[@id='recurly-hosted-field-input']"));
		creditcard.sendKeys("4111111111111111");
		
		driver.switchTo().defaultContent();
		WebElement creditmonth = driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id=\"recurly-month\"]/div/iframe")))
			    .findElement(By.xpath(".//*[@id='recurly-hosted-field-input']"));
		creditmonth.sendKeys("01");
		
		driver.switchTo().defaultContent();
		WebElement credityear = driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id=\"recurly-year\"]/div/iframe")))
			    .findElement(By.xpath(".//*[@id='recurly-hosted-field-input']"));
		credityear.sendKeys("2020");
		
		driver.switchTo().defaultContent();
		WebElement creditcvv = driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id=\"recurly-cvv\"]/div/iframe")))
			    .findElement(By.xpath(".//*[@id='recurly-hosted-field-input']"));
		creditcvv.sendKeys("111");
		
		driver.switchTo().defaultContent();
		WebElement billpostalcode = driver.findElement(By.xpath(".//*[@id='bill_postal_code']"));
		billpostalcode.sendKeys("11111");
		
		
		
		// Promo code
		//WebElement coupontext = driver.findElement(By.id("coupontext"));
		//billlastname.sendKeys("11111");
		
		driver.findElement(By.xpath(".//*[@id='recurly_form']/div[3]/button")).click();
		
		
		//Select dropdown
		//Select dropdown = new Select(driver.findElement(By.xpath("//select")));
		
		
	}
}
