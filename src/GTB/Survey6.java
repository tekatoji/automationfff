package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Survey6 {
	
public void GTBSurvey6 (WebDriver driver) {
		
		Utils.delayWebdriver10s(10000);
	
		JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
		scrolldown.executeScript("scroll(0, 250);");
		
//		Oops! We no longer have box choices available for this box
//		driver.findElement(By.xpath(".//*[@id='post-526700']/div[2]/div/div/div[2]/a")).click();
		
		
//		Customize Your First Box!
//		Customize Now
//		driver.findElement(By.xpath(".//*[@id=\"post-526700\"]/div[3]/div/div/div[2]/a[1]")).click();
		
		
//		No thanks, surprise me!
		driver.findElement(By.xpath(".//*[@id=\"post-526700\"]/div[4]/div/div/div[2]/a[2]")).click();

//		Are you sure you want to skip customizing your box and keep it a surprise?
//		Never mind
//		driver.findElement(By.xpath(".//*[@id=surpriseModal]/div/div[2]/button")).click();
//		I'm sure, skip
		driver.findElement(By.xpath(".//*[@id=\"surpriseModal\"]/div/div[2]/a")).click();
		
		
		System.out.println("click next survey 6");
		
		Utils.delayWebdriver10s(10000);
		
//		check success
		driver.findElement(By.xpath(".//*[@id='profileAvatarPhotoHeader']")).click();
		
		System.out.println("Success");
	
	}
}
