package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Survey5 {
	public void GTBSurvey5 (WebDriver driver) {
		
		Utils.delayWebdriver10s(10000);
		
//		How did you hear about FabFitFun? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_1\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_2\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_3\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_4\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_5\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_6\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_7\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_8\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_9\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_11\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_12\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_13\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_14\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_15\"]")).click();
		driver.findElement(By.xpath(".//*[@id=\"choice_32_21_16\"]")).click();
		
		
//		Anything else we should know about you that could help us deliver the best FabFitFun experience possible? Let us know below!
		
		WebElement anythingelse = driver.findElement(By.xpath(".//*[@id=\"input_32_32\"]"));
		anythingelse.sendKeys("Anything else we should know about you that could help us deliver the best FabFitFun experience possible? Let us know below!");
		
		
		driver.findElement(By.xpath(".//*[@id=\"gform_submit_button_32\"]")).click();
		
		System.out.println("click next survey 5");
		
	}

}
