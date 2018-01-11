package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Survey2 {
	public void GTBSurvey2(WebDriver driver) {
		
		Utils.delayWebdriver10s(10000);
		
		// How often do you WANT to work out?
		driver.findElement(By.xpath(".//*[@id='choice_32_22_0']")).click();
		// OR
		// driver.findElement(By.xpath(".//*[@id='choice_32_22_1']")).click();
		// driver.findElement(By.xpath(".//*[@id='choice_32_22_2']")).click();
		// driver.findElement(By.xpath(".//*[@id='choice_32_22_3']")).click();
		// driver.findElement(By.xpath(".//*[@id='choice_32_22_4']")).click();
		// driver.findElement(By.xpath(".//*[@id='choice_32_22_5']")).click();
		
		// What types of workouts are you interested in? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id='choice_32_24_1']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_2']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_3']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_4']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_5']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_6']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_7']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_8']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_24_9']")).click();
		
		
		driver.findElement(By.xpath(".//*[@id=\"gform_next_button_32_26\"]")).click();

		
	}

}
