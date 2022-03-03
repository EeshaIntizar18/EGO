import org.openqa.selenium.By;

public class PaymentMethodDesk extends Parent {
	public void billing() throws Exception {
		try {
			// Clicking on continue to Payment method Button
			driver.findElement(By.xpath("//span[text()='CONTINUE TO PAYMENT SECURELY']")).click();
			Thread.sleep(2000);

			// Scrolling Down
			js.executeScript("window.scrollBy(0,550)", "");
			Thread.sleep(2000);
			
			System.out.println("Payment method for desk,Pass");
			
			
			//Write Report
			wr.writeReport("Payment Method for desk ,Passed");
		} catch (Exception e) {
			System.out.println("Billing for Desk,Fail");
			driver.quit();
			Thread.sleep(1000);
			
			//ScreenRecoder
			ScreenRecorderUtil.stopRecord();
			
			//Write Report
			wr.writeReport("Payment Method for desk ,Failed");
			wr.writeReport("******");
		}
	}
}
