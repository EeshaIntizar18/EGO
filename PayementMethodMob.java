import org.openqa.selenium.By;

public class PayementMethodMob extends Parent {
	public void billingMobile() throws Exception {
		try {
			// Clicking on continue to Payment method Button
			driver.findElement(By.xpath("//span[text()='CONTINUE TO PAYMENT SECURELY']")).click();
			Thread.sleep(2000);
			
			// Scrolling Down
			js.executeScript("window.scrollBy(0,550)", "");
			Thread.sleep(2000);
			
			System.out.println("Payement method for mob,Pass");
			
			
			//Write Report
			wr.writeReport("Payment Method for mob,Passed");
		} catch (Exception e) {
			System.out.println("Payment Method for mob,Fail");
			driver.quit();
			Thread.sleep(1000);
			
			//ScreenRecoder
			ScreenRecorderUtil.stopRecord();
			
			//Write Report
			wr.writeReport("Payment Method for mob,Failed");
			wr.writeReport("******");
		}
	}
}
