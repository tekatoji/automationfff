package GTB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addons {
	public void GTBaddons(WebDriver driver) {
		
		//Utils.delayWebdriver10s(20000);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(".//*[@id='526206']/div[3]/div/a")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("da click 1");
	
		driver.findElement(By.xpath(".//*[@id='full-detail-526206']/div/div[2]/div/div[3]/div/div[2]/button")).click();
		
		System.out.println("da click 2");
		
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath(".//*[@id='popupProduct526206']/div[1]")).click();
		
		
		System.out.println("da click 3");
				
				
//		driver.findElement(By.xpath(".//*[@id='526210']/div[3]/div/a")).click();
//		driver.findElement(By.xpath(".//*[@id='full-detail-526210']/div/div[2]/div/div[3]/div/div[2]/button")).click();
		
//		driver.findElement(By.xpath(".//*[@id='780']/div[3]/div[2]/button")).click();
		
	
		
		driver.findElement(By.xpath(".//*[@id='post-524144']/div[4]/div/div[2]/div/div/button")).click();
		
//		driver.findElement(By.xpath(".//*[@id='check']")).click();
		
		
		System.out.println("da click 4");
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath(".//*[@id='charged']/div/a")).click();
		
		System.out.println("da click 5"); 
		
		//*[@id="charged"]/div/a
		//*[@id="charged"]/div/button
		
		// skip and continue to survey
		// driver.findElement(By.xpath(".//*[@id='post-524144']/div[2]/div[1]/div/p[3]")).click();
		// Return to Purchase
		// driver.findElement(By.xpath(".//*[@id="warning"]/div/a")).click();
		// I understand, I pass
		// driver.findElement(By.xpath(".//*[@id="no_i_pass"]")).click();
		
		
	}

}
