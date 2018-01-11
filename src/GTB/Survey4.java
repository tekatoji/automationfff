package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Survey4 {
	public void GTBSurvey4 (WebDriver driver) {
		
		Utils.delayWebdriver10s(10000);
		
//		What is your birthday?
		driver.findElement(By.xpath(".//*[@id=\"input_32_1_1\"]/option[5]")).click();
		driver.findElement(By.xpath(".//*[@id=\"input_32_1_2\"]/option[3]")).click();
		driver.findElement(By.xpath(".//*[@id=\"input_32_1_3\"]/option[35]")).click();

//		What is your relationship status?
		driver.findElement(By.xpath(".//*[@id=\"choice_32_3_1\"]")).click();
		
//		Do you have children?
		driver.findElement(By.xpath(".//*[@id=\"choice_32_4_0\"]")).click();
		
//		What is your shirt size?
		driver.findElement(By.xpath(".//*[@id=\"input_32_33\"]/option[6]")).click();
		
//		What is your dress size? (US Size)
		driver.findElement(By.xpath(".//*[@id=\"input_32_34\"]/option[5]")).click();
		
//		What is your jean waist? (inches)
		driver.findElement(By.xpath(".//*[@id=\"input_32_35\"]/option[9]")).click();
		
//		What is your shoe size? (US Women's)
		driver.findElement(By.xpath(".//*[@id=\"input_32_36\"]/option[5]")).click();
		
//		What is your ring size?
		driver.findElement(By.xpath(".//*[@id=\"input_32_37\"]/option[6]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id=\"gform_next_button_32_31\"]")).click();
		
		System.out.println("click next survey 4");
	}

}
