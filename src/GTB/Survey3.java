package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Survey3 {
	public void GTBSurvey3(WebDriver driver) {
		
		Utils.delayWebdriver10s(10000);
		
		// How would you describe your skin? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id='choice_32_27_1']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_2']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_3']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_4']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_5']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_6']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_7']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_27_8']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_27_9']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_27_11']")).click();

		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// What is your skin tone?
		driver.findElement(By.xpath(".//*[@id='choice_32_29_0']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_29_1']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_29_2']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_29_3']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_29_4']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_29_5']")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// How would you describe your hair? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id='choice_32_28_1']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_2']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_3']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_4']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_5']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_6']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_7']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_28_8']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_9']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_11']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_12']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_13']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_14']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_15']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_28_16']")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// What kind of beauty products are you most excited to receive in your box? (Check all that apply)
		driver.findElement(By.xpath(".//*[@id='choice_32_30_1']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_30_2']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_30_3']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_30_4']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_30_5']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_30_6']")).click();
		driver.findElement(By.xpath(".//*[@id='choice_32_30_7']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_8']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_9']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_11']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_12']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_13']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_14']")).click();
//		driver.findElement(By.xpath(".//*[@id='choice_32_30_15']")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" doi 10s survey 3");
		
		driver.findElement(By.xpath(".//*[@id=\"gform_next_button_32_16\"]")).click();
		
		System.out.println("click next survey 3");
		
		// Previous 
		// driver.findElement(By.xpath(".//*[@id='gform_previous_button_32_16']")).click();
		
	
		
		
	}

}
