package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Survey1 {
	public void GTBSurvey1(WebDriver driver) {

		System.out.println("start doi 20s");
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done doi 20s");
		
		JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
		scrolldown.executeScript("scroll(0, 250);");
		
		
//		Scroll up:
//
//			jse.executeScript("window.scrollBy(0,-250)", "");
//			OR,
//			jse.executeScript("scroll(0, -250);");
		
		
		// Haircare
//		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[1]/td[2]")).click();
		
		System.out.println("click radio 1");
		
		// Skincare
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[2]/td[3]")).click();
		// Makeup
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[3]/td[4]")).click();
		// Fitness
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[4]/td[5]")).click();
		// Wellness
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[5]/td[2]")).click();
		// Skincare
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[6]/td[3]")).click();
		// Bracelets/Cuffs
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[7]/td[4]")).click();
		// Rings
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[8]/td[5]")).click();
		// Earrings
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[9]/td[2]")).click();
		// Bags, Clutches, totes
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[10]/td[3]")).click();
		// Other Fashion accessories
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[11]/td[4]")).click();
		// Tech accessories
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[12]/td[5]")).click();
		// Home
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[13]/td[2]")).click();
		// Cooking
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[14]/td[3]")).click();
		// Snacks
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[15]/td[4]")).click();
		// DIY/Crafts
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[16]/td[5]")).click();
		// Productivity & Career
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[17]/td[4]")).click();
		// Organization
		driver.findElement(By.xpath(".//*[@id='input_32_13']/tbody/tr[18]/td[5]")).click();
		
		WebElement creditcard = driver.findElement(By.id("input_32_15"));
		creditcard.sendKeys("What other types of products (if not listed above)...");
		
		// What kind of scents do you prefer? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_1\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_2\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_3\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_4\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_5\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_6\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_19_7\"]")).click();
		
		// What color do you like for jewelry? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id=\"choice_32_18_1\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_18_2\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_18_3\"]")).click();

		// Process to Dashboard
		//driver.findElement(By.xpath(".//*[@id=\"timeUp\"]/div/a")).click();

		driver.findElement(By.xpath(".//*[@id=\"gform_next_button_32_14\"]")).click();
		
	}

}
