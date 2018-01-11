package GTB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping {
	public void GTBShipping (WebDriver driver) {
		
		Utils.delayWebdriver10s(20000);
		
		WebElement shipfirstname = driver.findElement(By.xpath(".//*[@id='ship_first_name']"));
		shipfirstname.sendKeys("dang seasonal");
		
		WebElement shiplastname = driver.findElement(By.xpath(".//*[@id='ship_last_name']"));
		shiplastname.sendKeys("tran");
		
		WebElement shipstreetaddress = driver.findElement(By.xpath(".//*[@id='ship_address1']"));
		shipstreetaddress.sendKeys("street address");
		
		WebElement shipaptsuiteroom = driver.findElement(By.xpath(".//*[@id='ship_address2']"));
		shipaptsuiteroom.sendKeys("apt suite room");
		
		WebElement shipcity = driver.findElement(By.xpath(".//*[@id='ship_city']"));
		shipcity.sendKeys("Chicago");
		
		WebElement shippostalcode = driver.findElement(By.xpath(".//*[@id='ship_zipcode']"));
		shippostalcode.sendKeys("11111");
		
		WebElement shipphone = driver.findElement(By.xpath(".//*[@id='ship_phone']"));
		shipphone.sendKeys("1111111111");
		
		driver.findElement(By.xpath(".//*[@id='place_order']")).click();
		
	}
	

}
