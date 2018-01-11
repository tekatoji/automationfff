package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Customizeyourbox {
	
	public void GTBCustomizeyourbox (WebDriver driver) {
		
		Utils.delayWebdriver10s(20000);
		
		System.out.println("start wait step 5");
		
		driver.findElement(By.xpath(".//*[@id=\"post-526700\"]/div[2]/div/div/div[2]/a")).click();
		
		System.out.println("done step 5");
		
	}

}
